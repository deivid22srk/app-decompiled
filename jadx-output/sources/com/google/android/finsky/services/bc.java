package com.google.android.finsky.services;

import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.lm;
import com.google.android.finsky.protos.lo;

/* loaded from: classes.dex */
final class bc implements com.android.volley.t<lo> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f4609a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ VpaService f4610b;

    bc(VpaService vpaService, String str) {
        this.f4610b = vpaService;
        this.f4609a = str;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(lo loVar) {
        lo loVar2 = loVar;
        lm lmVar = loVar2.f4090a;
        if (lmVar != null) {
            VpaService.a(this.f4610b, this.f4609a, lmVar);
        }
        com.google.android.finsky.b.a aVar = FinskyApp.a().s;
        aVar.a(new bd(this, loVar2, aVar));
    }
}
