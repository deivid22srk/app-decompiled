package com.google.android.gms.internal;

import java.util.Map;

/* loaded from: classes.dex */
public final class gy {

    /* renamed from: a, reason: collision with root package name */
    public final int f6010a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f6011b;
    public final Map<String, String> c;
    public final boolean d;
    public final long e;

    public gy(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        this.f6010a = i;
        this.f6011b = bArr;
        this.c = map;
        this.d = z;
        this.e = j;
    }

    public gy(byte[] bArr, Map<String, String> map) {
        this(200, bArr, map, false, 0L);
    }
}
