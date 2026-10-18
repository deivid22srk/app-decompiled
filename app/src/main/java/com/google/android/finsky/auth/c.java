package com.google.android.finsky.auth;

import android.accounts.Account;
import android.os.AsyncTask;
import com.google.android.finsky.utils.jm;

/* loaded from: classes.dex */
final class c extends AsyncTask<Void, Void, j> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f2019a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f2020b;

    c(a aVar, f fVar) {
        this.f2020b = aVar;
        this.f2019a = fVar;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(j jVar) {
        this.f2020b.a(this.f2019a, jVar);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ j doInBackground(Void[] voidArr) {
        if (isCancelled()) {
            return null;
        }
        i iVar = this.f2020b.f2016b;
        Account account = this.f2020b.f2015a;
        jm.b();
        return iVar.a(iVar.b(account));
    }
}
