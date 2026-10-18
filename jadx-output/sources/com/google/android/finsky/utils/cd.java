package com.google.android.finsky.utils;

import com.android.volley.ServerError;
import com.google.android.finsky.protos.on;

/* loaded from: classes.dex */
final class cd implements com.android.volley.t<on> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f4794a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cf f4795b;
    final /* synthetic */ am c;
    final /* synthetic */ com.google.android.finsky.api.b d;

    cd(boolean z, cf cfVar, am amVar, com.google.android.finsky.api.b bVar) {
        this.f4794a = z;
        this.f4795b = cfVar;
        this.c = amVar;
        this.d = bVar;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(on onVar) {
        on onVar2 = onVar;
        if (!onVar2.f4217a) {
            this.f4795b.a(onVar2);
            return;
        }
        FinskyLog.a("Server requests device config token", new Object[0]);
        this.c.c();
        this.d.e();
        if (!this.f4794a) {
            FinskyLog.c("Failed to converge on device config for selfUpdate", new Object[0]);
            this.f4795b.a(new ServerError());
        } else {
            cb.a(false, this.d, this.c, this.f4795b);
        }
    }
}
