package com.google.android.wallet.nfc.apkg;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f7358a;

    /* synthetic */ c(byte b2, byte b3, byte b4, byte b5, byte[] bArr, byte b6, boolean z, boolean z2, byte b7) {
        this(b2, b3, b4, b5, bArr, b6, z, z2);
    }

    public c(byte b2, byte b3, byte b4, byte b5, byte[] bArr, byte b6, boolean z, boolean z2) {
        int length = z ? bArr.length : 0;
        int i = z ? length + 5 : 4;
        i = z2 ? i + 1 : i;
        this.f7358a = new byte[i];
        this.f7358a[0] = b2;
        this.f7358a[1] = b3;
        this.f7358a[2] = b4;
        this.f7358a[3] = b5;
        if (z) {
            this.f7358a[4] = (byte) length;
            System.arraycopy(bArr, 0, this.f7358a, 5, bArr.length);
        }
        if (z2) {
            this.f7358a[i - 1] = b6;
        }
    }
}
