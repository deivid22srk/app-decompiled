package com.google.gson.bpkg;

import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class y extends w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Method f7842a;

    y(Method method) {
        this.f7842a = method;
    }

    @Override // com.google.gson.bpkg.w
    public final <T> T a(Class<T> cls) {
        return (T) this.f7842a.invoke(null, cls, Object.class);
    }
}
