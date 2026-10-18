package com.google.gson.b.a;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class f<E> extends com.google.gson.aj<Collection<E>> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f7787a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.gson.aj<E> f7788b;
    private final com.google.gson.b.t<? extends Collection<E>> c;

    @Override // com.google.gson.aj
    public final /* synthetic */ void a(com.google.gson.stream.f fVar, Object obj) {
        Collection collection = (Collection) obj;
        if (collection == null) {
            fVar.e();
            return;
        }
        fVar.a();
        Iterator<E> it = collection.iterator();
        while (it.hasNext()) {
            this.f7788b.a(fVar, it.next());
        }
        fVar.b();
    }

    public f(e eVar, com.google.gson.k kVar, Type type, com.google.gson.aj<E> ajVar, com.google.gson.b.t<? extends Collection<E>> tVar) {
        this.f7787a = eVar;
        this.f7788b = new z(kVar, ajVar, type);
        this.c = tVar;
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ Object a(com.google.gson.stream.a aVar) {
        if (aVar.f() == com.google.gson.stream.e.NULL) {
            aVar.k();
            return null;
        }
        Collection<E> a2 = this.c.a();
        aVar.a();
        while (aVar.e()) {
            a2.add(this.f7788b.a(aVar));
        }
        aVar.b();
        return a2;
    }
}
