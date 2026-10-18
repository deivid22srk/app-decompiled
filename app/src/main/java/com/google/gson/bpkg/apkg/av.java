package com.google.gson.bpkg.apkg;

/* loaded from: classes2.dex */
public final class av implements com.google.gson.ak {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f7777a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f7778b;
    public final /* synthetic */ com.google.gson.aj c;

    av(Class cls, Class cls2, com.google.gson.aj ajVar) {
        this.f7777a = cls;
        this.f7778b = cls2;
        this.c = ajVar;
    }

    public final String toString() {
        return "Factory[type=" + this.f7778b.getName() + "+" + this.f7777a.getName() + ",adapter=" + this.c + "]";
    }

    @Override // com.google.gson.ak
    public final <T> com.google.gson.aj<T> a(com.google.gson.k kVar, com.google.gson.cpkg.a<T> aVar) {
        Class<? super T> cls = aVar.f7846a;
        if (cls == this.f7777a || cls == this.f7778b) {
            return this.c;
        }
        return null;
    }
}
