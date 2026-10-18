package com.google.android.finsky.widget.consumption;

/* loaded from: classes.dex */
public final class m {
    private static final byte[] c = {4, 8};
    private static final byte[] d = {1, 2};
    private static final byte[] e = {1, 6, 10};
    private static final byte[] f = {5, 2, 9};
    private static final byte[] g = {5, 6, 9, 10};

    /* renamed from: a, reason: collision with root package name */
    public final ConsumptionAppDocList[] f5187a;

    /* renamed from: b, reason: collision with root package name */
    public int f5188b;

    public m(ConsumptionAppDocList[] consumptionAppDocListArr, int i) {
        this.f5187a = consumptionAppDocListArr;
        this.f5188b = i;
    }

    public static byte a(int i, int i2, int i3) {
        if (i == 1) {
            return (byte) 0;
        }
        if (i == 2 && i3 == 0) {
            return d[i2];
        }
        if (i == 2 && i3 == 1) {
            return c[i2];
        }
        if (i == 3 && i3 == 0) {
            return e[i2];
        }
        if (i == 3 && i3 == 1) {
            return f[i2];
        }
        if (i == 4) {
            return g[i2];
        }
        return (byte) 0;
    }
}
