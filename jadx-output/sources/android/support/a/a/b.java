package android.support.a.a;

import java.util.ArrayList;

/* loaded from: classes.dex */
final class b {
    static float[] a(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i2 = i + 0;
        int min = Math.min(i2, length + 0);
        float[] fArr2 = new float[i2];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    public static d[] a(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int a2 = a(str, i);
            String trim = str.substring(i2, a2).trim();
            if (trim.length() > 0) {
                a(arrayList, trim.charAt(0), b(trim));
            }
            i = a2 + 1;
            i2 = a2;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            a(arrayList, str.charAt(i2), new float[0]);
        }
        return (d[]) arrayList.toArray(new d[arrayList.size()]);
    }

    public static d[] a(d[] dVarArr) {
        if (dVarArr == null) {
            return null;
        }
        d[] dVarArr2 = new d[dVarArr.length];
        for (int i = 0; i < dVarArr.length; i++) {
            dVarArr2[i] = new d(dVarArr[i], (byte) 0);
        }
        return dVarArr2;
    }

    private static int a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                break;
            }
            i++;
        }
        return i;
    }

    private static void a(ArrayList<d> arrayList, char c, float[] fArr) {
        arrayList.add(new d(c, fArr, (byte) 0));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078 A[Catch: NumberFormatException -> 0x0094, TryCatch #0 {NumberFormatException -> 0x0094, blocks: (B:13:0x001e, B:15:0x0032, B:16:0x0039, B:18:0x003f, B:19:0x0043, B:22:0x004b, B:40:0x005a, B:43:0x0067, B:24:0x0072, B:26:0x0078, B:27:0x0084, B:30:0x008b, B:47:0x008f), top: B:12:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static float[] b(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.a.a.b.b(java.lang.String):float[]");
    }
}
