package com.google.android.finsky.billing.a;

import com.google.android.finsky.layout.BillingAddress;
import com.google.android.finsky.protos.cj;
import com.google.android.finsky.protos.db;

/* loaded from: classes.dex */
final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f2147a;

    f(b bVar) {
        this.f2147a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cj cjVar;
        BillingAddress billingAddress;
        cjVar = this.f2147a.i;
        db[] dbVarArr = cjVar.k;
        for (db dbVar : dbVarArr) {
            billingAddress = this.f2147a.g;
            billingAddress.a(dbVar);
        }
    }
}
