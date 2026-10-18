package com.google.android.finsky.billing.lightpurchase.c;

import android.view.View;
import com.android.vending.R;
import com.google.android.finsky.activities.gn;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
final class n implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f2364a;

    n(k kVar) {
        this.f2364a = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2;
        if (this.f2364a.B.a("CvcChallengeStep.cvc_popup") == null) {
            android.support.v4.app.t f = this.f2364a.f();
            view2 = this.f2364a.e;
            ik.a(f, view2);
            gn gnVar = new gn();
            gnVar.b(R.layout.billing_addcreditcard_cvc_popup).d(R.string.close);
            gnVar.b().a(this.f2364a.B, "CvcChallengeStep.cvc_popup");
        }
    }
}
