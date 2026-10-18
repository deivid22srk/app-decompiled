#!/usr/bin/env python3
# patch_jadx_artifacts.py — corrige os artefatos ?? e for() do jadx nas fontes
# cada edit: (arquivo, linha_esperada, substring_antiga, substring_nova ou None=deletar linha)
import os

SRC = '/home/z/my-project/repo-build/app/src/main/java'

EDITS = [
    ('com/google/android/wallet/ui/card/a.java', 1038,
     '?? r9 = (LinearLayout) ', 'LinearLayout r9 = '),
    ('com/google/android/wallet/ui/card/a.java', 1056,
     '?? a3 = bdVar.a();', 'View a3 = bdVar.a();'),
    ('com/google/android/wallet/ui/card/a.java', 1107,
     '?? a5 = bj.a(', 'View a5 = bj.a('),
    ('com/google/android/wallet/ui/common/d.java', 104,
     '?? r1 = this;', 'd r1 = this;'),
    ('com/google/android/wallet/ui/address/b.java', 1015,
     '?? r4;', None),
    ('com/google/android/finsky/services/aa.java', 38,
     '?? r7 = 258;', 'int r7 = 258;'),
    ('com/google/android/finsky/services/aa.java', 41,
     '?? r72 = 258;', 'int r72 = 258;'),
    ('com/google/android/finsky/services/aa.java', 58,
     'r72 = str2;', None),
    ('com/google/android/finsky/services/aa.java', 76,
     'r7 = str4;', None),
    ('com/google/android/wallet/ui/b/a.java', 104,
     '?? r0 = bVar;', 'com.google.android.wallet.ui.address.b r0 = bVar;'),
    ('com/google/android/wallet/ui/b/a.java', 137,
     '?? r02 = aqVar;', 'aq r02 = aqVar;'),
    ('com/google/android/wallet/ui/b/a.java', 186,
     '?? a7 = bj.a(oVar.f7634a);', 'String a7 = (String) bj.a(oVar.f7634a);'),
    ('com/google/android/finsky/utils/ParcelUtils.java', 51,
     'Throwable th;', 'Throwable th;\n        Parcelable r0 = null;'),
    ('com/google/android/finsky/utils/ParcelUtils.java', 59,
     '?? a2 = a(dataInputStream);', 'Parcelable a2 = a(dataInputStream);'),
    ('com/google/android/finsky/utils/ParcelUtils.java', 60,
     'r0 = a2 != 0 ? a2 : null;', 'r0 = a2;'),
    ('com/google/android/finsky/utils/ParcelUtils.java', 88,
     'return r0;', 'return (T) r0;'),
    ('com/google/android/finsky/adapters/CardRecyclerViewAdapter.java', 539,
     '?? a2;', 'View a2;'),
    ('com/google/android/finsky/adapters/CardRecyclerViewAdapter.java', 666,
     'a2.setContentHorizontalPadding(this.d);',
     '((BucketRow) a2).setContentHorizontalPadding(this.d);'),
    ('android/support/v7/widget/k.java', 195,
     '?? childAt = viewGroup.getChildAt(i);', 'View childAt = viewGroup.getChildAt(i);'),
    ('android/support/v7/widget/k.java', 199,
     'oVar = childAt;', None),
    ('com/google/android/finsky/api/a.java', 51,
     'for (0; i < accounts.length; i + 1) {',
     'for (int i = 0; i < accounts.length; i++) {'),
    ('com/google/gson/stream/a.java', 504,
     'for (0; i < "*/".length(); i + 1) {',
     'for (int i = 0; i < "*/".length(); i++) {'),
    ('android/support/v4/widget/by.java', 287,
     'for (0; i < c; i + 1) {', 'for (int i = 0; i < c; i++) {'),
]

cache = {}
for path, lineno, old, new in EDITS:
    full = os.path.join(SRC, path)
    if full not in cache:
        cache[full] = open(full, encoding='utf-8').readlines()
    lines = cache[full]
    idx = lineno - 1
    if old not in lines[idx]:
        print('[!] LINHA DIFERENTE: %s:%d esperava %r, tem: %r' % (path, lineno, old, lines[idx].rstrip()))
        continue
    if new is None:
        lines[idx] = ''
        print('[*] %s:%d deletada (%r)' % (path, lineno, old.strip()))
    else:
        lines[idx] = lines[idx].replace(old, new)
        print('[*] %s:%d %r -> %r' % (path, lineno, old.strip(), new.strip()[:60]))

for full, lines in cache.items():
    open(full, 'w', encoding='utf-8').writelines(lines)
print('[*] patch aplicado')
