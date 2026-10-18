package com.google.android.gms.common;

import java.util.Arrays;

/* loaded from: classes.dex */
final class ci extends i {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f5607a;

    ci(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f5607a = bArr;
    }

    @Override // com.google.android.gms.common.i
    final byte[] a() {
        return this.f5607a;
    }
}
