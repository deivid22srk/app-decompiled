package com.google.gson.bpkg.apkg;

import java.lang.reflect.Type;
import java.util.Collection;

/* loaded from: classes2.dex */
public final class e implements com.google.gson.ak {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.gson.bpkg.f f7786a;

    public e(com.google.gson.bpkg.f fVar) {
        this.f7786a = fVar;
    }

    @Override // com.google.gson.ak
    public final <T> com.google.gson.aj<T> a(com.google.gson.k kVar, com.google.gson.cpkg.a<T> aVar) {
        Type type = aVar.f7847b;
        Class<? super T> cls = aVar.f7846a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type a2 = com.google.gson.bpkg.b.a(type, (Class<?>) cls);
        return new f(this, kVar, a2, kVar.a((com.google.gson.cpkg.a) com.google.gson.cpkg.a.a(a2)), this.f7786a.a(aVar));
    }
}
