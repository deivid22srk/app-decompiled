package com.google.gson.b.a;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
final class b implements com.google.gson.ak {
    b() {
    }

    @Override // com.google.gson.ak
    public final <T> com.google.gson.aj<T> a(com.google.gson.k kVar, com.google.gson.c.a<T> aVar) {
        Type type = aVar.f7847b;
        if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        Type d = com.google.gson.b.b.d(type);
        return new a(kVar, kVar.a((com.google.gson.c.a) com.google.gson.c.a.a(d)), com.google.gson.b.b.b(d));
    }
}
