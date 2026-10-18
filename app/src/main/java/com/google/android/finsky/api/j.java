package com.google.android.finsky.api;

import com.google.android.finsky.protos.qf;
import com.google.android.finsky.utils.jb;

/* loaded from: classes.dex */
final class j implements com.android.volley.t<qf> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.android.volley.t f1959a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f1960b;

    j(g gVar, com.android.volley.t tVar) {
        this.f1960b = gVar;
        this.f1959a = tVar;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(qf qfVar) {
        qf qfVar2 = qfVar;
        jb.a(this.f1960b.ao.b(), qfVar2.f4292a);
        this.f1959a.a_(qfVar2);
    }
}
