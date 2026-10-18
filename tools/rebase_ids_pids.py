#!/usr/bin/env python3
# rebase_ids.py — reescreve constantes 0x7fXXXXXXXX nos smalis do decode
# mapeando IDs do APK original -> IDs do APK compilado pelo aapt2 (Gradle).
# O bytecode original tem todos os IDs de recurso inlineados (sem classe R);
# o aapt2 não preserva entry-ids, então o bytecode precisa ser rebasado.
import os, re, sys, collections, subprocess

DECODE = sys.argv[1]
ORIG_APK = sys.argv[2]
BUILT_IDS = sys.argv[3]   # public-ids.txt (formato 'type/name = 0x7fxxxxxx')
AAPT = sys.argv[4]

# ---------- mapa original: nome -> id ----------
orig_dump = subprocess.run([AAPT, 'dump', 'resources', ORIG_APK], capture_output=True, text=True).stdout
orig_by_name = {}
for line in orig_dump.split('\n'):
    m = re.match(r'\s*resource 0x([0-9a-f]{8}) (?:[a-zA-Z0-9._]+:)?(\S+)/(\S+)', line)
    if m:
        k = m.group(2) + '/' + m.group(3).rstrip(':')
        if k not in orig_by_name:
            orig_by_name[k] = int(m.group(1), 16)

# ---------- mapa built: nome -> id (de public-ids.txt do aapt2 --stable-ids) ----------
# formato das linhas:  type/name = 0x7fxxxxxx
built_by_name = {}
for line in open(BUILT_IDS, encoding='utf-8'):
    m = re.match(r'\s*(\S+?)\s*=\s*0x7f([0-9a-fA-F]{6})\s*$', line)
    if m:
        built_by_name[m.group(1)] = int('7f' + m.group(2), 16)

mapping = {}
for k, oid in orig_by_name.items():
    bid = built_by_name.get(k)
    if bid is not None and bid != oid:
        mapping[oid] = bid

print(f'orig={len(orig_by_name)} built={len(built_by_name)} remapeamentos={len(mapping)}')
missing = [k for k in orig_by_name if k not in built_by_name]
if missing:
    print('sem equivalente no built (mantidos):', len(missing), missing[:5])

# tabela: orig_id -> built_id (somente os que mudaram)
RE_ID = re.compile(r'^(\s*(const/(?:16|4|high16)|const)\s+([vp]\d+),\s*)0x7f([0-9a-f]{6})(.*)$')
# valores brutos em .array-data (payload de fill-array) e literais .field :I
RE_RAW = re.compile(r'^(\s*)(-?(?:0[xX][0-9a-fA-F]+|\d+))\s*$')
RE_FIELD = re.compile(r'^(\.field\s+public\s+static\s+final\s+\w+:I\s*=\s*)(-?(?:0[xX][0-9a-fA-F]+|\d+))\s*$')

def parse_int(s):
    s = s.strip()
    neg = s.startswith('-')
    if neg:
        s = s[1:]
    v = int(s, 16) if s.lower().startswith('0x') else int(s)
    if neg:
        v = (1 << 32) - v if v else 0
        v &= 0xFFFFFFFF
    return v

def fmt_id(v):
    return '0x%08x' % v

total, changed = 0, 0
files_touched = 0
for sub in ('smali', 'smali_classes2'):
    root = os.path.join(DECODE, sub)
    for dirpath, dirs, files in os.walk(root):
        for fn in files:
            if not fn.endswith('.smali'):
                continue
            path = os.path.join(dirpath, fn)
            with open(path, encoding='utf-8', errors='replace') as f:
                lines = f.readlines()
            touched = False
            in_array_data = False
            for i, ln in enumerate(lines):
                s = ln.rstrip('\n')
                # contexto: dentro de .array-data
                if s.strip().startswith('.array-data'):
                    in_array_data = True
                    continue
                if s.strip().startswith('.end array-data'):
                    in_array_data = False
                    continue
                bid = None
                m = RE_ID.match(s)
                if m:
                    total += 1
                    oid = int('0x7f' + m.group(4), 16)
                    v = mapping.get(oid)
                    if v is not None:
                        prefix, opc, reg, _, rest = m.groups()
                        if opc.endswith('/high16'):
                            if v & 0xFFFF == 0:
                                newln = '%s0x%04x%s' % (prefix, v >> 16, rest)
                            else:
                                # high16 nao comporta low16 != 0 -> vira const completo
                                newln = '%s%s%s' % (
                                    prefix.replace('/high16', ''), fmt_id(v), rest)
                        else:
                            newln = prefix + fmt_id(v) + rest
                        lines[i] = newln.rstrip('\n') + '\n'
                        changed += 1
                        touched = True
                    continue
                if in_array_data:
                    m = RE_RAW.match(s)
                    if m:
                        total += 1
                        v = parse_int(m.group(2))
                        nv = mapping.get(v)
                        if nv is not None:
                            lines[i] = m.group(1) + fmt_id(nv) + '\n'
                            changed += 1
                            touched = True
                    continue
                m = RE_FIELD.match(s)
                if m:
                    total += 1
                    v = parse_int(m.group(2))
                    nv = mapping.get(v)
                    if nv is not None:
                        lines[i] = m.group(1) + fmt_id(nv) + '\n'
                        changed += 1
                        touched = True
            if touched:
                with open(path, 'w', encoding='utf-8') as f:
                    f.writelines(lines)
                files_touched += 1

print(f'const 0x7f encontradas: {total} | rebasadas: {changed} | arquivos: {files_touched}')
