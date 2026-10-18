package com.google.android.finsky.billing.lightpurchase;

import android.content.Intent;

/* loaded from: classes.dex */
final class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f2402a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Intent f2403b;
    final /* synthetic */ LightPurchaseFlowActivity c;

    w(LightPurchaseFlowActivity lightPurchaseFlowActivity, int i, Intent intent) {
        this.c = lightPurchaseFlowActivity;
        this.f2402a = i;
        this.f2403b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LightPurchaseFlowActivity.b(this.c, this.f2402a, this.f2403b);
    }
}
