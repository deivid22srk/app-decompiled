#!/usr/bin/env python3
# rename_clashing_packages.py — resolve pares classe/pacote obfuscados homônimos
# move o PACOTE <n>/ para <n>pkg/ e reescreve referências:
#   - package statements do próprio pacote (e subpacotes)
#   - FQN de membros: <parent>.<n>.<token> onde <token> é arquivo/dir do pacote
#   - imports curinga: import <parent>.<n>.*;
# refs da CLASSE (import curto, FQN nu, chamadas estáticas) ficam intactas
import os
import re
import sys

SRC = sys.argv[1] if len(sys.argv) > 1 else '/home/z/my-project/repo-build/app/src/main/java'

# 1) acha pares: dir D/ com .java E arquivo irmão D.java
pairs = []
for root, dirs, files in os.walk(SRC):
    for d in dirs:
        dirpath = os.path.join(root, d)
        classfile = os.path.join(root, d + '.java')
        if os.path.isfile(classfile):
            has_java = any(f.endswith('.java') for f in os.listdir(dirpath)) or \
                       any(os.path.isdir(os.path.join(dirpath, x)) for x in os.listdir(dirpath))
            if has_java:
                pkg_parent = os.path.relpath(root, SRC).replace(os.sep, '.')
                if pkg_parent == '.':
                    pkg_parent = ''
                pairs.append((pkg_parent, d, dirpath))

# mais profundo primeiro: filhos renomeados antes dos pais (pais os carregam ao mover)
pairs.sort(key=lambda t: -t[2].count(os.sep))

print('[*] %d par(es) classe/pacote em conflito:' % len(pairs))
for parent, n, dirpath in pairs:
    print('    class %s.%s  <->  package %s.%s' % (parent, n, parent, n))

def all_java_files():
    out = []
    for root, dirs, files in os.walk(SRC):
        for f in files:
            if f.endswith('.java'):
                out.append(os.path.join(root, f))
    return out

java_files = all_java_files()
contents = {p: open(p, encoding='utf-8').read() for p in java_files}

for parent, n, dirpath in pairs:
    newname = n + 'pkg'
    parent_fqn = (parent + '.' if parent else '')
    old_fqn_prefix = parent_fqn + n + '.'
    new_fqn_prefix = parent_fqn + newname + '.'

    # arquivo da classe conflitante do par MAIS PROFUNDO: D/n.java (package P.n, class n)
    # só existe conflito real se D/n/ (dir do par mais profundo) também existe
    clash_class_file = os.path.join(dirpath, n + '.java')
    has_deeper = os.path.isdir(os.path.join(dirpath, n))
    if not has_deeper:
        clash_class_file = None  # n.java é membro normal do pacote

    # membros do pacote: arquivos .java cujo package statement == este pacote
    # (exclui a classe conflitante que vive no mesmo dir com package do PAI)
    # + todos os subdirs (subpacotes)
    members = set()
    for entry in os.listdir(dirpath):
        full = os.path.join(dirpath, entry)
        if os.path.isdir(full):
            members.add(entry)
        elif entry.endswith('.java') and full != clash_class_file:
            try:
                head = open(full, encoding='utf-8', errors='ignore').read(200)
            except OSError:
                continue
            m = re.search(r'package\s+([\w.]+)\s*;', head)
            if m and m.group(1) == (parent_fqn + n):
                members.add(entry[:-5])
    print('[*] %s.%s -> %s (%d membros)' % (parent_fqn, n, newname, len(members)))

    member_alt = '|'.join(re.escape(m) for m in sorted(members, key=len, reverse=True))
    member_re = re.compile(r'\b' + re.escape(old_fqn_prefix) + r'(' + member_alt + r')\b')

    changed = 0
    for p, data in contents.items():
        orig = data
        is_clash_class = (p == clash_class_file)
        if not is_clash_class:
            # package statements (próprio pacote e subpacotes)
            data = data.replace('package ' + old_fqn_prefix, 'package ' + new_fqn_prefix)
            data = data.replace('package ' + parent_fqn + n + ';', 'package ' + parent_fqn + newname + ';')
        # wildcard imports
        data = data.replace('import ' + old_fqn_prefix + '*;', 'import ' + new_fqn_prefix + '*;')
        # refs a membros via FQN
        data = member_re.sub(new_fqn_prefix + r'\1', data)
        if data != orig:
            contents[p] = data
            changed += 1
    print('    %d arquivo(s) reescrito(s)' % changed)

    # move o diretório (se ainda existir no caminho original — filhos podem tê-lo movido)
    newpath = os.path.join(os.path.dirname(dirpath), newname)
    if os.path.isdir(dirpath):
        os.rename(dirpath, newpath)
    else:
        print('    [!] dir já movido: %s' % dirpath)
    # re-key: arquivos movidos mantêm o conteúdo EM MEMÓRIA (reescrito), não o do disco
    moved = {}
    if os.path.isdir(newpath):
        for root, dirs, files in os.walk(newpath):
            for f in files:
                if f.endswith('.java'):
                    np = os.path.join(root, f)
                    rel = os.path.relpath(np, newpath)
                    oldp = os.path.join(dirpath, rel)
                    moved[np] = contents.get(oldp) or open(np, encoding='utf-8').read()
    contents = {p: d for p, d in contents.items() if os.path.isfile(p)}
    contents.update(moved)

for p, data in contents.items():
    open(p, 'w', encoding='utf-8').write(data)
print('[*] renome concluído')
