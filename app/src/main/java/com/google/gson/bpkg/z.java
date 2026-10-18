package com.google.gson.bpkg;

import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class z extends w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Method f7843a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7844b;

    z(Method method, int i) {
        this.f7843a = method;
        this.f7844b = i;
    }

    @Override // com.google.gson.bpkg.w
    public final <T> T a(Class<T> cls) {
        return (T) this.f7843a.invoke(null, cls, Integer.valueOf(this.f7844b));
    }
}
