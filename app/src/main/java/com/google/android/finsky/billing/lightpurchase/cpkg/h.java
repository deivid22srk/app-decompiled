package com.google.android.finsky.billing.lightpurchase.cpkg;

import android.view.View;
import com.deivid22srk.store.R;
import com.google.android.finsky.billing.lightpurchase.PurchaseFragment;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public final class h implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f2355a;

    h(g gVar) {
        this.f2355a = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.google.android.finsky.apkg.i iVar;
        iVar = this.f2355a.ao;
        iVar.a(719, (byte[]) null, this.f2355a);
        ik.a(view.getContext(), this.f2355a.f_(R.string.content_description_unselected_voucher_entry), view);
        ((PurchaseFragment) g.b(this.f2355a)).a((String) null);
    }
}
