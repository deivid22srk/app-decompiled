#!/usr/bin/env python3
# wave2_shadow_static.py — onda 2: famílias restantes de alto volume
#  A) "non-static variable this ... static context" + "enclosing instance ... required"
#     -> adiciona `static` à nested class do mesmo arquivo
#  B) requalificação de nomes sombreados (variável/parametro primitivo sombreia classe do pacote)
#     -> substitui `X.` por `pacote.X.` apenas nas linhas de erro
#  C) "package R does not exist" -> R.id/string/layout -> android.R.* no arquivo inteiro
import os, re, sys, collections

SRC = '/home/z/my-project/repo-build/app/src/main/java'
LOG = '/home/z/my-project/work/javac-fresh.log'

# ---------- parse do log com contexto ----------
records = []   # dict: file, line, msg, code, caret, sym_lines[]
lines = open(LOG, encoding='utf-8', errors='replace').read().split('\n')
for i, line in enumerate(lines):
    m = re.match(r'^(\S+\.java):(\d+): error: (.*)$', line.rstrip())
    if m:
        rec = {'file': m.group(1), 'line': int(m.group(2)), 'msg': m.group(3),
               'code': '', 'caret_col': None, 'extra': []}
        j = i + 1
        while j < len(lines) and not re.match(r'^\S+\.java:\d+:', lines[j]) and j < i + 8:
            l2 = lines[j]
            if l2.strip().startswith('^'):
                rec['caret_col'] = len(l2) - len(l2.lstrip())
            elif l2.strip().startswith(('symbol:', 'location:')):
                rec['extra'].append(l2.strip())
            elif rec['caret_col'] is None and l2.strip():
                rec['code'] = l2
            j += 1
        records.append(rec)
print('erros:', len(records))

pkg_of = lambda f: os.path.dirname(os.path.relpath(f, SRC)).replace('/', '.')

def add_static_to_class(java_path, cls_name):
    """adiciona `static` na declaracao de class cls_name (se nao tiver); True se mudou"""
    try:
        text = open(java_path, encoding='utf-8').read()
    except OSError:
        return False
    pat = re.compile(r'^(\s*)((?:public|protected|private|final|abstract|strictfp|\s)*)(class\s+%s\b[^{;]*)' % re.escape(cls_name), re.M)
    m = pat.search(text)
    if not m:
        return False
    decl = m.group(0)
    if re.search(r'\bstatic\b', decl):
        return True  # ja static, nada a fazer
    new = m.group(1) + m.group(2) + 'static ' + m.group(3)
    text = text[:m.start()] + new + text[m.end():]
    open(java_path, 'w', encoding='utf-8').write(text)
    return True

def qualify_on_line(text_lines, line_no, name, fqn):
    """nas linhas (1-based) substitui `name.` bare por `fqn.`"""
    idx = line_no - 1
    if idx >= len(text_lines):
        return False
    old = text_lines[idx]
    new = re.sub(r'(?<![\w.])%s\.' % re.escape(name), fqn + '.', old)
    if new != old:
        text_lines[idx] = new
        return True
    return False

# file -> {line_no: [records]}  para processar por arquivo uma vez
nA, nAfail, nB, nBfail, nC = 0, 0, 0, 0, 0
fails = []
files_done = {}
for rec in records:
    files_done.setdefault(rec['file'], {}).setdefault(rec['line'], []).append(rec)

for path, by_line in files_done.items():
    pkg = pkg_of(path)
    pkg_dir = os.path.dirname(path)
    need_class_static = set()   # (arquivo_alvo, classe)
    qual = []                   # (line_no, name)
    is_R_file = False
    for ln, recs in by_line.items():
        for rec in recs:
            msg, code = rec['msg'], rec['code']
            if 'non-static variable this cannot be referenced from a static context' in msg:
                m = re.search(r'new\s+(\w+)\s*\(', code)
                if m:
                    need_class_static.add((path, m.group(1)))
                else:
                    nAfail += 1; fails.append(('A?', path, ln, msg[:60]))
            elif 'an enclosing instance that contains' in msg:
                m = re.search(r'contains\s+([\w.]+)\.', msg)
                inner = m.group(1).split('.')[-1] if m else None
                outer = m.group(1).split('.')[0] if m else None
                if inner:
                    tgt = os.path.join(SRC, outer.replace('.', '/') + '.java')
                    need_class_static.add((tgt if os.path.exists(tgt) else path, inner))
                else:
                    nAfail += 1; fails.append(('A2', path, ln, msg[:60]))
            elif re.search(r'non-static variable (\w+) cannot be referenced from a static context', msg):
                name = re.search(r'non-static variable (\w+) cannot', msg).group(1)
                if name != 'this' and os.path.exists(os.path.join(pkg_dir, name + '.java')):
                    qual.append((ln, name, pkg + '.' + name))
                else:
                    nBfail += 1; fails.append(('B-staticctx', path, ln, msg[:60]))
            elif 'cannot be dereferenced' in msg and rec['caret_col'] and rec['code']:
                col = rec['caret_col'] - 1  # 0-based approx
                code0 = rec['code']
                # identificador que contem/termina perto do caret
                ids = [(mm.start(1), mm.group(1)) for mm in re.finditer(r'(?<![\w.])(\w+)\.', code0)]
                best = None
                for st, nm in ids:
                    if st <= col <= st + len(nm) + 1:
                        best = nm
                if best and os.path.exists(os.path.join(pkg_dir, best + '.java')):
                    qual.append((ln, best, pkg + '.' + best))
                else:
                    nBfail += 1; fails.append(('B-deref', path, ln, msg[:40] + ' | ' + code.strip()[:60]))
            elif 'cannot find symbol' in msg:
                loc = [e for e in rec['extra'] if e.startswith('location: variable')]
                if loc:
                    name = re.search(r'location: variable (\w+) of type', loc[0])
                    if name and os.path.exists(os.path.join(pkg_dir, name.group(1) + '.java')):
                        qual.append((ln, name.group(1), pkg + '.' + name.group(1)))
                    else:
                        nBfail += 1; fails.append(('B-cfs', path, ln, (loc[0] if loc else msg)[:70]))
            elif 'package R does not exist' in msg:
                is_R_file = True

    # aplicar A
    for tgt, cls in need_class_static:
        if add_static_to_class(tgt, cls):
            nA += 1
        else:
            nAfail += 1
            fails.append(('A-nofix', tgt, 0, cls))

    # aplicar B (por arquivo, agrupado por linha)
    if qual:
        text_lines = open(path, encoding='utf-8').read().split('\n')
        changed = False
        for ln, name, fqn in qual:
            if qualify_on_line(text_lines, ln, name, fqn):
                changed = True
                nB += 1
        if changed:
            open(path, 'w', encoding='utf-8').write('\n'.join(text_lines))

    # aplicar C
    if is_R_file:
        text = open(path, encoding='utf-8').read()
        new = re.sub(r'(?<![\w.])R\.(id|string|layout|drawable|attr|color|style)\.', r'android.R.\1.', text)
        if new != text:
            open(path, 'w', encoding='utf-8').write(new)
            nC += 1

print('[A] static adicionado a nested class: %d (falhas: %d)' % (nA, nAfail))
print('[B] requalificacoes de linha: %d (falhas: %d)' % (nB, nBfail))
print('[C] arquivos R->android.R: %d' % nC)
for f in fails[:25]:
    print('  FAIL', f)
