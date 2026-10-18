package com.google.android.finsky.wear;

import android.accounts.Account;
import com.google.android.finsky.FinskyApp;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
final class ag extends com.google.android.vending.a.a.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f5077a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(String str) {
        super(null, null);
        this.f5077a = str;
    }

    @Override // com.google.android.vending.a.a.d
    public final com.google.android.vending.a.a.a a(Account account) {
        Map map;
        com.google.android.vending.a.a.a aVar;
        Map map2;
        String str = account.name;
        String str2 = this.f5077a;
        if (ad.f5073a == null) {
            map = null;
            aVar = null;
        } else {
            Map map3 = ad.f5073a.get(str);
            if (map3 == null) {
                map = map3;
                aVar = null;
            } else {
                map = map3;
                aVar = (com.google.android.vending.a.a.a) map3.get(str2);
            }
        }
        if (aVar != null) {
            return aVar;
        }
        com.google.android.vending.a.a.c cVar = FinskyApp.a().c(str).f7100b;
        com.android.volley.o oVar = FinskyApp.a().f1434a;
        d c = d.c(str2);
        com.google.android.vending.a.a.c cVar2 = new com.google.android.vending.a.a.c(FinskyApp.a(), cVar.f7102a.f1196a, Locale.getDefault(), c.e, c.c, c.s, c.q, c.r, c.p, c.h, Integer.toString(c.o), com.google.android.finsky.api.d.r.b(), c.g, com.google.android.vending.a.a.c.a(c.d, c.c, c.o, c.h, c.j, c.m, c.n, c.l, c.k, false));
        ad.a(cVar, "X-DFE-Device-Id", cVar2, "X-DFE-Proxy-Device-Id");
        ad.a(cVar, "X-DFE-MCCMNC", cVar2, "X-DFE-Proxy-MCCMNC");
        ad.a(cVar, "X-DFE-Logging-Id", cVar2, "X-DFE-Proxy-Logging-ID");
        ad.a(cVar, "User-Agent", cVar2, "X-DFE-Proxy-User-Agent");
        com.google.android.vending.a.a.a aVar2 = new com.google.android.vending.a.a.a(oVar, cVar2);
        if (ad.f5073a == null) {
            ad.f5073a = new HashMap();
        }
        if (map == null) {
            map2 = new HashMap();
            ad.f5073a.put(str, map2);
        } else {
            map2 = map;
        }
        map2.put(str2, aVar2);
        return aVar2;
    }
}
