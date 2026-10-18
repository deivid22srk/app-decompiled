package com.google.gson.b.a;

/* loaded from: classes2.dex */
final class aw implements com.google.gson.ak {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Class f7779a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Class f7780b;
    final /* synthetic */ com.google.gson.aj c;

    aw(Class cls, Class cls2, com.google.gson.aj ajVar) {
        this.f7779a = cls;
        this.f7780b = cls2;
        this.c = ajVar;
    }

    public final String toString() {
        return "Factory[type=" + this.f7779a.getName() + "+" + this.f7780b.getName() + ",adapter=" + this.c + "]";
    }

    @Override // com.google.gson.ak
    public final <T> com.google.gson.aj<T> a(com.google.gson.k kVar, com.google.gson.c.a<T> aVar) {
        Class<? super T> cls = aVar.f7846a;
        if (cls == this.f7779a || cls == this.f7780b) {
            return this.c;
        }
        return null;
    }
}
