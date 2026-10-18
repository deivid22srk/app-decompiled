package com.google.android.gms.internal;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    final byte[] f6257a = new byte[256];

    /* renamed from: b, reason: collision with root package name */
    int f6258b;
    int c;

    public y(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.f6257a[i] = (byte) i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            i2 = (i2 + this.f6257a[i3] + bArr[i3 % bArr.length]) & 255;
            byte b2 = this.f6257a[i3];
            this.f6257a[i3] = this.f6257a[i2];
            this.f6257a[i2] = b2;
        }
        this.f6258b = 0;
        this.c = 0;
    }

    public final void a(byte[] bArr) {
        int i = this.f6258b;
        int i2 = this.c;
        for (int i3 = 0; i3 < 256; i3++) {
            i = (i + 1) & 255;
            i2 = (i2 + this.f6257a[i]) & 255;
            byte b2 = this.f6257a[i];
            this.f6257a[i] = this.f6257a[i2];
            this.f6257a[i2] = b2;
            bArr[i3] = (byte) (bArr[i3] ^ this.f6257a[(this.f6257a[i] + this.f6257a[i2]) & 255]);
        }
        this.f6258b = i;
        this.c = i2;
    }
}
