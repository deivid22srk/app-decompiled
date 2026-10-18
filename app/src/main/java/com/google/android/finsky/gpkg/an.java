package com.google.android.finsky.gpkg;

import android.accounts.Account;

/* loaded from: classes.dex */
public final class an implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Account f2803a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String[] f2804b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ String d;
    public final /* synthetic */ aj e;

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
