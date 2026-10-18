package com.google.android.finsky.auth;

import com.android.volley.a.x;
import com.android.volley.s;
import com.android.volley.t;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class m extends x {
    private final Map<String, String> j;

    public static JSONObject a(String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("credentialType", z ? "pin" : "password");
            jSONObject.put("credential", str);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException("Error while creating verification request");
        }
    }

    public m(String str, String str2, String str3, JSONObject jSONObject, t<JSONObject> tVar, s sVar) {
        super(str, jSONObject, tVar, sVar);
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
