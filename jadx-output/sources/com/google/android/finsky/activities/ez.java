package com.google.android.finsky.activities;

import android.view.View;

/* loaded from: classes.dex */
final class ez implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f1732a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PurchaseAuthActivity f1733b;

    ez(PurchaseAuthActivity purchaseAuthActivity, int i) {
        this.f1733b = purchaseAuthActivity;
        this.f1732a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PurchaseAuthActivity.a(this.f1733b, this.f1732a);
        this.f1733b.finish();
    }
}
