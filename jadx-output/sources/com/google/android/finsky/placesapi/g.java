package com.google.android.finsky.placesapi;

import com.android.volley.s;
import com.android.volley.t;
import com.google.android.finsky.utils.cz;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class g extends l<h> {
    public g(t<h> tVar, s sVar) {
        super(tVar, sVar);
    }

    @Override // com.google.android.finsky.placesapi.l
    protected final /* synthetic */ h a(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONArray("predictions");
        ArrayList a2 = cz.a(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            a2.add(new e(jSONObject2.getString("description"), jSONObject2.getString("reference")));
        }
        return new h(a2);
    }
}
