package com.google.android.finsky.utils;

import android.text.TextUtils;
import com.android.volley.ServerError;
import com.google.android.finsky.protos.pw;

/* loaded from: classes.dex */
final class cj implements com.android.volley.t<pw> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.api.b f4801a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f4802b;
    final /* synthetic */ cl c;
    final /* synthetic */ boolean d;

    cj(com.google.android.finsky.api.b bVar, boolean z, cl clVar, boolean z2) {
        this.f4801a = bVar;
        this.f4802b = z;
        this.c = clVar;
        this.d = z2;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(pw pwVar) {
        pw pwVar2 = pwVar;
        String str = pwVar2.L;
        com.google.android.finsky.cpkg.o<String> b2 = bg.aF.b(this.f4801a.c());
        if (TextUtils.isEmpty(str)) {
            b2.c();
        } else {
            b2.a((com.google.android.finsky.cpkg.o<String>) str);
        }
        if (!pwVar2.u) {
            this.c.a(pwVar2);
            return;
        }
        FinskyLog.a("Server requests device config token", new Object[0]);
        am.a().c();
        this.f4801a.d();
        if (!this.f4802b) {
            FinskyLog.c("Failed to converge on device config for TOC", new Object[0]);
            this.c.a(new ServerError());
        } else {
            com.google.android.finsky.api.b bVar = this.f4801a;
            am.a().a(bVar, false, new ci(bVar, this.d, this.c));
        }
    }
}
