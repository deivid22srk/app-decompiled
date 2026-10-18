package com.google.android.finsky.layout;

import android.view.View;
import com.google.android.finsky.protos.io;

/* loaded from: classes.dex */
public final class ck implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ io f3193a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ byte[] f3194b;
    final /* synthetic */ byte[] c;
    final /* synthetic */ MyAccountPaymentMethodsCard d;

    public ck(MyAccountPaymentMethodsCard myAccountPaymentMethodsCard, io ioVar, byte[] bArr, byte[] bArr2) {
        this.d = myAccountPaymentMethodsCard;
        this.f3193a = ioVar;
        this.f3194b = bArr;
        this.c = bArr2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.google.android.finsky.apkg.i iVar;
        com.google.android.finsky.billing.lightpurchase.billingprofile.a aVar;
        iVar = this.d.f3031b;
        iVar.a(2626, this.f3193a.z, this.d);
        aVar = this.d.j;
        aVar.a(this.f3194b, this.c);
    }
}
