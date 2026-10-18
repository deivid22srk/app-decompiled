package com.google.c.b.a.a;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f7730a = new int[1024];

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f7731b = new int[1024];
    private static final int[] c = {1, 0, 0, 3};
    private static final int[][] d = {new int[]{0, 1, 3, 2}, new int[]{0, 2, 3, 1}, new int[]{3, 2, 0, 1}, new int[]{3, 1, 0, 2}};
    private static final double e;

    static {
        double d2 = 1.0d;
        do {
            d2 /= 2.0d;
        } while ((d2 / 2.0d) + 1.0d != 1.0d);
        e = d2;
        a(0, 0, 0, 0, 0, 0);
        a(0, 0, 0, 1, 0, 1);
        a(0, 0, 0, 2, 0, 2);
        a(0, 0, 0, 3, 0, 3);
    }

    public static final int a(double d2) {
        double d3 = 4.0d * d2;
        if (d3 < 0.0073034316301345825d) {
            return 30;
        }
        int i = 0;
        while (d3 < 7842000.0d) {
            d3 *= 2.0d;
            i++;
        }
        return i;
    }

    public static final long a(long j, long j2) {
        int i;
        long[] jArr = new long[2];
        double[] dArr = new double[5];
        double a2 = a(j);
        double a3 = a(j2);
        double cos = Math.cos(a2);
        dArr[2] = Math.cos(a3) * cos;
        dArr[3] = Math.sin(a3) * cos;
        dArr[4] = Math.sin(a2);
        double d2 = dArr[2];
        double d3 = dArr[3];
        double d4 = dArr[4];
        double abs = Math.abs(d2);
        double abs2 = Math.abs(d3);
        double abs3 = Math.abs(d4);
        if (abs <= abs2) {
            i = abs2 > abs3 ? d3 < 0.0d ? 4 : 1 : d4 < 0.0d ? 5 : 2;
        } else if (abs > abs3) {
            i = d2 < 0.0d ? 3 : 0;
        } else {
            i = d4 < 0.0d ? 5 : 2;
        }
        double d5 = dArr[2];
        double d6 = dArr[3];
        double d7 = dArr[4];
        switch (i) {
            case 0:
                dArr[0] = d6 / d5;
                dArr[1] = d7 / d5;
                break;
            case 1:
                dArr[0] = (-d5) / d6;
                dArr[1] = d7 / d6;
                break;
            case 2:
                dArr[0] = (-d5) / d7;
                dArr[1] = (-d6) / d7;
                break;
            case 3:
                dArr[0] = d7 / d5;
                dArr[1] = d6 / d5;
                break;
            case 4:
                dArr[0] = d7 / d6;
                dArr[1] = (-d5) / d6;
                break;
            default:
                dArr[0] = (-d6) / d7;
                dArr[1] = (-d5) / d7;
                break;
        }
        int c2 = c(b(dArr[0]));
        int c3 = c(b(dArr[1]));
        jArr[0] = 0;
        jArr[1] = i << 28;
        int i2 = i & 1;
        for (int i3 = 7; i3 >= 0; i3--) {
            int i4 = f7730a[i2 + (((c2 >> (i3 * 4)) & 15) << 6) + (((c3 >> (i3 * 4)) & 15) << 2)];
            int i5 = i3 >> 2;
            jArr[i5] = jArr[i5] | ((i4 >> 2) << (((i3 & 3) * 2) * 4));
            i2 = i4 & 3;
        }
        return (((jArr[1] << 32) + jArr[0]) << 1) + 1;
    }

    private static final double b(double d2) {
        return d2 >= 0.0d ? Math.sqrt((3.0d * d2) + 1.0d) * 0.5d : 1.0d - (Math.sqrt(1.0d - (3.0d * d2)) * 0.5d);
    }

    private static final void a(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i == 4) {
            int i7 = (i2 << 4) + i3;
            f7730a[(i7 << 2) + i4] = (i5 << 2) + i6;
            f7731b[(i5 << 2) + i4] = (i7 << 2) + i6;
            return;
        }
        int i8 = i + 1;
        int i9 = i2 << 1;
        int i10 = i3 << 1;
        int i11 = i5 << 2;
        int i12 = 0;
        while (true) {
            int i13 = i12;
            if (i13 < 4) {
                int i14 = d[i6][i13];
                a(i8, (i14 >>> 1) + i9, (i14 & 1) + i10, i4, i11 + i13, i6 ^ c[i13]);
                i12 = i13 + 1;
            } else {
                return;
            }
        }
    }

    private static final double a(long j) {
        return Math.toRadians(j * 1.0E-7d);
    }

    private static final int c(double d2) {
        return Math.max(0, Math.min(1073741823, (int) Math.round((1.073741824E9d * d2) - 0.5d)));
    }

    public static final long a(long j, int i) {
        long j2 = 1 << ((30 - i) * 2);
        return j2 | ((-j2) & j);
    }
}
