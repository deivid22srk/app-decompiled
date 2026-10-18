package com.google.android.finsky.billing.lightpurchase.c;

import android.view.View;
import com.android.vending.R;
import com.google.android.finsky.billing.lightpurchase.PurchaseFragment;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
final class h implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f2355a;

    h(g gVar) {
        this.f2355a = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.google.android.finsky.a.i iVar;
        iVar = this.f2355a.ao;
        iVar.a(719, (byte[]) null, this.f2355a);
        ik.a(view.getContext(), this.f2355a.f_(R.string.content_description_unselected_voucher_entry), view);
        ((PurchaseFragment) g.b(this.f2355a)).a((String) null);
    }
}
