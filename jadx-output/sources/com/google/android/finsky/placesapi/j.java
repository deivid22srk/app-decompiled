package com.google.android.finsky.placesapi;

import com.android.volley.s;
import com.android.volley.t;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class j extends l<k> {

    /* renamed from: a, reason: collision with root package name */
    private a f3568a;

    public j(a aVar, t<k> tVar, s sVar) {
        super(tVar, sVar);
        this.f3568a = aVar;
    }

    @Override // com.google.android.finsky.placesapi.l
    protected final /* synthetic */ k a(JSONObject jSONObject) {
        return k.a(jSONObject.getJSONObject("result"), this.f3568a);
    }
}
