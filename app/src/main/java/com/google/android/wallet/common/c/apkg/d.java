package com.google.android.wallet.common.c.apkg;

import com.android.volley.apkg.x;
import com.android.volley.s;
import com.android.volley.t;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d extends x {
    public final Map<String, String> j;

    public d(String str, Map<String, String> map, t<JSONObject> tVar, s sVar) {
        super(str, null, tVar, sVar);
        this.j = map;
        if (this.j == null || this.j.isEmpty()) {
            throw new IllegalArgumentException("extraHeaders should not be null or empty");
        }
    }

    @Override // com.android.volley.l
    public final Map<String, String> f() {
        Map<String, String> f = super.f();
        if (f.isEmpty()) {
            return this.j;
        }
        android.support.v4.h.a aVar = new android.support.v4.h.a(this.j.size() + f.size());
        aVar.putAll(f);
        aVar.putAll(this.j);
        return aVar;
    }
}
