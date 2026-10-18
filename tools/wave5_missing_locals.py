#!/usr/bin/env python3
# wave5_missing_locals.py — onda 5: ctors perdidos pelo jadx + variáveis locais não declaradas
import os, re

SRC = '/home/z/my-project/repo-build/app/src/main/java'
P = lambda *a: os.path.join(SRC, *a)

def rw(path, fn):
    ls = open(path, encoding='utf-8').read().split('\n')
    ls2 = fn(ls)
    if ls2 is not None:
        open(path, 'w', encoding='utf-8').write('\n'.join(ls2))
        return True
    return False

# 1) ctors perdidos: cd/cj/ck/cm (wearable) — campo + ctor
ctors = [
    ('cd', 'AncsNotificationParcelable', 'ancsNotificationParcelable'),
    ('cj', 'NodeParcelable', 'nodeParcelable'),
    ('ck', 'NodeParcelable', 'nodeParcelable'),
    ('cm', 'ChannelEventParcelable', 'channelEventParcelable'),
]
for cls, typ, arg in ctors:
    path = P('com/google/android/gms/wearable/internal/%s.java' % cls)
    def fix(ls, cls=cls, typ=typ, arg=arg):
        if any(('(%s ' % typ) in l for l in ls):
            return None  # já tem ctor
        for i, l in enumerate(ls):
            if 'implements mj' in l or re.search(r'class %s\b' % cls, l):
                if '{' in l:
                    ins = i + 1
                    break
        else:
            return None
        block = [
            '    private final %s f%s;' % (typ, cls),
            '',
            '    %s(%s %s) {' % (cls, typ, arg),
            '        this.f%s = %s;' % (cls, arg),
            '    }',
        ]
        return ls[:ins] + block + ls[ins:]
    print(cls, '->', rw(path, fix))

# 2) cg.java: float r2
cg = P('com/caverock/androidsvg/cg.java')
print('cg r2 ->', rw(cg, lambda ls: [x.replace('r2 = ahVar.d != null', 'float r2 = ahVar.d != null') if 'r2 = ahVar.d != null' in x else x for x in ls]))

# 3) volley/l.java compareTo
lv = P('com/android/volley/l.java')
print('volley l obj ->', rw(lv, lambda ls: [x.replace('(l) obj;', '(l) another;') if '(l) obj;' in x else x for x in ls]))

# 4) measurement/j.java: declara e/th
jm = P('com/google/android/gms/measurement/internal/j.java')
def fix_j(ls):
    out = []
    seen_method = False
    done = False
    for l in ls:
        out.append(l)
        if 'final long a(String str) {' in l:
            seen_method = True
        elif seen_method and not done and 'Cursor cursor = null;' in l:
            out.append('        SQLiteException e;')
            out.append('        Throwable th;')
            done = True
    return out if done else None
print('j.java e/th ->', rw(jm, fix_j))

# 5) oq.java: declara IOException e
oq = P('com/google/android/gms/internal/oq.java')
def fix_oq(ls):
    for i, l in enumerate(ls):
        if 'public final gy a(jn<?> jnVar) {' in l:
            return ls[:i+1] + ['        IOException e;'] + ls[i+1:]
    return None
print('oq.java e ->', rw(oq, fix_oq))
print('onda 5 concluida')
