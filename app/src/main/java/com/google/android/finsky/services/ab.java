package com.google.android.finsky.services;

import com.google.android.finsky.protos.dl;

/* loaded from: classes.dex */
final class ab implements com.android.volley.t<dl> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.deivid22srk.store.licensing.a f4563a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aa f4564b;

    ab(aa aaVar, com.deivid22srk.store.licensing.a aVar) {
        this.f4564b = aaVar;
        this.f4563a = aVar;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(dl dlVar) {
        dl dlVar2 = dlVar;
        LicensingService.a(this.f4563a, dlVar2.f3734a, dlVar2.c, dlVar2.e);
    }
}
