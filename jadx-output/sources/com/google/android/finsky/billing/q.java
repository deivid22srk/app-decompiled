package com.google.android.finsky.billing;

import android.view.View;

/* loaded from: classes.dex */
final class q implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.billing.lightpurchase.billingprofile.g f2418a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ byte[] f2419b;
    final /* synthetic */ o c;

    q(o oVar, com.google.android.finsky.billing.lightpurchase.billingprofile.g gVar, byte[] bArr) {
        this.c = oVar;
        this.f2418a = gVar;
        this.f2419b = bArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.c.d.a(803, this.f2418a.g, this.c);
        this.c.f2410a.a(this.f2418a.e, this.f2419b);
    }
}
