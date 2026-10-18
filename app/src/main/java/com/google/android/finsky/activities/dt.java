package com.google.android.finsky.activities;

import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class dt implements com.android.volley.s {
    dt() {
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        FinskyLog.d("Error pinging inline app: %s", volleyError.toString());
        com.google.android.finsky.apkg.b bVar = new com.google.android.finsky.apkg.b(522);
        bVar.a(volleyError);
        FinskyApp.a().h().a(bVar.f1473a);
    }
}
