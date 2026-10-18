package com.google.android.finsky.billing.lightpurchase;

import com.google.android.finsky.auth.AuthState;
import com.google.android.finsky.protos.cl;

/* loaded from: classes.dex */
final class ac implements com.google.android.finsky.auth.f {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.auth.a f2307a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cl f2308b;
    final /* synthetic */ PurchaseFragment c;

    ac(PurchaseFragment purchaseFragment, com.google.android.finsky.auth.a aVar, cl clVar) {
        this.c = purchaseFragment;
        this.f2307a = aVar;
        this.f2308b = clVar;
    }

    @Override // com.google.android.finsky.auth.f
    public final void a() {
        if (!this.c.q_()) {
            this.f2307a.a();
        } else {
            this.c.z();
        }
    }

    @Override // com.google.android.finsky.auth.f
    public final void a(AuthState authState) {
        if (this.c.q_()) {
            if (this.c.aj) {
                this.c.A();
            }
            this.c.a(this.f2308b, authState);
        }
    }
}
