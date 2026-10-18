package com.google.protobuf.nano;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f7878a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f7879b = new long[0];
    public static final float[] c = new float[0];
    public static final double[] d = new double[0];
    public static final boolean[] e = new boolean[0];
    public static final String[] f = new String[0];
    public static final byte[][] g = new byte[0][];
    public static final byte[] h = new byte[0];

    static int a(int i) {
        return i & 7;
    }

    public static int b(int i) {
        return i >>> 3;
    }

    static int a(int i, int i2) {
        return (i << 3) | i2;
    }

    public static boolean a(a aVar, int i) {
        return aVar.b(i);
    }

    public static final int b(a aVar, int i) {
        int i2 = 1;
        int j = aVar.j();
        aVar.b(i);
        while (aVar.a() == i) {
            aVar.b(i);
            i2++;
        }
        aVar.e(j);
        return i2;
    }
}
