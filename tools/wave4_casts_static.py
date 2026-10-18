#!/usr/bin/env python3
# wave4_casts_static.py — onda 4:
#  A) okio2.class -> okio2.b.class
#  B) kt/kr: casts espúrios (kt<R>)/(kr<R,A>) em chamadas diretas
#  C) mo.java: cast via raw para captura de curinga
#  D) dd.java + googlehelp c.java: remove cast bogus (com.google.android.gms.common.api.m) new X
#  E) "non-static variable super" -> remove `static` do método contenedor
import os, re

SRC = '/home/z/my-project/repo-build/app/src/main/java'
LOG = '/home/z/my-project/work/javac-fresh.log'
P = lambda *a: os.path.join(SRC, *a)

def rw(path, *pairs):
    text = open(path, encoding='utf-8').read()
    orig = text
    for old, new in pairs:
        text = text.replace(old, new)
    if text != orig:
        open(path, 'w', encoding='utf-8').write(text)
        return True
    return False

# A) okio2.class
n = 1 if rw(P('okio2/a.java'), ('okio2.class', 'okio2.b.class')) else 0
print('[A] okio2.class ->', n)

# B) kt/kr casts
kt = P('com/google/android/gms/internal/kt.java')
n += 1 if rw(kt,
    ('c((kt<R>) r);', 'c(r);'),
    ('a((kt<R>) a(status));', 'a(a(status));'),
    ('a((kt<R>) a(Status.e));', 'a(a(Status.e));')) else 0
kr = P('com/google/android/gms/internal/kr.java')
n += 1 if rw(kr,
    ('a((kr<R, A>) a(status));', 'a(a(status));'),
    ('a((kr<R, A>) a2);', 'a(a2);')) else 0
print('[B] kt/kr casts ->', n)

# C) mo.java raw cast
mo = P('com/google/android/gms/internal/mo.java')
n += 1 if rw(mo,
    ('uVar = (com.google.android.gms.common.api.u<R>) this.f6170a.a();',
     'uVar = (com.google.android.gms.common.api.u<R>) (com.google.android.gms.common.api.u) this.f6170a.a();')) else 0
print('[C] mo.java raw cast ->', n)

# D) casts bogus em dd/googlehelp
dd = P('com/google/android/gms/wearable/internal/dd.java')
text = open(dd, encoding='utf-8').read()
cnt = text.count('mVar.a((com.google.android.gms.common.api.m) new ')
text = text.replace('mVar.a((com.google.android.gms.common.api.m) new ', 'mVar.a(new ')
open(dd, 'w', encoding='utf-8').write(text)
gh = P('com/google/android/gms/googlehelp/internal/common/c.java')
text = open(gh, encoding='utf-8').read()
cnt2 = text.count('mVar.a((com.google.android.gms.common.api.m) new ')
text = text.replace('mVar.a((com.google.android.gms.common.api.m) new ', 'mVar.a(new ')
open(gh, 'w', encoding='utf-8').write(text)
print('[D] casts removidos dd:', cnt, '| googlehelp:', cnt2)

# E) non-static variable super -> remove static do método
lines = open(LOG, encoding='utf-8', errors='replace').read().split('\n')
targets = {}
for i, line in enumerate(lines):
    m = re.match(r'^(\S+\.java):(\d+): error: non-static variable super', line)
    if m:
        targets.setdefault(m.group(1), []).append(int(m.group(2)))
nE = 0
for path, lns in targets.items():
    ls = open(path, encoding='utf-8').read().split('\n')
    method_starts = set()
    for ln in lns:
        # sobe até a declaração do método contenedor
        j = ln - 1
        depth = 0
        while j >= 0:
            depth += ls[j].count('}') - ls[j].count('{')
            if depth > 0:
                break
            s = ls[j].strip()
            if re.match(r'^(?:public|protected|private)?\s*.*\bstatic\b.*\(', s) and not s.startswith('//'):
                method_starts.add(j)
                break
            j -= 1
    for j in sorted(method_starts, reverse=True):
        old = ls[j]
        new = re.sub(r'\bstatic\s+', '', old, count=1)
        if new != old:
            ls[j] = new
            nE += 1
    open(path, 'w', encoding='utf-8').write('\n'.join(ls))
print('[E] static removidos de métodos (super):', nE, '| arquivos:', len(targets))
print('onda 4 concluida')
