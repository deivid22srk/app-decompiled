package com.google.android.finsky.billing.lightpurchase.c;

import android.view.View;
import com.android.vending.R;
import com.google.android.finsky.billing.lightpurchase.PurchaseFragment;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
final class i implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f2356a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f2357b;

    i(g gVar, String str) {
        this.f2357b = gVar;
        this.f2356a = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.google.android.finsky.a.i iVar;
        iVar = this.f2357b.ao;
        iVar.a(718, (byte[]) null, this.f2357b);
        ik.a(view.getContext(), this.f2357b.f_(R.string.content_description_selected_voucher_entry), view);
        ((PurchaseFragment) g.c(this.f2357b)).a(this.f2356a);
    }
}
