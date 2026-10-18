package com.google.gson.b.a;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class a<E> extends com.google.gson.aj<Object> {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.gson.ak f7767a = new b();

    /* renamed from: b, reason: collision with root package name */
    private final Class<E> f7768b;
    private final com.google.gson.aj<E> c;

    public a(com.google.gson.k kVar, com.google.gson.aj<E> ajVar, Class<E> cls) {
        this.c = new z(kVar, ajVar, cls);
        this.f7768b = cls;
    }

    @Override // com.google.gson.aj
    public final Object a(com.google.gson.stream.a aVar) {
        if (aVar.f() == com.google.gson.stream.e.NULL) {
            aVar.k();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.e()) {
            arrayList.add(this.c.a(aVar));
        }
        aVar.b();
        Object newInstance = Array.newInstance((Class<?>) this.f7768b, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    @Override // com.google.gson.aj
    public final void a(com.google.gson.stream.f fVar, Object obj) {
        if (obj == null) {
            fVar.e();
            return;
        }
        fVar.a();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.c.a(fVar, Array.get(obj, i));
        }
        fVar.b();
    }
}
