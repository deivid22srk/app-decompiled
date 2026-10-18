package com.google.android.finsky.utils;

import com.android.volley.VolleyError;

/* loaded from: classes.dex */
final class gz implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ android.support.v4.app.t f4928a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ hg f4929b;

    gz(android.support.v4.app.t tVar, hg hgVar) {
        this.f4928a = tVar;
        this.f4929b = hgVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        FinskyLog.d("Error getting G+ profile: %s", volleyError.toString());
        gx.a(this.f4928a, (String) null);
        this.f4929b.a();
    }
}
