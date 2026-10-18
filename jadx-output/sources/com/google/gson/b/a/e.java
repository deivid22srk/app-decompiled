package com.google.gson.b.a;

import java.lang.reflect.Type;
import java.util.Collection;

/* loaded from: classes2.dex */
public final class e implements com.google.gson.ak {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.gson.b.f f7786a;

    public e(com.google.gson.b.f fVar) {
        this.f7786a = fVar;
    }

    @Override // com.google.gson.ak
    public final <T> com.google.gson.aj<T> a(com.google.gson.k kVar, com.google.gson.c.a<T> aVar) {
        Type type = aVar.f7847b;
        Class<? super T> cls = aVar.f7846a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type a2 = com.google.gson.b.b.a(type, (Class<?>) cls);
        return new f(this, kVar, a2, kVar.a((com.google.gson.c.a) com.google.gson.c.a.a(a2)), this.f7786a.a(aVar));
    }
}
