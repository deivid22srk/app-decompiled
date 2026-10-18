package com.google.android.finsky.services;

import com.android.volley.VolleyError;

/* loaded from: classes.dex */
final class ac implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.deivid22srk.store.licensing.a f4565a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aa f4566b;

    ac(aa aaVar, com.deivid22srk.store.licensing.a aVar) {
        this.f4566b = aaVar;
        this.f4565a = aVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        LicensingService.a(this.f4565a, 257, null, null);
    }
}
