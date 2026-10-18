package com.google.android.finsky.billing.lightpurchase;

/* loaded from: classes.dex */
final class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f2398a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ LightPurchaseFlowActivity f2399b;

    u(LightPurchaseFlowActivity lightPurchaseFlowActivity, int i) {
        this.f2399b = lightPurchaseFlowActivity;
        this.f2398a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LightPurchaseFlowActivity.b(this.f2399b, this.f2398a);
    }
}
