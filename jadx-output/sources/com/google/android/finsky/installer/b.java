package com.google.android.finsky.installer;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.fw;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final List<Document> f2857a = Collections.emptyList();

    public static Map<String, Document> a(List<Document> list) {
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Document document = list.get(i);
            hashMap.put(document.E().w, document);
        }
        return hashMap;
    }

    public static void a(Context context, String str, fw[] fwVarArr, Map<String, Document> map, String str2, f fVar) {
        if (fwVarArr == null || fwVarArr.length == 0) {
            fVar.a(f2857a);
        } else {
            a(context, str, fwVarArr, map, true, str2, fVar, new e(), new HashMap());
        }
    }

    private static void a(Context context, String str, fw[] fwVarArr, Map<String, Document> map, boolean z, String str2, f fVar, e eVar, Map<String, Document> map2) {
        com.google.android.finsky.b.y a2;
        ArrayList arrayList = null;
        com.google.android.finsky.b.x xVar = FinskyApp.a().v;
        for (fw fwVar : fwVarArr) {
            if (!map2.containsKey(fwVar.f3849a) && ((a2 = xVar.a(fwVar.f3849a)) == null || a2.c < fwVar.c)) {
                Document document = map.get(fwVar.f3849a);
                if (document != null) {
                    if (document.E().e >= fwVar.c) {
                        map2.put(fwVar.f3849a, document);
                    } else {
                        FinskyLog.c("Package %s requires %s version %d but doc offers %d", str, fwVar.f3849a, Integer.valueOf(fwVar.c), Integer.valueOf(document.E().e));
                        fVar.a((VolleyError) null);
                        return;
                    }
                } else {
                    ArrayList arrayList2 = arrayList == null ? new ArrayList() : arrayList;
                    arrayList2.add(fwVar.f3849a);
                    arrayList = arrayList2;
                }
            }
        }
        if (arrayList == null) {
            if (map2.isEmpty()) {
                fVar.a(f2857a);
                return;
            } else {
                fVar.a(new ArrayList(map2.values()));
                return;
            }
        }
        com.google.android.finsky.api.model.t tVar = new com.google.android.finsky.api.model.t(context, FinskyApp.a().r, FinskyApp.a().p, FinskyApp.a().b(), FinskyApp.a().v, z);
        Map<String, List<String>> a3 = FinskyApp.a().s.a(FinskyApp.a().p, arrayList, str2);
        tVar.a(str2, a3);
        tVar.a(new c(tVar, arrayList, context, str, fwVarArr, map, z, str2, fVar, eVar, map2));
        tVar.a(new d(str, fVar));
        tVar.a(a3);
    }

    static /* synthetic */ void a(List list, List list2, Context context, String str, fw[] fwVarArr, Map map, boolean z, String str2, f fVar, e eVar, Map map2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Document document = (Document) it.next();
            String str3 = document.E().w;
            map.put(str3, document);
            list2.remove(str3);
        }
        if (!list2.isEmpty()) {
            FinskyLog.c("Failed to fetched dependencies %s needed for %s", list2, str);
            fVar.a((VolleyError) null);
        } else {
            a(context, str, fwVarArr, map, z, str2, fVar, eVar, map2);
        }
    }
}
