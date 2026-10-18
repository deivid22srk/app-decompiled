package com.google.android.finsky.services;

import com.google.android.finsky.protos.rg;

/* loaded from: classes.dex */
final class ad implements com.android.volley.t<rg> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.android.vending.licensing.a f4567a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aa f4568b;

    ad(aa aaVar, com.android.vending.licensing.a aVar) {
        this.f4568b = aaVar;
        this.f4567a = aVar;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(rg rgVar) {
        rg rgVar2 = rgVar;
        LicensingService.a(this.f4567a, rgVar2.f4331a, rgVar2.c, rgVar2.e);
    }
}
