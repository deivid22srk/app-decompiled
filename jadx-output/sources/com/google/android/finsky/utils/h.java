package com.google.android.finsky.utils;

import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
final class h implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f4930a;

    h(f fVar) {
        this.f4930a = fVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        FinskyLog.d("Error pinging ad click: %s", volleyError.toString());
        com.google.android.finsky.a.b bVar = new com.google.android.finsky.a.b(520);
        bVar.a(volleyError);
        FinskyApp.a().h().a(bVar.f1473a);
    }
}
