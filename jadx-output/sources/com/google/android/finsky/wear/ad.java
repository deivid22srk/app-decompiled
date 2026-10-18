package com.google.android.finsky.wear;

import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class ad {

    /* renamed from: a, reason: collision with root package name */
    static Map<String, Map<String, com.google.android.vending.a.a.a>> f5073a;

    /* renamed from: b, reason: collision with root package name */
    private static Map<String, Map<String, com.google.android.finsky.api.b>> f5074b;

    public static com.google.android.finsky.api.b a(String str) {
        return a(FinskyApp.a().j(), str);
    }

    public static com.google.android.finsky.api.b a(String str, String str2) {
        Map map;
        com.google.android.finsky.api.b bVar;
        Map map2;
        if (f5074b == null) {
            map = null;
            bVar = null;
        } else {
            Map map3 = f5074b.get(str);
            if (map3 == null) {
                map = map3;
                bVar = null;
            } else {
                map = map3;
                bVar = (com.google.android.finsky.api.b) map3.get(str2);
            }
        }
        if (bVar != null) {
            return bVar;
        }
        com.google.android.finsky.api.e a2 = FinskyApp.a().b(str).a();
        com.android.volley.o oVar = FinskyApp.a().f1434a;
        d c = d.c(str2);
        FinskyApp a3 = FinskyApp.a();
        com.android.volley.a.a aVar = a2.c;
        com.android.volley.a aVar2 = a2.d;
        com.google.android.finsky.api.m mVar = a2.e;
        com.google.android.finsky.a.i iVar = a2.f;
        com.google.android.finsky.d.d dVar = a2.f1956b;
        Locale locale = Locale.getDefault();
        String b2 = com.google.android.finsky.api.d.r.b();
        String b3 = a2.b("X-DFE-Filter-Level");
        int intValue = TextUtils.isEmpty(b3) ? 0 : Integer.valueOf(b3).intValue();
        String b4 = a2.b("X-DFE-Content-Filters");
        if (b4 == null) {
            b4 = "";
        }
        com.google.android.finsky.api.e eVar = new com.google.android.finsky.api.e(a3, aVar, aVar2, dVar, mVar, locale, c.p, b2, c.g, intValue, b4, null, iVar, c.e, com.google.android.finsky.api.e.a(c.d, c.c, c.o, c.h, c.j, c.m, c.n, c.l, c.k, false), com.google.android.finsky.utils.ar.a(a3), c.f5122a);
        a(a2, "X-DFE-Device-Id", eVar, "X-DFE-Proxy-Device-Id");
        a(a2, "X-DFE-MCCMNC", eVar, "X-DFE-Proxy-MCCMNC");
        a(a2, "X-DFE-Logging-Id", eVar, "X-DFE-Proxy-Logging-ID");
        a(a2, "User-Agent", eVar, "X-DFE-Proxy-User-Agent");
        eVar.j = new af(c);
        com.google.android.finsky.api.g gVar = new com.google.android.finsky.api.g(oVar, eVar);
        if (f5074b == null) {
            f5074b = new HashMap();
        }
        if (map == null) {
            map2 = new HashMap();
            f5074b.put(str, map2);
        } else {
            map2 = map;
        }
        map2.put(str2, gVar);
        return gVar;
    }

    public static com.google.android.finsky.api.k b(String str) {
        return new ae(str);
    }

    private static void a(com.google.android.finsky.api.e eVar, String str, com.google.android.finsky.api.e eVar2, String str2) {
        String b2 = eVar.b(str);
        if (!TextUtils.isEmpty(b2)) {
            eVar2.a(str2, b2);
        }
    }

    static void a(com.google.android.vending.a.a.c cVar, String str, com.google.android.vending.a.a.c cVar2, String str2) {
        String a2 = cVar.a(str);
        if (!TextUtils.isEmpty(a2)) {
            cVar2.a(str2, a2);
        }
    }
}
