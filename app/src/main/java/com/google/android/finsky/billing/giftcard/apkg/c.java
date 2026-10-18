package com.google.android.finsky.billing.giftcard.apkg;

import com.google.android.finsky.layout.BillingAddress;
import com.google.android.finsky.layout.p;
import com.google.android.finsky.protos.aq;
import com.google.android.finsky.protos.sa;

/* loaded from: classes.dex */
public final class c implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f2212a;

    c(a aVar) {
        this.f2212a = aVar;
    }

    @Override // com.google.android.finsky.layout.p
    public final void a(sa saVar) {
        BillingAddress billingAddress;
        aq aqVar;
        billingAddress = this.f2212a.d;
        aqVar = this.f2212a.c;
        billingAddress.a(saVar, aqVar, null);
    }
}
