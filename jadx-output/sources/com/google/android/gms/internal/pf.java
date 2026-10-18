package com.google.android.gms.internal;

import java.util.Comparator;

/* loaded from: classes.dex */
final class pf implements Comparator<byte[]> {
    pf() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(byte[] bArr, byte[] bArr2) {
        return bArr.length - bArr2.length;
    }
}
