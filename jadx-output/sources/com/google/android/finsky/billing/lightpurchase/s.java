package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.dp;
import com.google.android.finsky.utils.gw;

/* loaded from: classes.dex */
final class s implements gw {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ LightPurchaseFlowActivity f2395a;

    s(LightPurchaseFlowActivity lightPurchaseFlowActivity) {
        this.f2395a = lightPurchaseFlowActivity;
    }

    @Override // com.google.android.finsky.utils.gw
    public final void a() {
        dp dpVar;
        dp dpVar2;
        Account account;
        Document document;
        dpVar = this.f2395a.r;
        if (dpVar.c == 1) {
            this.f2395a.r();
            this.f2395a.q();
            return;
        }
        dpVar2 = this.f2395a.r;
        if (dpVar2.e != 6 || FinskyApp.a().e().a(12602952L)) {
            this.f2395a.t();
            return;
        }
        LightPurchaseFlowActivity lightPurchaseFlowActivity = this.f2395a;
        account = this.f2395a.p;
        document = this.f2395a.z;
        if (!com.google.android.finsky.navigationmanager.a.a(lightPurchaseFlowActivity, account, document, this.f2395a.d(), null, 5)) {
            this.f2395a.q();
        }
    }

    @Override // com.google.android.finsky.utils.gw
    public final void b() {
        this.f2395a.finish();
    }
}
