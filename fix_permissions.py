#!/usr/bin/env python3
# fix_permissions.py — dedup de identificadores globais após o rename de pacote
# uso: python3 fix_permissions.py <dir_decodificado> <pacote_novo>
# renomeia declarações <permission/-group/-tree> custom e authorities de <provider>
# para o namespace do novo pacote, evitando INSTALL_FAILED_DUPLICATE_PERMISSION
# e INSTALL_FAILED_CONFLICTING_PROVIDER quando o app original já está no device
import os
import re
import sys

decoded, new_pkg = sys.argv[1], sys.argv[2]
manifest_path = os.path.join(decoded, 'AndroidManifest.xml')
xml = open(manifest_path, encoding='utf-8').read()

renames = {}

# 1) permissões DECLARADAS (só declaração colide; uses-permission não)
for m in re.finditer(r'<(permission|permission-group|permission-tree)\b[^>]*?android:name="([^"]+)"', xml):
    name = m.group(2)
    if name.startswith('android.') or name.startswith(new_pkg + '.'):
        continue
    renames[name] = new_pkg + '.permission.' + name.rsplit('.', 1)[-1]

# 2) authorities de provider (também são globalmente exclusivas no device)
for m in re.finditer(r'<provider\b[^>]*?android:authorities="([^"]+)"', xml):
    for auth in m.group(1).split(';'):
        auth = auth.strip()
        if not auth or auth.startswith(new_pkg + '.'):
            continue
        renames[auth] = new_pkg + '.authority.' + auth.rsplit('.', 1)[-1]

# nomes mais longos primeiro — evita que um nome sufixo de outro seja aplicado antes
ordered = sorted(renames.items(), key=lambda kv: -len(kv[0]))

print('[*] %d identificador(es) em colisão:' % len(ordered))
for old, new in ordered:
    print('    %s -> %s' % (old, new))

# aplica em todo arquivo de texto (manifest, smali, res) exceto original/ e build/
count = 0
for root, dirs, files in os.walk(decoded):
    dirs[:] = [d for d in dirs if d not in ('original', 'build')]
    for f in files:
        p = os.path.join(root, f)
        try:
            data = open(p, encoding='utf-8').read()
        except (UnicodeDecodeError, OSError):
            continue
        orig = data
        for old, new in ordered:
            data = data.replace(old, new)
        if data != orig:
            open(p, 'w', encoding='utf-8').write(data)
            count += 1

print('[*] %d arquivo(s) atualizado(s)' % count)
