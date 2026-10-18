package com.google.android.finsky.billing.giftcard.apkg;

import com.google.android.finsky.layout.BillingAddress;
import com.google.android.finsky.protos.cj;
import com.google.android.finsky.protos.db;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f2214a;

    e(a aVar) {
        this.f2214a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cj cjVar;
        BillingAddress billingAddress;
        cjVar = this.f2214a.f2210b;
        db[] dbVarArr = cjVar.k;
        for (db dbVar : dbVarArr) {
            billingAddress = this.f2214a.d;
            billingAddress.a(dbVar);
        }
    }
}
