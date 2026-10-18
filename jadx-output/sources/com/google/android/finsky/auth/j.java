package com.google.android.finsky.auth;

import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f2023a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2024b;
    public final k c;

    private j(int i, String str, k kVar) {
        this.f2023a = i;
        this.f2024b = str;
        this.c = kVar;
    }

    public j(int i) {
        this(i, null, null);
    }

    static j a(JSONObject jSONObject, boolean z) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("password");
        JSONObject jSONObject3 = jSONObject.getJSONObject("pin");
        String str = null;
        if (FinskyApp.a().e().a(12603105L)) {
            try {
                str = jSONObject3.getString(z ? "recoveryUrl" : "recovery_url");
            } catch (JSONException e) {
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = jSONObject3.getString(z ? "resetUrl" : "reset_url");
        }
        return new j(0, jSONObject2.getString("status"), new k(jSONObject3.getString("status"), str));
    }
}
