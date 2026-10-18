package com.google.android.finsky.billing.lightpurchase;

import com.google.android.finsky.protos.mn;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class k implements com.android.volley.t<mn> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f2389a;

    private k(e eVar) {
        this.f2389a = eVar;
    }

    /* synthetic */ k(e eVar, byte b2) {
        this(eVar);
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(mn mnVar) {
        boolean z;
        mn mnVar2 = mnVar;
        z = this.f2389a.e;
        if (!z) {
            FinskyLog.e("InstantPurchaseResponse doesn't match local state", new Object[0]);
            this.f2389a.e = true;
        }
        e.a(this.f2389a, mnVar2.f4136a, mnVar2.f4137b);
    }
}
