package com.google.android.finsky.placesapi;

import com.android.volley.ParseError;
import com.android.volley.VolleyError;
import com.android.volley.s;
import com.android.volley.t;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class l<T> implements t<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private final t<T> f3570a;

    /* renamed from: b, reason: collision with root package name */
    private final s f3571b;

    protected abstract T a(JSONObject jSONObject);

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (!"OK".equals(jSONObject2.optString("status"))) {
            if (this.f3571b != null) {
                this.f3571b.a(new VolleyError("Response status not OK"));
            }
        } else {
            try {
                this.f3570a.a_(a(jSONObject2));
            } catch (JSONException e) {
                if (this.f3571b != null) {
                    this.f3571b.a(new ParseError(e));
                }
            }
        }
    }

    public l(t<T> tVar, s sVar) {
        this.f3570a = tVar;
        this.f3571b = sVar;
    }
}
