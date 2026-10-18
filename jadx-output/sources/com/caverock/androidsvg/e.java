package com.caverock.androidsvg;

/* loaded from: classes.dex */
final class e extends de {
    public e(String str) {
        super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0152, code lost:
    
        if (r2 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0156, code lost:
    
        if (r10.f1377a != null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0158, code lost:
    
        r10.f1377a = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x015f, code lost:
    
        r10.f1377a.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0183, code lost:
    
        r9.f1369b = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:?, code lost:
    
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0152 A[EDGE_INSN: B:106:0x0152->B:87:0x0152 BREAK  A[LOOP:0: B:15:0x002c->B:50:0x002c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.caverock.androidsvg.j r10) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.e.a(com.caverock.androidsvg.j):boolean");
    }

    public final String b() {
        if (c()) {
            return null;
        }
        int i = this.f1369b;
        int i2 = this.f1369b;
        int charAt = this.f1368a.charAt(this.f1369b);
        int i3 = i2;
        while (charAt != -1 && charAt != 59 && charAt != 125 && charAt != 33) {
            if (charAt == 10 || charAt == 13) {
                break;
            }
            if (!a(charAt)) {
                i3 = this.f1369b + 1;
            }
            charAt = j();
        }
        if (this.f1369b > i) {
            return this.f1368a.substring(i, i3);
        }
        this.f1369b = i;
        return null;
    }

    public final String a() {
        int i;
        if (c()) {
            i = this.f1369b;
        } else {
            int i2 = this.f1369b;
            i = this.f1369b;
            int charAt = this.f1368a.charAt(this.f1369b);
            if (charAt == 45) {
                charAt = j();
            }
            if ((charAt >= 65 && charAt <= 90) || ((charAt >= 97 && charAt <= 122) || charAt == 95)) {
                int j = j();
                while (true) {
                    if ((j < 65 || j > 90) && ((j < 97 || j > 122) && !((j >= 48 && j <= 57) || j == 45 || j == 95))) {
                        break;
                    }
                    j = j();
                }
                i = this.f1369b;
            }
            this.f1369b = i2;
        }
        if (i == this.f1369b) {
            return null;
        }
        String substring = this.f1368a.substring(this.f1369b, i);
        this.f1369b = i;
        return substring;
    }
}
