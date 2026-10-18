package com.google.android.finsky.billing.lightpurchase;

/* loaded from: classes.dex */
final class z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f2408a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ LightPurchaseFlowActivity f2409b;

    z(LightPurchaseFlowActivity lightPurchaseFlowActivity, int i) {
        this.f2409b = lightPurchaseFlowActivity;
        this.f2408a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LightPurchaseFlowActivity.c(this.f2409b, this.f2408a);
    }
}
