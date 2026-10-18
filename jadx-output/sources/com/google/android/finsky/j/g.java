package com.google.android.finsky.j;

import android.app.ActivityManager;
import com.android.volley.t;
import com.google.android.finsky.utils.FinskyLog;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class g implements t<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f2893a;

    g(d dVar) {
        this.f2893a = dVar;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        try {
            this.f2893a.g = null;
            try {
                this.f2893a.f2890b.setDataSource(d.a(jSONObject2.getString("url")));
                this.f2893a.f2890b.prepareAsync();
                this.f2893a.f2889a.d();
            } catch (IllegalStateException e) {
                FinskyLog.d("Illegal state while preparing audio. Is Monkey=%b.", Boolean.valueOf(ActivityManager.isUserAMonkey()));
            }
        } catch (IOException e2) {
            FinskyLog.d("IOException: %s", e2.getMessage());
            d.a(this.f2893a);
        } catch (JSONException e3) {
            FinskyLog.d("Unable to decode JSON response", new Object[0]);
            d.a(this.f2893a);
        }
    }
}
