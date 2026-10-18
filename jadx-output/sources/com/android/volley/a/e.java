package com.android.volley.a;

import java.util.Comparator;

/* loaded from: classes.dex */
final class e implements Comparator<byte[]> {
    e() {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(byte[] bArr, byte[] bArr2) {
        return bArr.length - bArr2.length;
    }
}
