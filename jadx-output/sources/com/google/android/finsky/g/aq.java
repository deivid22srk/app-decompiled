package com.google.android.finsky.g;

/* loaded from: classes.dex */
public class aq extends r {
    public final long c;
    public final long d;
    public final boolean e;

    public aq(String str, String str2, int i, String str3, int i2, int i3, long j, Long l, long j2, long j3, boolean z, boolean z2, String str4, int i4) {
        super(str, str2, i, str3, i2, i3, j, l.longValue(), false, z2, str4, i4);
        this.c = j2;
        this.d = j3;
        this.e = z;
    }

    public final int a() {
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.e) {
            return 3;
        }
        if (currentTimeMillis < this.d) {
            return 1;
        }
        if (currentTimeMillis < this.n) {
            return 0;
        }
        return 2;
    }
}
