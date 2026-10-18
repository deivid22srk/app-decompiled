package com.google.android.finsky.services;

import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class be implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f4613a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ VpaService f4614b;

    be(VpaService vpaService, String str) {
        this.f4614b = vpaService;
        this.f4613a = str;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        FinskyLog.c("Failed to retrieve preloads: %s", volleyError);
        VpaService.d(this.f4614b);
        FinskyApp.a().f(this.f4613a).b(new com.google.android.finsky.apkg.b(130).a(false).a(volleyError).f1473a);
        VpaService.c(this.f4614b);
    }
}
