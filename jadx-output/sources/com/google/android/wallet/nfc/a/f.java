package com.google.android.wallet.nfc.a;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f7362a = {9, 0, 0, 0};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f7363b = {6, 12};
    public final byte[] c;
    public final byte d;
    public final byte e;

    public f(byte[] bArr) {
        this.c = Arrays.copyOfRange(bArr, 0, bArr.length - 2);
        this.d = bArr[bArr.length - 2];
        this.e = bArr[bArr.length - 1];
    }
}
