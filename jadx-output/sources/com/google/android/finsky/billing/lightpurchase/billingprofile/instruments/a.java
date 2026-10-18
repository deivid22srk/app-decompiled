package com.google.android.finsky.billing.lightpurchase.billingprofile.instruments;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.billing.f;
import com.google.android.finsky.protos.cd;
import com.google.android.finsky.utils.ParcelableProto;

/* loaded from: classes.dex */
public abstract class a extends b {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.c
    public abstract int f();

    protected static void a(String str, cd cdVar, Intent intent) {
        intent.putExtra("authAccount", str);
        intent.putExtra("AddDcb3Instrument.instrument_status", ParcelableProto.a(cdVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.b, com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.c, com.google.android.finsky.billing.lightpurchase.a, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(this.n);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.b
    protected final f i() {
        return new com.google.android.finsky.billing.carrierbilling.a.c(this, this, FinskyApp.a().b(this.p), (cd) ParcelableProto.a(getIntent(), "AddDcb3Instrument.instrument_status"), k());
    }
}
