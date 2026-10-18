package com.google.gson.bpkg.apkg;

import com.google.gson.JsonSyntaxException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
public final class n<K, V> extends com.google.gson.aj<Map<K, V>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f7796a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.gson.aj<K> f7797b;
    public final com.google.gson.aj<V> c;
    public final com.google.gson.bpkg.t<? extends Map<K, V>> d;

    @Override // com.google.gson.aj
    public final /* synthetic */ void a(com.google.gson.stream.f fVar, Object obj) {
        String str;
        int i = 0;
        Map map = (Map) obj;
        if (map == null) {
            fVar.e();
            return;
        }
        if (!this.f7796a.f7794a) {
            fVar.c();
            for (Map.Entry<K, V> entry : map.entrySet()) {
                fVar.a(String.valueOf(entry.getKey()));
                this.c.a(fVar, entry.getValue());
            }
            fVar.d();
            return;
        }
        ArrayList arrayList = new ArrayList(map.size());
        ArrayList arrayList2 = new ArrayList(map.size());
        boolean z = false;
        for (Map.Entry<K, V> entry2 : map.entrySet()) {
            com.google.gson.y a2 = m.a(this.f7797b, entry2.getKey());
            arrayList.add(a2);
            arrayList2.add(entry2.getValue());
            z = ((a2 instanceof com.google.gson.v) || (a2 instanceof com.google.gson.aa)) | z;
        }
        if (z) {
            fVar.a();
            while (i < arrayList.size()) {
                fVar.a();
                com.google.gson.bpkg.v.a((com.google.gson.y) arrayList.get(i), fVar);
                this.c.a(fVar, arrayList2.get(i));
                fVar.b();
                i++;
            }
            fVar.b();
            return;
        }
        fVar.c();
        while (i < arrayList.size()) {
            com.google.gson.y yVar = (com.google.gson.y) arrayList.get(i);
            if (yVar instanceof com.google.gson.ab) {
                com.google.gson.ab g = yVar.g();
                if (g.f7760a instanceof Number) {
                    str = String.valueOf(g.a());
                } else if (g.f7760a instanceof Boolean) {
                    str = Boolean.toString(g.f());
                } else if (g.f7760a instanceof String) {
                    str = g.b();
                } else {
                    throw new AssertionError();
                }
            } else if (yVar instanceof com.google.gson.z) {
                str = "null";
            } else {
                throw new AssertionError();
            }
            fVar.a(str);
            this.c.a(fVar, arrayList2.get(i));
            i++;
        }
        fVar.d();
    }

    public n(m mVar, com.google.gson.k kVar, Type type, com.google.gson.aj<K> ajVar, Type type2, com.google.gson.aj<V> ajVar2, com.google.gson.bpkg.t<? extends Map<K, V>> tVar) {
        this.f7796a = mVar;
        this.f7797b = new z(kVar, ajVar, type);
        this.c = new z(kVar, ajVar2, type2);
        this.d = tVar;
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ Object a(com.google.gson.stream.a aVar) {
        com.google.gson.stream.e f = aVar.f();
        if (f == com.google.gson.stream.e.NULL) {
            aVar.k();
            return null;
        }
        Map<K, V> a2 = this.d.a();
        if (f == com.google.gson.stream.e.BEGIN_ARRAY) {
            aVar.a();
            while (aVar.e()) {
                aVar.a();
                K a3 = this.f7797b.a(aVar);
                if (a2.put(a3, this.c.a(aVar)) != null) {
                    throw new JsonSyntaxException("duplicate key: " + a3);
                }
                aVar.b();
            }
            aVar.b();
            return a2;
        }
        aVar.c();
        while (aVar.e()) {
            com.google.gson.bpkg.r.f7836a.a(aVar);
            K a4 = this.f7797b.a(aVar);
            if (a2.put(a4, this.c.a(aVar)) != null) {
                throw new JsonSyntaxException("duplicate key: " + a4);
            }
        }
        aVar.d();
        return a2;
    }
}
