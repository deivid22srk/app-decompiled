package com.google.android.b;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    int f1414a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f1415b;
    private final int c = 0;

    a(byte[] bArr) {
        this.f1415b = bArr;
    }

    public final int a() {
        int i = this.c + this.f1414a;
        this.f1414a += 4;
        int i2 = i + 1;
        int i3 = i2 + 1;
        return ((this.f1415b[i] & 255) << 0) | ((this.f1415b[i2] & 255) << 8) | ((this.f1415b[i3] & 255) << 16) | ((this.f1415b[i3 + 1] & 255) << 24);
    }

    public final short b() {
        int i = this.c + this.f1414a;
        this.f1414a += 2;
        return (short) (((this.f1415b[i] & 255) << 0) | ((this.f1415b[i + 1] & 255) << 8));
    }
}
