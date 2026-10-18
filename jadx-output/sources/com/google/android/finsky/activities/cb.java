package com.google.android.finsky.activities;

import android.accounts.Account;
import android.content.Intent;
import android.view.View;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
final class cb implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Account f1644a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bz f1645b;

    cb(bz bzVar, Account account) {
        this.f1645b = bzVar;
        this.f1644a = account;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FinskyApp.a().h().a(285, (byte[]) null, this.f1645b.s);
        int i = this.f1645b.g.f1963a.g;
        if (!com.google.android.finsky.utils.cr.a(this.f1645b.e.getPackageManager(), i)) {
            this.f1645b.c.b(i);
            return;
        }
        Intent a2 = com.google.android.finsky.utils.cr.a(this.f1645b.e, this.f1645b.g, this.f1644a.name);
        a2.addFlags(268435456);
        this.f1645b.e.startActivity(a2);
    }
}
