package com.google.android.finsky.activities;

import android.accounts.Account;
import android.content.Intent;

/* loaded from: classes.dex */
final class ej implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MainActivity f1718a;

    ej(MainActivity mainActivity) {
        this.f1718a = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1718a.a((Account) null, (Intent) null, true);
    }
}
