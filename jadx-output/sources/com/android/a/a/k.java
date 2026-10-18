package com.android.a.a;

import java.util.Map;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final Map<d, String> f1115a;

    public k(Map<d, String> map) {
        be.a((Object) "Cannot construct StandardNodeData with null map");
        this.f1115a = map;
    }

    public final boolean a(d dVar) {
        return this.f1115a.containsKey(dVar);
    }

    public final String b(d dVar) {
        return this.f1115a.get(dVar);
    }
}
