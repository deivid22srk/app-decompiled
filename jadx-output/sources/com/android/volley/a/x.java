package com.android.volley.a;

import com.android.volley.ParseError;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class x extends y<JSONObject> {
    public x(int i, String str, JSONObject jSONObject, com.android.volley.t<JSONObject> tVar, com.android.volley.s sVar) {
        super(i, str, jSONObject == null ? null : jSONObject.toString(), tVar, sVar);
    }

    public x(String str, JSONObject jSONObject, com.android.volley.t<JSONObject> tVar, com.android.volley.s sVar) {
        this(jSONObject == null ? 0 : 1, str, jSONObject, tVar, sVar);
    }

    @Override // com.android.volley.a.y, com.android.volley.l
    public com.android.volley.r<JSONObject> a(com.android.volley.k kVar) {
        try {
            return com.android.volley.r.a(new JSONObject(new String(kVar.f1244b, l.a(kVar.c, "utf-8"))), l.a(kVar));
        } catch (UnsupportedEncodingException e) {
            return com.android.volley.r.a(new ParseError(e));
        } catch (JSONException e2) {
            return com.android.volley.r.a(new ParseError(e2));
        }
    }
}
