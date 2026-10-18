package com.google.gson.bpkg.apkg;

/* loaded from: classes2.dex */
public final class at implements com.google.gson.ak {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.gson.cpkg.a f7773a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.gson.aj f7774b;

    at(com.google.gson.cpkg.a aVar, com.google.gson.aj ajVar) {
        this.f7773a = aVar;
        this.f7774b = ajVar;
    }

    @Override // com.google.gson.ak
    public final <T> com.google.gson.aj<T> a(com.google.gson.k kVar, com.google.gson.cpkg.a<T> aVar) {
        if (aVar.equals(this.f7773a)) {
            return this.f7774b;
        }
        return null;
    }
}
