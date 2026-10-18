package com.google.android.finsky.billing.lightpurchase;

/* loaded from: classes.dex */
final class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f2396a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ LightPurchaseFlowActivity f2397b;

    t(LightPurchaseFlowActivity lightPurchaseFlowActivity, int i) {
        this.f2397b = lightPurchaseFlowActivity;
        this.f2396a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LightPurchaseFlowActivity.a(this.f2397b, this.f2396a);
    }
}
