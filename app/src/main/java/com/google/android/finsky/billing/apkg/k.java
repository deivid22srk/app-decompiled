package com.google.android.finsky.billing.apkg;

import com.android.volley.apkg.af;
import com.android.volley.n;
import com.android.volley.s;
import com.android.volley.t;
import com.google.android.finsky.FinskyApp;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class k extends af {
    public final /* synthetic */ h j;
    public final Map<String, String> k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(h hVar, String str, String str2, String str3, t<String> tVar, s sVar) {
        super(1, str, tVar, sVar);
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        this.j = hVar;
        this.k = new HashMap();
        Map<String, String> map = this.k;
        str4 = h.c;
        str5 = h.h;
        map.put(str4, str5);
        Map<String, String> map2 = this.k;
        str6 = h.d;
        map2.put(str6, str2);
        Map<String, String> map3 = this.k;
        str7 = h.e;
        map3.put(str7, str3);
        Map<String, String> map4 = this.k;
        str8 = h.f;
        str9 = h.i;
        map4.put(str8, str9);
        Map<String, String> map5 = this.k;
        str10 = h.g;
        StringBuilder sb = new StringBuilder();
        str11 = h.j;
        map5.put(str10, sb.append(str11).append(FinskyApp.a().k()).toString());
    }

    @Override // com.android.volley.l
    public final Map<String, String> i() {
        return this.k;
    }

    @Override // com.android.volley.l
    public final n l() {
        return n.HIGH;
    }
}
