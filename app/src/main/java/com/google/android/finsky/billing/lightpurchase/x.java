package com.google.android.finsky.billing.lightpurchase;

import android.content.Intent;

/* loaded from: classes.dex */
final class x implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f2404a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Intent f2405b;
    final /* synthetic */ LightPurchaseFlowActivity c;

    x(LightPurchaseFlowActivity lightPurchaseFlowActivity, int i, Intent intent) {
        this.c = lightPurchaseFlowActivity;
        this.f2404a = i;
        this.f2405b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LightPurchaseFlowActivity.c(this.c, this.f2404a, this.f2405b);
    }
}
