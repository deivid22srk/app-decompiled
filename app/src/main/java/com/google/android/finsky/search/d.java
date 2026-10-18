package com.google.android.finsky.search;

import com.android.volley.t;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
final class d implements t<JSONArray> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n f4521a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f4522b;

    d(c cVar, n nVar) {
        this.f4522b = cVar;
        this.f4521a = nVar;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(JSONArray jSONArray) {
        g gVar;
        try {
            JSONArray jSONArray2 = jSONArray.getJSONArray(1);
            int length = jSONArray2.length();
            gVar = this.f4522b.f;
            gVar.a(this.f4522b.c, 1, length, null, this.f4522b.e);
            for (int i = 0; i < length; i++) {
                this.f4522b.f4520b.a(jSONArray2.getString(i), null, null, null, null, null, false, 2);
            }
        } catch (JSONException e) {
        } finally {
            this.f4521a.a();
        }
    }
}
