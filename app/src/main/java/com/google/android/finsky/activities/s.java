package com.google.android.finsky.activities;

import android.accounts.Account;
import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class s implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Account[] f1869a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f1870b;

    s(d dVar, Account[] accountArr) {
        this.f1870b = dVar;
        this.f1869a = accountArr;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        boolean c;
        String str = this.f1869a[i].name;
        c = d.c(str);
        if (c) {
            this.f1870b.setIntent(new Intent());
            FinskyLog.a("b/5160617: Switching account to %s on user action", FinskyLog.a(str));
            this.f1870b.a(str, (Intent) null);
        }
        this.f1870b.removeDialog(0);
    }
}
