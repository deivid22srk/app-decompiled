package com.google.android.finsky.layout;

import android.view.View;

/* loaded from: classes.dex */
public final class ci implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MyAccountPaymentMethodsCard f3190a;

    public ci(MyAccountPaymentMethodsCard myAccountPaymentMethodsCard) {
        this.f3190a = myAccountPaymentMethodsCard;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.google.android.finsky.apkg.i iVar;
        com.google.android.finsky.billing.lightpurchase.billingprofile.a aVar;
        iVar = this.f3190a.f3031b;
        iVar.a(2628, (byte[]) null, this.f3190a);
        aVar = this.f3190a.j;
        aVar.u();
    }
}
