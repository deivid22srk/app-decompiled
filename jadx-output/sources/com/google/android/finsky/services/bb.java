package com.google.android.finsky.services;

import com.android.volley.VolleyError;

/* loaded from: classes.dex */
final class bb implements com.google.android.finsky.utils.ap {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.utils.am f4607a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f4608b;
    final /* synthetic */ VpaService c;

    bb(VpaService vpaService, com.google.android.finsky.utils.am amVar, String str) {
        this.c = vpaService;
        this.f4607a = amVar;
        this.f4608b = str;
    }

    @Override // com.google.android.finsky.utils.ap
    public final void a() {
        this.c.a(this.f4608b, this.f4607a.b());
    }

    @Override // com.google.android.finsky.utils.ap
    public final void a(VolleyError volleyError) {
        this.c.a(this.f4608b, (String) null);
    }
}
