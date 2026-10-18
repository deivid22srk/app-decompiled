package com.google.android.finsky.auth;

import com.android.volley.a.x;
import com.android.volley.s;
import com.android.volley.t;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h extends x {
    private final Map<String, String> j;

    public h(String str, String str2, String str3, t<JSONObject> tVar, s sVar) {
        super(str, null, tVar, sVar);
        this.j = new HashMap();
        g.a(this.j, str2, str3);
    }

    @Override // com.android.volley.l
    public final com.android.volley.n l() {
        return com.android.volley.n.HIGH;
    }

    @Override // com.android.volley.l
    public final Map<String, String> f() {
        return this.j;
    }
}
