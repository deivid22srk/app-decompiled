package com.google.android.finsky.activities;

import android.view.View;
import com.android.vending.R;

/* loaded from: classes.dex */
final class bn implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bi f1622a;

    bn(bi biVar) {
        this.f1622a = biVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        android.support.v4.app.ad adVar = this.f1622a.d.B;
        if (adVar.a("deactivate_dialog") == null) {
            this.f1622a.r.a(216, (byte[]) null, this.f1622a.s);
            gn gnVar = new gn();
            gnVar.a(R.string.deactivate_device_admin_msg).d(R.string.ok);
            gnVar.b().a(adVar, "deactivate_dialog");
        }
    }
}
