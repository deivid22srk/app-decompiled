package com.android.volley;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f1243a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f1244b;
    public final Map<String, String> c;
    public final boolean d;
    public final long e;

    public k(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        this.f1243a = i;
        this.f1244b = bArr;
        this.c = map;
        this.d = z;
        this.e = j;
    }

    public k(int i, byte[] bArr, Map<String, String> map, boolean z) {
        this(i, bArr, map, z, 0L);
    }

    public k(byte[] bArr) {
        this(200, bArr, Collections.emptyMap(), false, 0L);
    }

    public k(byte[] bArr, Map<String, String> map) {
        this(200, bArr, map, false, 0L);
    }
}
