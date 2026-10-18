package com.google.android.finsky.billing.lightpurchase;

import android.content.Intent;

/* loaded from: classes.dex */
final class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f2400a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Intent f2401b;
    final /* synthetic */ LightPurchaseFlowActivity c;

    v(LightPurchaseFlowActivity lightPurchaseFlowActivity, int i, Intent intent) {
        this.c = lightPurchaseFlowActivity;
        this.f2400a = i;
        this.f2401b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LightPurchaseFlowActivity.a(this.c, this.f2400a, this.f2401b);
    }
}
