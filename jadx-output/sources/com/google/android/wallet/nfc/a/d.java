package com.google.android.wallet.nfc.a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    byte f7359a = 0;

    /* renamed from: b, reason: collision with root package name */
    byte f7360b = 0;
    byte c = 0;
    private byte d;
    private byte[] e;
    private byte f;
    private boolean g;
    private boolean h;

    public d(byte b2) {
        this.d = b2;
    }

    public final d a(byte[] bArr) {
        this.g = bArr != null;
        this.e = bArr;
        return this;
    }

    public final d a(byte b2) {
        this.h = true;
        this.f = b2;
        return this;
    }

    public final c a() {
        return new c(this.f7359a, this.d, this.f7360b, this.c, this.e, this.f, this.g, this.h, (byte) 0);
    }
}
