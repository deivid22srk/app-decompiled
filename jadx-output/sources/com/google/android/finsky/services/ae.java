package com.google.android.finsky.services;

import com.android.volley.VolleyError;

/* loaded from: classes.dex */
final class ae implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.android.vending.licensing.a f4569a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aa f4570b;

    ae(aa aaVar, com.android.vending.licensing.a aVar) {
        this.f4570b = aaVar;
        this.f4569a = aVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        LicensingService.a(this.f4569a, 257, null, null);
    }
}
