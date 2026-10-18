package com.android.ex.photo.e;

/* loaded from: classes.dex */
public final class a {
    /* JADX WARN: Code restructure failed: missing block: B:49:0x005c, code lost:
    
        if (r2 <= 8) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x005e, code lost:
    
        r0 = a(r6, r4, 4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0065, code lost:
    
        if (r0 == 1229531648) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x006a, code lost:
    
        if (r0 == 1296891946) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x006c, code lost:
    
        android.util.Log.e("CameraExif", "Invalid byte order");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bf, code lost:
    
        if (r0 != 1229531648) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c1, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c2, code lost:
    
        r3 = a(r6, r4 + 4, 4, r0) + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00cc, code lost:
    
        if (r3 < 10) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ce, code lost:
    
        if (r3 <= r2) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00db, code lost:
    
        r4 = r4 + r3;
        r3 = r2 - r3;
        r6.c(r4 - 4);
        r2 = a(r6, r4 - 2, 2, r0);
        r5 = r4;
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00eb, code lost:
    
        r3 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ed, code lost:
    
        if (r2 <= 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f1, code lost:
    
        if (r4 < 12) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f9, code lost:
    
        if (a(r6, r5, 2, r0) != 274) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0119, code lost:
    
        r5 = r5 + 12;
        r6.c(r5 - 4);
        r4 = r4 - 12;
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0101, code lost:
    
        switch(a(r6, r5 + 8, 2, r0)) {
            case 1: goto L98;
            case 2: goto L66;
            case 3: goto L67;
            case 4: goto L66;
            case 5: goto L66;
            case 6: goto L68;
            case 7: goto L66;
            case 8: goto L69;
            default: goto L66;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0104, code lost:
    
        android.util.Log.i("CameraExif", "Unsupported orientation");
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x010d, code lost:
    
        return 180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0111, code lost:
    
        return 90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0115, code lost:
    
        return 270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00d0, code lost:
    
        android.util.Log.e("CameraExif", "Invalid offset");
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00d9, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0055, code lost:
    
        r6.c(r0 - 4);
        r2 = 0;
        r4 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(java.io.InputStream r10) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ex.photo.e.a.a(java.io.InputStream):int");
    }

    private static int a(g gVar, int i, int i2, boolean z) {
        int i3 = 1;
        if (z) {
            i += i2 - 1;
            i3 = -1;
        }
        int i4 = 0;
        while (true) {
            int i5 = i2 - 1;
            if (i2 > 0) {
                i4 = (i4 << 8) | (gVar.a(i) & 255);
                i += i3;
                i2 = i5;
            } else {
                return i4;
            }
        }
    }

    private static boolean a(g gVar, int i) {
        if (-1 >= 0) {
            return ((long) i) < -1;
        }
        return gVar.b(i);
    }
}
