package com.google.gson.b;

import java.lang.reflect.Method;

/* loaded from: classes2.dex */
final class y extends w {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Method f7842a;

    y(Method method) {
        this.f7842a = method;
    }

    @Override // com.google.gson.b.w
    public final <T> T a(Class<T> cls) {
        return (T) this.f7842a.invoke(null, cls, Object.class);
    }
}
