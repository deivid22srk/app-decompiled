package com.google.gson.b.a;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* loaded from: classes2.dex */
final class z<T> extends com.google.gson.aj<T> {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.gson.k f7811a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.gson.aj<T> f7812b;
    private final Type c;

    z(com.google.gson.k kVar, com.google.gson.aj<T> ajVar, Type type) {
        this.f7811a = kVar;
        this.f7812b = ajVar;
        this.c = type;
    }

    @Override // com.google.gson.aj
    public final T a(com.google.gson.stream.a aVar) {
        return this.f7812b.a(aVar);
    }

    @Override // com.google.gson.aj
    public final void a(com.google.gson.stream.f fVar, T t) {
        com.google.gson.aj<T> ajVar;
        com.google.gson.aj<T> ajVar2 = this.f7812b;
        Type type = this.c;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.c) {
            ajVar = this.f7811a.a((com.google.gson.c.a) com.google.gson.c.a.a(type));
            if ((ajVar instanceof t) && !(this.f7812b instanceof t)) {
                ajVar = this.f7812b;
            }
        } else {
            ajVar = ajVar2;
        }
        ajVar.a(fVar, t);
    }
}
