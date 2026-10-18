package com.google.android.finsky.bpkg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ab f2060a;

    /* renamed from: b, reason: collision with root package name */
    public final x f2061b;
    public final String c;

    public a(String str, ab abVar, x xVar) {
        this.c = str;
        this.f2060a = abVar;
        this.f2061b = xVar;
    }

    public final boolean a(Runnable runnable) {
        return this.f2060a.a(runnable);
    }

    public final b a(String str) {
        t a2 = this.f2060a.a(str);
        y a3 = this.f2061b.a(str);
        if (a2 == null && a3 == null) {
            return null;
        }
        return new b(str, this.c, a3, a2);
    }

    public static String[] a(y yVar) {
        return yVar == null ? com.google.android.finsky.gpkg.q.f2834a : yVar.f2138b;
    }

    public final Map<String, List<String>> a(com.google.android.finsky.gpkg.h hVar, Collection<String> collection, String str) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (String str2 : collection) {
            b a2 = a(str2);
            if (a2 == null) {
                a2 = new b(str2, null, null, null);
            }
            arrayList.add(a2);
        }
        return b(hVar, arrayList, str);
    }

    public final List<b> a() {
        y a2;
        ArrayList arrayList = new ArrayList();
        for (t tVar : this.f2060a.a()) {
            if (tVar.c != -1 && ((a2 = this.f2061b.a(tVar.f2130a)) == null || tVar.c > a2.c)) {
                arrayList.add(new b(tVar.f2130a, this.c, a2, tVar));
            }
        }
        return arrayList;
    }

    public final Map<String, List<String>> a(com.google.android.finsky.gpkg.h hVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        HashMap<String, t> hashMap = new HashMap<String, t>();
        for (t tVar : this.f2060a.a()) {
            hashMap.put(tVar.f2130a, tVar);
        }
        for (y yVar : this.f2061b.a()) {
            arrayList.add(new b(yVar.f2137a, this.c, yVar, (t) hashMap.remove(yVar.f2137a)));
        }
        if (!z) {
            for (t tVar2 : hashMap.values()) {
                arrayList.add(new b(tVar2.f2130a, this.c, null, tVar2));
            }
        }
        return b(hVar, arrayList, null);
    }

    public static Map<String, List<String>> b(com.google.android.finsky.gpkg.h hVar, Collection<b> collection, String str) {
        HashMap<String, List<String>> hashMap = new HashMap<String, List<String>>();
        for (com.google.android.finsky.gpkg.a aVar : hVar.e()) {
            hashMap.put(aVar.i.name, new ArrayList());
        }
        for (b bVar : collection) {
            List<com.google.android.finsky.gpkg.q> b2 = hVar.b(bVar.f2104a, a(bVar.c));
            Iterator<com.google.android.finsky.gpkg.q> it = b2.iterator();
            while (it.hasNext()) {
                ((List) hashMap.get(it.next().g)).add(bVar.f2104a);
            }
            if (str != null && b2.isEmpty()) {
                ((List) hashMap.get(str)).add(bVar.f2104a);
            }
        }
        return hashMap;
    }
}
