package com.google.android.finsky.g;

import android.accounts.Account;

/* loaded from: classes.dex */
final class an implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Account f2803a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String[] f2804b;
    final /* synthetic */ Runnable c;
    final /* synthetic */ String d;
    final /* synthetic */ aj e;

    an(aj ajVar, Account account, String[] strArr, Runnable runnable, String str) {
        this.e = ajVar;
        this.f2803a = account;
        this.f2804b = strArr;
        this.c = runnable;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.e) {
            this.e.c.get(this.f2803a).a(this.f2804b, this.c, this.d);
        }
    }
}
