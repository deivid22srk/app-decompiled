package com.google.android.gms.internal;

import java.io.IOException;

/* loaded from: classes.dex */
final class ax implements aw {

    /* renamed from: a, reason: collision with root package name */
    private zzaic f5886a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f5887b;
    private final int c;

    public ax(int i) {
        this.c = i;
        a();
    }

    @Override // com.google.android.gms.internal.aw
    public final void a(int i, long j) {
        this.f5886a.a(i, j);
    }

    @Override // com.google.android.gms.internal.aw
    public final void a(int i, String str) {
        this.f5886a.a(i, str);
    }

    public final void a(int i, byte[] bArr) {
        this.f5886a.a(i, bArr);
    }

    @Override // com.google.android.gms.internal.aw
    public final void a() {
        this.f5887b = new byte[this.c];
        byte[] bArr = this.f5887b;
        this.f5886a = zzaic.a(bArr, bArr.length);
    }

    @Override // com.google.android.gms.internal.aw
    public final byte[] b() {
        int remaining = this.f5886a.f6261a.remaining();
        if (remaining < 0) {
            throw new IOException();
        }
        if (remaining == 0) {
            return this.f5887b;
        }
        byte[] bArr = new byte[this.f5887b.length - remaining];
        System.arraycopy(this.f5887b, 0, bArr, 0, bArr.length);
        return bArr;
    }
}
