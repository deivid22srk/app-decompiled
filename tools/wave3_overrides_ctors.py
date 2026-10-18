#!/usr/bin/env python3
# wave3_overrides_ctors.py — onda 3:
#  A) dedup @Override empilhados + @Override não-aplicável
#  B) família kt: retorno de a(Status) = tipo R do extends (11 arquivos)
#  C) família mj: inserir stub a(Object) (5 arquivos wearable)
#  D) privilégios de acesso mais fracos -> público
#  E) View subclasses sem construtor -> inserir ctor
#  F) h.java add(Object) -> add(Map.Entry<K,V>)
#  G) gson b.java -> ab.java (renome de arquivo)
#  H) aA2.java instanceof/cast do renome antigo
import os, re

SRC = '/home/z/my-project/repo-build/app/src/main/java'
LOG = '/home/z/my-project/work/javac-fresh.log'
P = lambda *a: os.path.join(SRC, *a)

def lines_of(path):
    return open(path, encoding='utf-8').read().split('\n')

def save(path, ls):
    open(path, 'w', encoding='utf-8').write('\n'.join(ls))

# ---------- A) @Override empilhado / não aplicável ----------
nA = 0
for root, dirs, files in os.walk(SRC):
    for fn in files:
        if not fn.endswith('.java'):
            continue
        path = os.path.join(root, fn)
        ls = lines_of(path)
        changed = False
        out = []
        prev_override_idx = None
        for ln in ls:
            s = ln.strip()
            if s.startswith('@Override'):
                if prev_override_idx is not None:
                    out[prev_override_idx] = None  # remove o anterior, fica o atual
                    nA += 1
                    changed = True
                prev_override_idx = len(out)
            else:
                if s and not s.startswith(('//', '/*', '*')):
                    prev_override_idx = None
            out.append(ln)
        if changed and any(x is None for x in out):
            ls = [x for x in out if x is not None]
            save(path, ls)
print('[A] @Override empilhados removidos:', nA)

# remover @Override não aplicável (linha marcada no log)
ls = lines_of(P('com/google/android/vending/verifier/apkg/i.java'))
for i, ln in enumerate(ls):
    if ln.strip().startswith('@Override') and i < 14:
        ls[i] = ''
        save(P('com/google/android/vending/verifier/apkg/i.java'), ls)
        print('[A2] @Override não aplicável removido em verifier/i.java')
        break

# ---------- B) família kt: retorno a(Status) ----------
KT_FILES = {
    'com/google/android/gms/wearable/internal/dg.java': ('dg', 26),
    'com/google/android/gms/wearable/internal/ba.java': ('ba', 33),
    'com/google/android/gms/wearable/internal/di.java': ('di', 31),
    'com/google/android/gms/wearable/internal/df.java': ('df', 30),
    'com/google/android/gms/wearable/internal/de.java': ('de', 80),
    'com/google/android/gms/wearable/internal/dh.java': ('dh', 33),
    'com/google/android/gms/internal/ou.java': ('ou', 32),
    'com/google/android/gms/internal/oe.java': ('oe', 24),
    'com/google/android/gms/internal/kg.java': ('kg', 25),
    'com/google/android/gms/internal/ow.java': ('ow', 39),
    'com/google/android/gms/internal/pu.java': ('pu', 25),
}
nB = 0
for rel, (cls, ln_no) in KT_FILES.items():
    path = P(*rel.split('/'))
    ls = lines_of(path)
    # extrai o argumento R do extends
    rtype = None
    for ln in ls:
        m = re.search(r'class\s+%s\b[^{]*extends\s+[\w.]+<(.+?)>\s*(?:implements[^{]*)?\{' % cls, ln)
        if m:
            rtype = m.group(1).strip()
            break
    if rtype is None:
        m2 = re.search(r'class\s+%s\b[^{]*extends\s+([\w.]+)\s*(?:implements[^{]*)?\{' % cls, '\n'.join(ls))
        print('[B] sem generic em', rel, '->', m2.group(1) if m2 else '??')
        continue
    idx = ln_no - 1
    old = ls[idx]
    # substitui o tipo de retorno com.google.android.gms.common.api.x (ou x) pelo R
    new = re.sub(r'public\s+(?:final\s+)?(?:/\* synthetic \*/\s*)?com\.google\.android\.gms\.common\.api\.x\s+a\(Status',
                 'public final %s a(Status' % rtype, old)
    if new == old:
        new = re.sub(r'public\s+final\s+/\* synthetic \*/\s*\S+\s+a\(Status', 'public final %s a(Status' % rtype, old)
    if new != old:
        ls[idx] = new
        save(path, ls)
        nB += 1
    else:
        print('[B] FALHOU', rel, ln_no, '|', old.strip()[:80])
print('[B] retornos a(Status) corrigidos:', nB)

# ---------- C) família mj: stub a(Object) ----------
nC = 0
for rel in ['cm', 'cd', 'ck', 'ce', 'cf']:
    path = P('com/google/android/gms/wearable/internal/%s.java' % rel)
    ls = lines_of(path)
    if any('a(Object' in l for l in ls):
        continue
    # insere após o metodo a() existente
    stub = None
    for i, ln in enumerate(ls):
        if 'public final void a()' in ln:
            # acha o fim do metodo (chave de fechamento no mesmo nível)
            j = i
            depth = 0
            while j < len(ls):
                depth += ls[j].count('{') - ls[j].count('}')
                if j > i and depth == 0:
                    break
                j += 1
            stub = j + 1
            break
    if stub:
        ls.insert(stub, '    @Override // com.google.android.gms.internal.mj\n    public final void a(Object obj) {\n    }')
        save(path, ls)
        nC += 1
    else:
        print('[C] FALHOU stub em', rel)
print('[C] stubs a(Object) inseridos:', nC)

# ---------- D) privilégios mais fracos ----------
path = P('com/google/android/gms/internal/an.java')
ls = lines_of(path)
old = ls[177]
ls[177] = old.replace('protected final int a()', 'public final int a()')
if ls[177] != old:
    save(path, ls)
    print('[D] an.java protected->public')
else:
    print('[D] an.java VERIFICAR:', old.strip()[:60])

# ---------- E) View subclasses sem construtor ----------
def insert_after_class_open(path, cls, ctor_code):
    ls = lines_of(path)
    for i, ln in enumerate(ls):
        if re.search(r'(?:class|interface)\s+%s\b[^{]*\{' % cls, ln):
            # se a chave abre na mesma linha, insere após
            ls.insert(i + 1, ctor_code)
            save(path, ls)
            return True
        # chave pode estar na próxima linha
        if re.search(r'(?:class|interface)\s+%s\b' % cls, ln):
            j = i
            while j < len(ls) and '{' not in ls[j]:
                j += 1
            ls.insert(j + 1, ctor_code)
            save(path, ls)
            return True
    return False

ctors = [
    ('com/google/android/gms/ads/e.java', 'e', '    public e(android.content.Context context) {\n        super(context);\n        this.f5279a = null;\n    }'),
    ('com/google/android/gms/ads/dpkg/a.java', 'a', '    public a(android.content.Context context) {\n        super(context);\n        this.f5278a = null;\n    }'),
    ('com/google/android/gms/ads/apkg/c.java', 'c', '    public c(android.content.Context context) {\n        super(context);\n        this.f5255a = null;\n    }'),
    ('com/google/android/gms/ads/internal/overlay/k.java', 'k', '    protected k() {\n        super((android.content.Context) null);\n    }'),
]
nE = 0
for rel, cls, code in ctors:
    if insert_after_class_open(P(*rel.split('/')), cls, code):
        nE += 1
    else:
        print('[E] FALHOU ctor em', rel)
print('[E] construtores inseridos:', nE)

# ---------- F) h.java add ----------
path = P('android/support/v4/h/h.java')
text = open(path, encoding='utf-8').read()
new = text.replace('public final /* synthetic */ boolean add(Object obj) {\n            throw new UnsupportedOperationException();',
                   'public final boolean add(Map.Entry<K, V> entry) {\n            throw new UnsupportedOperationException();')
if new != text:
    save(path, new.split('\n'))
    print('[F] h.java add corrigido')
else:
    print('[F] h.java VERIFICAR manualmente')

# ---------- G) gson b.java -> ab.java ----------
old_p, new_p = P('com/google/gson/bpkg/b.java'), P('com/google/gson/bpkg/ab.java')
if os.path.exists(old_p) and not os.path.exists(new_p):
    os.rename(old_p, new_p)
    print('[G] gson b.java renomeado -> ab.java')
else:
    print('[G] gson renomear VERIFICAR:', os.path.exists(old_p), os.path.exists(new_p))

# ---------- H) aA2.java ----------
path = P('com/a/a/aA2.java')
text = open(path, encoding='utf-8').read()
new = text.replace('instanceof a)', 'instanceof aA2)').replace('a aVar = (aA2) obj;', 'aA2 aVar = (aA2) obj;')
if new != text:
    save(path, new.split('\n'))
    print('[H] aA2.java instanceof/cast corrigidos')
else:
    print('[H] aA2.java VERIFICAR')
print('onda 3 concluida')
