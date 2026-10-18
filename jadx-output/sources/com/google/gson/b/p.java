package com.google.gson.b;

import com.google.gson.aj;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
final class p<T> extends aj<T> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f7833a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f7834b;
    final /* synthetic */ com.google.gson.k c;
    final /* synthetic */ com.google.gson.c.a d;
    final /* synthetic */ o e;
    private aj<T> f;

    p(o oVar, boolean z, boolean z2, com.google.gson.k kVar, com.google.gson.c.a aVar) {
        this.e = oVar;
        this.f7833a = z;
        this.f7834b = z2;
        this.c = kVar;
        this.d = aVar;
    }

    @Override // com.google.gson.aj
    public final T a(com.google.gson.stream.a aVar) {
        if (!this.f7833a) {
            return a().a(aVar);
        }
        aVar.o();
        return null;
    }

    @Override // com.google.gson.aj
    public final void a(com.google.gson.stream.f fVar, T t) {
        if (this.f7834b) {
            fVar.e();
        } else {
            a().a(fVar, t);
        }
    }

    private aj<T> a() {
        aj<T> ajVar = this.f;
        if (ajVar != null) {
            return ajVar;
        }
        aj<T> a2 = q.f7835a.a(this.c, this.e, this.d);
        this.f = a2;
        return a2;
    }
}
