package com.google.android.gms.internal;

/* loaded from: classes.dex */
public final class ai {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f5868a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f5869b = new long[0];
    public static final float[] c = new float[0];
    public static final double[] d = new double[0];
    public static final boolean[] e = new boolean[0];
    public static final String[] f = new String[0];
    public static final byte[][] g = new byte[0][];
    public static final byte[] h = new byte[0];

    static int a(int i) {
        return i & 7;
    }

    static int a(int i, int i2) {
        return (i << 3) | i2;
    }

    public static boolean a(z zVar, int i) {
        return zVar.b(i);
    }

    public static int b(int i) {
        return i >>> 3;
    }

    public static final int b(z zVar, int i) {
        int i2 = 1;
        int j = zVar.j();
        zVar.b(i);
        while (zVar.a() == i) {
            zVar.b(i);
            i2++;
        }
        zVar.e(j);
        return i2;
    }
}
