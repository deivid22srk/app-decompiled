package com.google.android.finsky.activities;

import android.accounts.Account;
import android.content.Intent;
import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class ef implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MainActivity f1713a;

    ef(MainActivity mainActivity) {
        this.f1713a = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String j = FinskyApp.a().j();
        if (j == null) {
            FinskyLog.a("No account, restarting activity after network error", new Object[0]);
            this.f1713a.n();
            return;
        }
        Account a2 = com.google.android.finsky.api.a.a(j, this.f1713a);
        FinskyLog.a("b/5160617: Reinitialize account %s on retry button click", FinskyLog.a(a2.name));
        this.f1713a.a(a2, (Intent) null, false);
        this.f1713a.G();
        this.f1713a.w_();
    }
}
