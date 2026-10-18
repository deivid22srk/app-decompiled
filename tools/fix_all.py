#!/usr/bin/env python3
# fix_all.py — patcher abrangente pós-restore do branch com/a + fixes globais
import os
import re

SRC = '/home/z/my-project/repo-build/app/src/main/java'
SM = ['/home/z/my-project/work/apktool-decoded/smali',
      '/home/z/my-project/work/apktool-decoded/smali_classes2']

def load(p):
    return open(os.path.join(SRC, p), encoding='utf-8').read()

def save(p, d):
    open(os.path.join(SRC, p), 'w', encoding='utf-8').write(d)

def walk(src_sub=''):
    for root, dirs, files in os.walk(os.path.join(SRC, src_sub)):
        for f in files:
            if f.endswith('.java'):
                yield os.path.join(root, f)

# ============ 1) import android.R falso -> remove + framework attrs ============
pub = open('/home/z/my-project/work/apktool-decoded/res/values/public.xml', encoding='utf-8').read()
app_attrs = set(re.findall(r'<public type="attr" name="([\w.]+)"', pub))
n = 0
for p in list(walk()):
    d = open(p, encoding='utf-8').read()
    if 'import android.R;' in d:
        d = d.replace('import android.R;\n', '')
        d = re.sub(r'R\.attr\.([\w.]+)', lambda m: 'R.attr.' + m.group(1) if m.group(1) in app_attrs else 'android.R.attr.' + m.group(1), d)
        open(p, 'w', encoding='utf-8').write(d)
        n += 1
print('[1] import android.R removido em %d' % n)

# ============ 2) aA2: classe Address renomeada + bare a refs no pacote com.a.a ============
p = os.path.join(SRC, 'com/a/a/a.java')
d = open(p, encoding='utf-8').read()
d = d.replace('public final class a {', 'public final class aA2 {')
d = re.sub(r'public a\(String', 'public aA2(String', d)
open(p, 'w', encoding='utf-8').write(d)
os.rename(p, os.path.join(SRC, 'com/a/a/aA2.java'))
n = 0
# arquivos do PACOTE com.a.a (dir com/a/a direto): bare a (type-position) -> aA2
for p in walk('com/a/a'):
    if os.path.dirname(p) != os.path.join(SRC, 'com/a/a'):
        continue
    d = open(p, encoding='utf-8').read()
    orig = d
    d = re.sub(r'(?<![\w.])a(?=\s+[a-z]\w*\s*[,;)])', 'aA2', d)     # params: (a aVar,
    d = re.sub(r'(?<![\w.])a(?=\s+[a-z]\w*\s*\))', 'aA2', d)        # return/cast: a a(
    d = re.sub(r'(?<![\w.])a(?=\s+f\d+\b)', 'aA2', d)               # fields: a f884a
    d = re.sub(r'(?<![\w.])a(?=\.\)', 'aA2', d) if False else d
    d = re.sub(r'new a\(', 'new aA2(', d)
    d = re.sub(r'\(a\)', '(aA2)', d)
    if d != orig:
        open(p, 'w', encoding='utf-8').write(d)
        n += 1
print('[2] bare a -> aA2 em %d arquivo(s) do pacote com.a.a' % n)

# ============ 3) censo com/a/a/**: a.<sym> top-level vs mesmo-pacote ============
changed = 0
for p in walk('com/a/a'):
    rel = os.path.relpath(p, SRC)
    data = open(p, encoding='utf-8').read()
    syms = sorted(set(re.findall(r'(?<![\w.])a\.([a-z])\b', data)))
    if not syms:
        continue
    segs = [s[:-3] if s.endswith('pkg') and s != 'pkg' else s for s in rel.split(os.sep)]
    own_pkg = '.'.join(s for s in rel.replace('\\', '/').split('/')[:-1])
    own_path = '/'.join(s[:-3] if s.endswith('pkg') and s != 'pkg' else s for s in rel.replace('\\', '/').split('/')[:-1])
    census = {}
    for sd in SM:
        sp = os.path.join(sd, own_path, segs[-1][:-5] + '.smali')
        if not os.path.isfile(sp):
            continue
        sd_data = open(sp, encoding='utf-8', errors='ignore').read()
        for sym in syms:
            for fqn in re.findall(r'L([a-zA-Z0-9/]*)/' + sym + r';', sd_data):
                census.setdefault(sym, set()).add(fqn)
    if not census:
        continue
    imports = set()
    orig = data
    for sym, fqns in census.items():
        top = 'a' in fqns
        own = own_path in fqns
        own_fqn = own_pkg + '.' + sym
        S = re.escape(sym)
        # top-level (La/sym;): a.sym -> okio2.sym (pacote renomeado, imune a sombra)
        # mesmo-pacote: bare sym fica como está (resolve no próprio pacote)
        if top:
            S2 = re.escape(sym)
            data = re.sub(r'(?<![\w."])a\.' + S2 + r'\b', 'okio2.' + sym, data)
    if data != orig:
        if imports:
            imp = ''.join('import a.%s;\n' % s for s in sorted(imports))
            data = re.sub(r'(package [\w.]+;\n)', r'\1\n' + imp, data, count=1)
        seen = set()
        out = []
        for l in data.splitlines(keepends=True):
            k = l.strip()
            if k.startswith('import ') and k in seen:
                continue
            if k.startswith('import '):
                seen.add(k)
            out.append(l)
        data = ''.join(out)
        open(p, 'w', encoding='utf-8').write(data)
        changed += 1
print('[3] censo a.* aplicado em %d arquivo(s)' % changed)

# ============ 4) al.java:294 param mistypado long -> a.j ============
p = os.path.join(SRC, 'com/a/a/apkg/bpkg/al.java')
d = open(p, encoding='utf-8').read()
d = d.replace('public final void a(int i, long j) {', 'public final void a(int i, a.j jVar) {')
save('com/a/a/apkg/bpkg/al.java', d)
print('[4] al.java param corrigido')

# ============ 5) nano/a.java: campo int e sombreia classe e ============
p = 'com/google/protobuf/nano/a.java'
d = load(p)
d = re.sub(r'(?<![\w.])e\.(a|b|h)\(', r'com.google.protobuf.nano.e.\1(', d)
d = re.sub(r'(?<![\w.])e\.h\b', 'com.google.protobuf.nano.e.h', d)
save(p, d)
print('[5] nano/a.java ok')

# ============ 6) casts o<> bofados ============
for p in ['com/deivid22srk/store/VendingBackupAgent.java',
          'com/google/android/finsky/api/n.java',
          'com/google/android/finsky/dpkg/d.java']:
    d = load(p)
    d = re.sub(r'\((?:com\.google\.android\.finsky\.)?o<[^>]*>\) ', '', d)
    save(p, d)
print('[6] casts o<> removidos')

# ============ 7) GCM: new Object[1][0] = X; ============
p = 'com/deivid22srk/store/GCMIntentService.java'
d = load(p)
d = re.sub(r'new Object\[1\]\[0\] = ([^;]+);', r'Object[] objArr = new Object[1];\n        objArr[0] = \1;', d)
save(p, d)
print('[7] GCM ok')

# ============ 8) o.java estático corrupto ============
p = 'com/a/a/o.java'
d = load(p)
d = d.replace('Object[] objArr = 0;', 'Object[] objArr = null;')
d = d.replace('Object[] objArr2 = 0;', 'Object[] objArr2 = null;')
d = d.replace('c = new p(objArr2 == true ? 1 : 0, objArr == true ? 1 : 0).a();',
              'c = new p(objArr2 != null, (byte) (objArr != null ? 1 : 0)).a();')
save(p, d)
print('[8] o.java ok')

# ============ 9) h.java:13 ctor 1-arg ============
p = 'com/a/a/h.java'
d = load(p)
d = d.replace('new h(new i(), 0)', 'new h(new i())')
save(p, d)
print('[9] h.java ok')

# ============ 10) y.java casts genéricos ============
p = 'com/google/android/finsky/api/model/y.java'
d = load(p)
d = d.replace('b((y<T, D>) t)', 'b(t)')
d = d.replace('c((y<T, D>) t)', 'c(t)')
save(p, d)
print('[10] y.java ok')

# ============ 11) pontes sintéticas conflitantes ============
def drop_method(path, needle):
    src = open(os.path.join(SRC, path), encoding='utf-8').read().splitlines(keepends=True)
    for idx, l in enumerate(src):
        if needle in l:
            depth = 0
            started = False
            end = idx
            for k in range(idx, min(idx + 40, len(src))):
                depth += src[k].count('{') - src[k].count('}')
                if '{' in src[k]:
                    started = True
                if started and depth == 0:
                    end = k
                    break
            del src[idx:end + 1]
            open(os.path.join(SRC, path), 'w', encoding='utf-8').writelines(src)
            return True
    return False

drop_method('com/android/volley/l.java', 'public /* synthetic */ int compareTo(Object obj)')
drop_method('com/google/android/finsky/api/model/i.java', '/* synthetic */ Document[] b(Object obj)')
drop_method('com/google/android/finsky/api/model/i.java', '/* bridge */ /* synthetic */ String c(Object obj)')
print('[11] pontes removidas')

# ============ 12) play/image/e.java membros públicos ============
p = 'com/google/android/play/image/e.java'
d = load(p)
d = re.sub(r'(?m)^    (private|protected) ', '    public ', d)
save(p, d)
print('[12] play/image/e.java ok')

# ============ 13) finsky/apkg/i.java g -> FQN da classe ============
p = 'com/google/android/finsky/apkg/i.java'
d = load(p)
d = re.sub(r'(?<![\w.])g\.a\(\)', 'com.google.android.finsky.apkg.g.a()', d)
save(p, d)
print('[13] finsky/apkg/i.java ok')

# ============ 14) membros públicos: a/ top-level (interfaces já públicas) ============
n = 0
for p in walk('a'):
    d = open(p, encoding='utf-8').read()
    orig = d
    d = re.sub(r'(?m)^(class|interface|final class|abstract class) ', r'public \1 ', d)
    if d != orig:
        open(p, 'w', encoding='utf-8').write(d)
        n += 1
print('[14] classes top-level a/ publicadas: %d' % n)
