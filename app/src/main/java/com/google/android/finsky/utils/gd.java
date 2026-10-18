package com.google.android.finsky.utils;

import android.accounts.Account;

/* loaded from: classes.dex */
final class gd implements com.android.volley.t<com.google.android.finsky.protos.jr> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Account f4895a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f4896b;
    final /* synthetic */ boolean c;
    final /* synthetic */ gc d;

    gd(gc gcVar, Account account, String str, boolean z) {
        this.d = gcVar;
        this.f4895a = account;
        this.f4896b = str;
        this.c = z;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(com.google.android.finsky.protos.jr jrVar) {
        com.google.android.finsky.gpkg.ah ahVar;
        ahVar = this.d.g;
        ahVar.a(this.f4895a, "modifed_preregistration", new ge(this), jrVar.f4005a);
    }
}
