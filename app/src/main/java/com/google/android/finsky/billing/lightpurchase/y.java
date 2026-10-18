package com.google.android.finsky.billing.lightpurchase;

import android.content.Intent;

/* loaded from: classes.dex */
final class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f2406a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Intent f2407b;
    final /* synthetic */ LightPurchaseFlowActivity c;

    y(LightPurchaseFlowActivity lightPurchaseFlowActivity, int i, Intent intent) {
        this.c = lightPurchaseFlowActivity;
        this.f2406a = i;
        this.f2407b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LightPurchaseFlowActivity.d(this.c, this.f2406a, this.f2407b);
    }
}
