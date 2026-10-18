package com.google.android.finsky.activities;

import android.accounts.Account;
import android.os.Bundle;
import android.view.View;
import com.deivid22srk.store.R;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
final class ce implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Document f1649a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Account f1650b;
    final /* synthetic */ cc c;

    ce(cc ccVar, Document document, Account account) {
        this.c = ccVar;
        this.f1649a = document;
        this.f1650b = account;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        android.support.v4.app.ad adVar = this.c.d.B;
        if (adVar.a("DetailsSummaryViewBinder.confirm_cancel_dialog") == null) {
            this.c.r.a(235, (byte[]) null, this.c.s);
            String string = this.c.e.getResources().getString(R.string.confirm_preorder_cancel, this.f1649a.f1963a.i);
            gn gnVar = new gn();
            gnVar.a(string).d(R.string.yes).e(R.string.no).a(305, this.f1649a.f1963a.R, 245, 246, null);
            Bundle bundle = new Bundle();
            bundle.putParcelable("DetailsSummaryViewBinder.doc", this.f1649a);
            bundle.putString("DetailsSummaryViewBinder.ownerAccountName", this.f1650b.name);
            gnVar.a(this.c.d, 7, bundle);
            gnVar.b().a(adVar, "DetailsSummaryViewBinder.confirm_cancel_dialog");
        }
    }
}
