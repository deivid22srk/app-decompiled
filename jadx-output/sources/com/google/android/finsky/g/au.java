package com.google.android.finsky.g;

import android.accounts.Account;
import com.google.android.finsky.protos.od;

/* loaded from: classes.dex */
public final class au implements com.android.volley.t<od> {

    /* renamed from: a, reason: collision with root package name */
    private final ah f2809a;

    /* renamed from: b, reason: collision with root package name */
    private final Account f2810b;
    private final Runnable c;

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(od odVar) {
        this.f2809a.a(this.f2810b, "revoke", this.c, odVar.f4202a);
    }

    public au(ah ahVar, Account account, Runnable runnable) {
        this.f2809a = ahVar;
        this.f2810b = account;
        this.c = runnable;
    }
}
