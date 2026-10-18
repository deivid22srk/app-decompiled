package com.google.android.finsky.billing.apkg;

import android.os.Bundle;
import com.google.android.finsky.layout.BillingAddress;
import com.google.android.finsky.layout.p;
import com.google.android.finsky.protos.aq;
import com.google.android.finsky.protos.sa;

/* loaded from: classes.dex */
public final class d implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f2145a;

    d(b bVar) {
        this.f2145a = bVar;
    }

    @Override // com.google.android.finsky.layout.p
    public final void a(sa saVar) {
        BillingAddress billingAddress;
        aq aqVar;
        g gVar;
        g gVar2;
        billingAddress = this.f2145a.g;
        aqVar = this.f2145a.f2143b;
        billingAddress.a(saVar, aqVar, null);
        gVar = this.f2145a.f2142a;
        if (gVar != null) {
            Bundle bundle = new Bundle();
            this.f2145a.c(bundle);
            gVar2 = this.f2145a.f2142a;
            gVar2.a(saVar.f4367a, bundle);
        }
    }
}
