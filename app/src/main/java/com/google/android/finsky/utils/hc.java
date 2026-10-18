package com.google.android.finsky.utils;

import com.google.android.finsky.protos.nz;

/* loaded from: classes.dex */
final class hc implements com.android.volley.t<nz> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.api.b f4952a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f4953b;
    final /* synthetic */ hh c;

    hc(com.google.android.finsky.api.b bVar, String str, hh hhVar) {
        this.f4952a = bVar;
        this.f4953b = str;
        this.c = hhVar;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(nz nzVar) {
        this.f4952a.a(this.f4953b);
        di.a(this.f4952a);
        if (this.c == null) {
            return;
        }
        this.c.a(-1);
    }
}
