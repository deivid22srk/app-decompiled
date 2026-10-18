package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.mp;

/* loaded from: classes.dex */
public final class t<V> {

    /* renamed from: a, reason: collision with root package name */
    private final V f6383a;

    /* renamed from: b, reason: collision with root package name */
    private final mp<V> f6384b;
    private V c;

    private t(mp<V> mpVar, V v) {
        com.google.android.gms.common.internal.av.a(mpVar);
        this.f6384b = mpVar;
        this.f6383a = v;
    }

    static t<String> a(String str, String str2, String str3) {
        return new t<>(mp.a(str, str3), str2);
    }

    public final V a() {
        return this.c != null ? this.c : (com.google.android.gms.common.internal.g.f5709a && mp.b()) ? this.f6384b.e() : this.f6383a;
    }

    static t<Boolean> a(String str) {
        return new t<>(mp.a(str), true);
    }

    static t<Long> a(String str, long j) {
        return new t<>(mp.a(str, Long.valueOf(j)), Long.valueOf(j));
    }

    static t<Integer> a(String str, int i) {
        return new t<>(mp.a(str, Integer.valueOf(i)), Integer.valueOf(i));
    }
}
