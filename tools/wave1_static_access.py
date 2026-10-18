#!/usr/bin/env python3
# wave1_static_access.py — onda 1 de fixes javac a partir de javac-fresh.log:
#  A) "modifier static not allowed here" -> adiciona `static` na classe interna envolvente
#  B) "X has private access in Y"       -> widen private -> public no membro X da classe Y
#  C) "method ... not override ..."     -> remove @Override acima do metodo
import os, re, sys, collections

SRC = '/home/z/my-project/repo-build/app/src/main/java'
LOG = '/home/z/my-project/work/javac-fresh.log'

def parse_errors():
    errs = []
    cur_file, cur_line = None, None
    for line in open(LOG, encoding='utf-8', errors='replace'):
        m = re.match(r'^(\S+\.java):(\d+): error: (.*)$', line.rstrip('\n'))
        if m:
            cur_file, cur_line, msg = m.group(1), int(m.group(2)), m.group(3)
            errs.append((cur_file, cur_line, msg))
    return errs

errs = parse_errors()
print('erros no log:', len(errs))

# ---------------- A) static not allowed ----------------
# padrao real: jadx gerou classe TOP-LEVEL com modificador `static` (era aninhada no dex)
# fix: remover `static` da propria linha do erro
def fix_static_not_allowed(errs):
    n, skip = 0, 0
    for path, ln_no, msg in errs:
        if 'modifier static not allowed here' not in msg:
            continue
        try:
            lines = open(path, encoding='utf-8').read().split('\n')
        except OSError:
            continue
        idx = ln_no - 1
        if idx >= len(lines):
            skip += 1
            continue
        line = lines[idx]
        if 'static' not in line:
            skip += 1
            continue
        new = re.sub(r'\bstatic\s+', '', line, count=1)
        lines[idx] = new
        open(path, 'w', encoding='utf-8').write('\n'.join(lines))
        n += 1
    print('[A] static removido de top-level class: %d (skip: %d)' % (n, skip))

# ---------------- B) private access ----------------
FIELD_RE = re.compile(r'private\s+(?:(?:final|static|transient|volatile)\s+)*[\w<>\[\].,?\s]+?\s+(\w+)\s*(?:=|;)')
METHOD_RE = re.compile(r'private\s+(?:final\s+|static\s+)*[\w<>\[\].,?\s]+?\s+(\w+)\s*\(')

def widen_in_file(path, member):
    try:
        text = open(path, encoding='utf-8').read()
    except OSError:
        return False
    lines = text.split('\n')
    changed = False
    for i, ln in enumerate(lines):
        stripped = ln.lstrip()
        if not stripped.startswith('private'):
            continue
        if re.match(r'^private\s+(?:(?:final|static|transient|volatile)\s+)*[\w<>\[\].,?\s]+?\s+%s\s*(?:=|;|\()' % re.escape(member), stripped):
            lines[i] = ln.replace('private', 'public', 1)
            changed = True
    if changed:
        open(path, 'w', encoding='utf-8').write('\n'.join(lines))
    return changed

def fix_private_access(errs):
    same_pkg, cross, fail = 0, 0, 0
    for path, ln_no, msg in errs:
        m = re.search(r'(\w+) has private access in ([\w.]+)', msg)
        if not m:
            continue
        member, cls = m.group(1), m.group(2)
        pkg = os.path.dirname(os.path.relpath(path, SRC))
        # 1) mesmo pacote: procura arquivo da classe Y
        cls_file = os.path.join(SRC, pkg, cls + '.java')
        if os.path.exists(cls_file) and widen_in_file(cls_file, member):
            same_pkg += 1
            continue
        # 2) classe interna Y dentro de algum arquivo do mesmo pacote
        hit = False
        pkg_dir = os.path.join(SRC, pkg)
        for f in os.listdir(pkg_dir) if os.path.isdir(pkg_dir) else []:
            if not f.endswith('.java'):
                continue
            fp = os.path.join(pkg_dir, f)
            txt = open(fp, encoding='utf-8', errors='replace').read()
            if re.search(r'(?:class|interface|enum)\s+%s\b' % re.escape(cls), txt):
                if widen_in_file(fp, member):
                    cross += 1
                    hit = True
                    break
        if not hit:
            fail += 1
            print('  [B-fail] %s:%d %s' % (os.path.relpath(path, SRC), ln_no, msg[:70]))
    print('[B] widen same-pkg file: %d | inner-class: %d | falhas: %d' % (same_pkg, cross, fail))

# ---------------- C) @Override invalido ----------------
def fix_override(errs):
    n = 0
    done = set()
    for path, ln_no, msg in errs:
        if 'not override or implement' not in msg:
            continue
        key = (path, ln_no)
        if key in done:
            continue
        done.add(key)
        lines = open(path, encoding='utf-8').read().split('\n')
        idx = ln_no - 1
        # sobe ate achar @Override imediatamente acima
        j = idx - 1
        while j >= 0 and lines[j].strip() == '':
            j -= 1
        if j >= 0 and '@Override' in lines[j]:
            del lines[j]
            n += 1
            open(path, 'w', encoding='utf-8').write('\n'.join(lines))
    print('[C] @Override removidos: %d' % n)

# ---------------- main ----------------
fix_static_not_allowed(errs)
fix_private_access(errs)
fix_override(errs)
print('onda 1 concluida')
