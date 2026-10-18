package com.google.gson.b.a;

/* loaded from: classes2.dex */
final class au implements com.google.gson.ak {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Class f7775a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.gson.aj f7776b;

    au(Class cls, com.google.gson.aj ajVar) {
        this.f7775a = cls;
        this.f7776b = ajVar;
    }

    public final String toString() {
        return "Factory[type=" + this.f7775a.getName() + ",adapter=" + this.f7776b + "]";
    }

    @Override // com.google.gson.ak
    public final <T> com.google.gson.aj<T> a(com.google.gson.k kVar, com.google.gson.c.a<T> aVar) {
        if (aVar.f7846a == this.f7775a) {
            return this.f7776b;
        }
        return null;
    }
}
