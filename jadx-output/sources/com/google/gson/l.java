package com.google.gson;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class l extends ThreadLocal<Map<com.google.gson.c.a<?>, s<?>>> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f7852a;

    l(k kVar) {
        this.f7852a = kVar;
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Map<com.google.gson.c.a<?>, s<?>> initialValue() {
        return new HashMap();
    }
}
