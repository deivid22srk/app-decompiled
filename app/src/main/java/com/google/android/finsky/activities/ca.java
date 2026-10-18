package com.google.android.finsky.activities;

import android.accounts.Account;
import android.view.View;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
final class ca implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Account f1642a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bz f1643b;

    ca(bz bzVar, Account account) {
        this.f1643b = bzVar;
        this.f1642a = account;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FinskyApp.a().h().a(286, (byte[]) null, this.f1643b.s);
        if (!com.google.android.finsky.utils.cr.a(this.f1643b.e.getPackageManager())) {
            this.f1643b.c.b(2);
        } else {
            this.f1643b.e.startActivity(com.google.android.finsky.utils.cr.a(2, com.google.android.finsky.cpkg.d.dT.b(), this.f1642a.name));
        }
    }
}
