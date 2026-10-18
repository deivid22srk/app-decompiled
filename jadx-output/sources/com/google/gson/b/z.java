package com.google.gson.b;

import java.lang.reflect.Method;

/* loaded from: classes2.dex */
final class z extends w {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Method f7843a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f7844b;

    z(Method method, int i) {
        this.f7843a = method;
        this.f7844b = i;
    }

    @Override // com.google.gson.b.w
    public final <T> T a(Class<T> cls) {
        return (T) this.f7843a.invoke(null, cls, Integer.valueOf(this.f7844b));
    }
}
