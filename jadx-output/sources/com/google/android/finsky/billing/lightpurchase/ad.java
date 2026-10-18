package com.google.android.finsky.billing.lightpurchase;

import android.os.SystemClock;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.cy;

/* loaded from: classes.dex */
final class ad implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.g.p f2309a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f2310b;
    final /* synthetic */ VolleyError c;
    final /* synthetic */ long d;
    final /* synthetic */ boolean e;
    final /* synthetic */ PurchaseFragment f;

    ad(PurchaseFragment purchaseFragment, com.google.android.finsky.g.p pVar, String str, VolleyError volleyError, long j, boolean z) {
        this.f = purchaseFragment;
        this.f2309a = pVar;
        this.f2310b = str;
        this.c = volleyError;
        this.d = j;
        this.e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PurchaseParams purchaseParams;
        com.google.android.finsky.a.i iVar;
        e eVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        purchaseParams = this.f.f2278b;
        boolean a2 = cy.a(purchaseParams.f2281a, this.f2309a);
        iVar = this.f.an;
        com.google.android.finsky.a.b a3 = new com.google.android.finsky.a.b(631).b(this.f2310b).a(this.c);
        eVar = this.f.f2277a;
        iVar.b(a3.a(eVar.f2382b).b(elapsedRealtime - this.d).a(a2 != this.e).f1473a);
    }
}
