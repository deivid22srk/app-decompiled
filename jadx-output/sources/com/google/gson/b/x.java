package com.google.gson.b;

import java.lang.reflect.Method;

/* loaded from: classes2.dex */
final class x extends w {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Method f7840a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f7841b;

    x(Method method, Object obj) {
        this.f7840a = method;
        this.f7841b = obj;
    }

    @Override // com.google.gson.b.w
    public final <T> T a(Class<T> cls) {
        return (T) this.f7840a.invoke(this.f7841b, cls);
    }
}
