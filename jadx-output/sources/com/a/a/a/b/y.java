package com.a.a.a.b;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    int f981a;

    /* renamed from: b, reason: collision with root package name */
    int f982b;
    int c;
    final int[] d = new int[10];

    final y a(int i, int i2, int i3) {
        if (i < this.d.length) {
            int i4 = 1 << i;
            this.f981a |= i4;
            if ((i2 & 1) != 0) {
                this.f982b |= i4;
            } else {
                this.f982b &= i4 ^ (-1);
            }
            if ((i2 & 2) != 0) {
                this.c = i4 | this.c;
            } else {
                this.c = (i4 ^ (-1)) & this.c;
            }
            this.d[i] = i3;
        }
        return this;
    }

    final boolean a(int i) {
        return ((1 << i) & this.f981a) != 0;
    }

    final int a() {
        if ((this.f981a & 2) != 0) {
            return this.d[1];
        }
        return -1;
    }

    public final int b() {
        if ((this.f981a & 128) != 0) {
            return this.d[7];
        }
        return 65536;
    }

    final int b(int i) {
        int i2 = ((1 << i) & this.c) != 0 ? 2 : 0;
        return ((1 << i) & this.f982b) != 0 ? i2 | 1 : i2;
    }
}
