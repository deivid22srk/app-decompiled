package com.google.gson.b.a;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class o extends com.google.gson.aj<Object> {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.gson.ak f7798a = new p();

    /* renamed from: b, reason: collision with root package name */
    private final com.google.gson.k f7799b;

    /* synthetic */ o(com.google.gson.k kVar, byte b2) {
        this(kVar);
    }

    private o(com.google.gson.k kVar) {
        this.f7799b = kVar;
    }

    @Override // com.google.gson.aj
    public final Object a(com.google.gson.stream.a aVar) {
        switch (q.f7800a[aVar.f().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.e()) {
                    arrayList.add(a(aVar));
                }
                aVar.b();
                return arrayList;
            case 2:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                aVar.c();
                while (aVar.e()) {
                    linkedHashMap.put(aVar.h(), a(aVar));
                }
                aVar.d();
                return linkedHashMap;
            case 3:
                return aVar.i();
            case 4:
                return Double.valueOf(aVar.l());
            case 5:
                return Boolean.valueOf(aVar.j());
            case 6:
                aVar.k();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.aj
    public final void a(com.google.gson.stream.f fVar, Object obj) {
        if (obj == null) {
            fVar.e();
            return;
        }
        com.google.gson.aj a2 = this.f7799b.a((Class) obj.getClass());
        if (a2 instanceof o) {
            fVar.c();
            fVar.d();
        } else {
            a2.a(fVar, obj);
        }
    }
}
