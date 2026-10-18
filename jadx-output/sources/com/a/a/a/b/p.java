package com.a.a.a.b;

/* loaded from: classes.dex */
final class p {

    /* renamed from: a, reason: collision with root package name */
    final p[] f971a;

    /* renamed from: b, reason: collision with root package name */
    final int f972b;
    final int c;

    p() {
        this.f971a = new p[256];
        this.f972b = 0;
        this.c = 0;
    }

    p(int i, int i2) {
        this.f971a = null;
        this.f972b = i;
        int i3 = i2 & 7;
        this.c = i3 == 0 ? 8 : i3;
    }
}
