package com.google.android.gms.internal;

/* loaded from: classes.dex */
public final class cj {

    /* renamed from: a, reason: collision with root package name */
    final long f5923a;

    /* renamed from: b, reason: collision with root package name */
    final String f5924b;

    cj(long j, String str) {
        this.f5923a = j;
        this.f5924b = str;
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof cj) && ((cj) obj).f5923a == this.f5923a;
    }

    public final int hashCode() {
        return (int) this.f5923a;
    }
}
