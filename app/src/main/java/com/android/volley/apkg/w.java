package com.android.volley.apkg;

import com.android.volley.ParseError;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class w extends y<JSONArray> {
    public w(String str, com.android.volley.t<JSONArray> tVar, com.android.volley.s sVar) {
        super(0, str, null, tVar, sVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.apkg.y, com.android.volley.l
    public final com.android.volley.r<JSONArray> a(com.android.volley.k kVar) {
        try {
            return com.android.volley.r.a(new JSONArray(new String(kVar.f1244b, l.a(kVar.c, "utf-8"))), l.a(kVar));
        } catch (UnsupportedEncodingException e) {
            return com.android.volley.r.a(new ParseError(e));
        } catch (JSONException e2) {
            return com.android.volley.r.a(new ParseError(e2));
        }
    }
}
