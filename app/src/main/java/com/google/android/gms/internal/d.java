package com.google.android.gms.internal;

import android.util.Base64;

/* loaded from: classes.dex */
final class d implements av {
    d() {
    }

    @Override // com.google.android.gms.internal.av
    public final String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    @Override // com.google.android.gms.internal.av
    public final byte[] a(String str, boolean z) {
        return Base64.decode(str, z ? 11 : 2);
    }
}
