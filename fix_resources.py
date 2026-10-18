#!/usr/bin/env python3
# fix_resources.py — ressuscita recursos que o apktool marcou como false
# uso: python3 fix_resources.py <dir_res>
# remove <item ...>false</item> de todos values*/, cria placeholders válidos
# para cada (type,name) perdido e apaga public.xml (IDs não precisam bater)
import os
import re
import sys

res = sys.argv[1]
removed = {}  # (type,name) -> configs onde apareceu

item_re = re.compile(r'<item\b[^>]*>false</item>')
type_re = re.compile(r'type="([^"]+)"')
name_re = re.compile(r'name="([^"]+)"')

# 1) varre values* e remove itens false
for root, dirs, files in os.walk(res):
    if not os.path.basename(root).startswith('values'):
        continue
    for f in files:
        if not f.endswith('.xml'):
            continue
        p = os.path.join(root, f)
        data = open(p, encoding='utf-8').read()
        hits = item_re.findall(data)
        if not hits:
            continue
        for h in hits:
            t = type_re.search(h)
            n = name_re.search(h)
            if not t or not n:
                continue
            key = (t.group(1), n.group(1))
            removed.setdefault(key, []).append(os.path.relpath(p, res))
        data = item_re.sub('', data)
        open(p, 'w', encoding='utf-8').write(data)

print('[*] %d item(s) false removido(s)' % len(removed))

# 2) apaga public.xml (IDs não precisam bater; evita pinos órfãos no aapt2)
for root, dirs, files in os.walk(res):
    if 'public.xml' in files:
        os.remove(os.path.join(root, 'public.xml'))
        print('[*] public.xml removido: %s' % os.path.relpath(root, res))

# 3) baseline de nomes já existentes por tipo de arquivo (evita duplicar)
existing_files = set()
for root, dirs, files in os.walk(res):
    rel = os.path.relpath(root, res)
    for f in files:
        base, ext = os.path.splitext(f)
        existing_files.add((rel.split('-')[0], base))  # (layout, nome) sem sufixo de config

def file_exists(kind, name):
    return (kind, name) in existing_files

def write_file(kind, name, content):
    d = os.path.join(res, kind)
    os.makedirs(d, exist_ok=True)
    p = os.path.join(d, name + '.xml')
    if os.path.exists(p):
        return False
    open(p, 'w', encoding='utf-8').write(content)
    existing_files.add((kind, name))
    return True

def write_raw(name):
    d = os.path.join(res, 'raw')
    os.makedirs(d, exist_ok=True)
    for ext in ('.bin', '.svg', '.png'):
        p = os.path.join(d, name + ext)
        if os.path.exists(p):
            return False
    open(os.path.join(d, name + '.bin'), 'w').write('placeholder')
    return True

FILE_KINDS = {
    'layout': '<?xml version="1.0" encoding="utf-8"?>\n<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android" android:layout_width="match_parent" android:layout_height="match_parent"/>',
    'anim': '<?xml version="1.0" encoding="utf-8"?>\n<alpha xmlns:android="http://schemas.android.com/apk/res/android" android:fromAlpha="1.0" android:toAlpha="1.0"/>',
    'drawable': '<?xml version="1.0" encoding="utf-8"?>\n<shape xmlns:android="http://schemas.android.com/apk/res/android"/>',
    'mipmap': '<?xml version="1.0" encoding="utf-8"?>\n<shape xmlns:android="http://schemas.android.com/apk/res/android"/>',
    'xml': '<?xml version="1.0" encoding="utf-8"?>\n<placeholder/>',
    'menu': '<?xml version="1.0" encoding="utf-8"?>\n<menu xmlns:android="http://schemas.android.com/apk/res/android"/>',
}
VALUE_SNIPPETS = {
    'style': lambda n: '<style name="%s" parent=""/>' % n,
    'bool': lambda n: '<bool name="%s">false</bool>' % n,
    'color': lambda n: '<color name="%s">#00000000</color>' % n,
    'string': lambda n: '<string name="%s" translatable="false"/>' % n,
    'integer': lambda n: '<integer name="%s">0</integer>' % n,
    'dimen': lambda n: '<dimen name="%s">0dp</dimen>' % n,
    'id': lambda n: '<item type="id" name="%s"/>' % n,
    'fraction': lambda n: '<item type="fraction" name="%s">0%%</item>' % n,
    'attr': lambda n: '<attr name="%s"/>' % n,
}

value_placeholders = {}  # type -> [snippets]
created_files = 0
for (t, n) in sorted(removed):
    if t == 'raw':
        if write_raw(n):
            created_files += 1
    elif t in FILE_KINDS:
        if not file_exists(t, n):
            if write_file(t, n, FILE_KINDS[t]):
                created_files += 1
    elif t in VALUE_SNIPPETS:
        value_placeholders.setdefault(t, []).append(VALUE_SNIPPETS[t](n))
    else:
        print('[!] tipo sem placeholder conhecido: %s/%s' % (t, n))

if value_placeholders:
    lines = ['<?xml version="1.0" encoding="utf-8"?>', '<resources>']
    for t in sorted(value_placeholders):
        for snip in value_placeholders[t]:
            lines.append('    ' + snip)
    lines.append('</resources>')
    p = os.path.join(res, 'values', 'zz_placeholders.xml')
    open(p, 'w', encoding='utf-8').write('\n'.join(lines) + '\n')
    print('[*] placeholders de valores: %s' % p)

print('[*] %d arquivo(s) placeholder criado(s)' % created_files)
for (t, n), configs in sorted(removed.items()):
    print('    %s/%s (%d config(s))' % (t, n, len(configs)))
