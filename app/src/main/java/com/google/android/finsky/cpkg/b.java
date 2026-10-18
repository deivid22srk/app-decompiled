package com.google.android.finsky.cpkg;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f2450a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2451b;
    public final int c;

    public b(int[] iArr, int i, int i2) {
        this.f2450a = iArr;
        this.f2451b = i;
        this.c = i2;
    }

    public final String toString() {
        return String.format("ContentFilterSelection{authorityId=%s, level=%s, documentTypes=%s}", Integer.valueOf(this.f2451b), Integer.valueOf(this.c), Arrays.toString(this.f2450a));
    }
}
