package com.google.android.finsky.billing.b;

/* loaded from: classes.dex */
public enum a {
    JCB(27, 3),
    DISCOVER(4, 3),
    AMEX(3, 4),
    MC(2, 3),
    VISA(1, 3);

    public final int f;
    public final int g;

    public static a a(int i) {
        for (a aVar : values()) {
            if (aVar.f == i) {
                return aVar;
            }
        }
        return null;
    }

    a(int i, int i2) {
        this.f = i;
        this.g = i2;
    }
}
