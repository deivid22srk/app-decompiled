package com.google.android.finsky.billing;

/* loaded from: classes.dex */
final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.billing.lightpurchase.billingprofile.g f2413a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ o f2414b;

    p(o oVar, com.google.android.finsky.billing.lightpurchase.billingprofile.g gVar) {
        this.f2414b = oVar;
        this.f2413a = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2414b.d.b(this.f2413a.h, this.f2413a.g, this.f2414b);
    }
}
