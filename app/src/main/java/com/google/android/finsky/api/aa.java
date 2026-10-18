package com.google.android.finsky.api;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class aa extends com.android.volley.apkg.x {
    public aa(String str, com.android.volley.t<JSONObject> tVar, com.android.volley.s sVar) {
        super(1, str, null, tVar, sVar);
    }

    @Override // com.android.volley.l
    public final Map<String, String> f() {
        HashMap hashMap = new HashMap();
        hashMap.put("X-Device-Logging-ID", d.q.b());
        hashMap.put("X-Device-ID", Long.toHexString(d.p.b().longValue()));
        return hashMap;
    }
}
