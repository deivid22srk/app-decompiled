package com.google.gson.b.a;

/* loaded from: classes2.dex */
final class ax implements com.google.gson.ak {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Class f7781a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.gson.aj f7782b;

    ax(Class cls, com.google.gson.aj ajVar) {
        this.f7781a = cls;
        this.f7782b = ajVar;
    }

    @Override // com.google.gson.ak
    public final <T> com.google.gson.aj<T> a(com.google.gson.k kVar, com.google.gson.c.a<T> aVar) {
        if (this.f7781a.isAssignableFrom(aVar.f7846a)) {
            return this.f7782b;
        }
        return null;
    }

    public final String toString() {
        return "Factory[typeHierarchy=" + this.f7781a.getName() + ",adapter=" + this.f7782b + "]";
    }
}
