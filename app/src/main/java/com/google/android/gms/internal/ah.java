package com.google.android.gms.internal;

import java.util.Arrays;

/* loaded from: classes.dex */
final class ah {

    /* renamed from: a, reason: collision with root package name */
    final int f5866a;

    /* renamed from: b, reason: collision with root package name */
    final byte[] f5867b;

    ah(int i, byte[] bArr) {
        this.f5866a = i;
        this.f5867b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ah)) {
            return false;
        }
        ah ahVar = (ah) obj;
        return this.f5866a == ahVar.f5866a && Arrays.equals(this.f5867b, ahVar.f5867b);
    }

    public final int hashCode() {
        return ((this.f5866a + 527) * 31) + Arrays.hashCode(this.f5867b);
    }
}
