package com.google.android.finsky.auth;

import android.os.AsyncTask;

/* loaded from: classes.dex */
public final class b extends AsyncTask<Void, Void, n> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f2017a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f2018b;
    final /* synthetic */ String c;
    final /* synthetic */ d d;
    final /* synthetic */ a e;

    public b(a aVar, String str, boolean z, String str2, d dVar) {
        this.e = aVar;
        this.f2017a = str;
        this.f2018b = z;
        this.c = str2;
        this.d = dVar;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(n nVar) {
        n nVar2 = nVar;
        d dVar = this.d;
        int i = nVar2 == null ? 900 : nVar2.f2027a;
        if (i == 0) {
            dVar.a();
        } else {
            dVar.b_(i);
        }
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ n doInBackground(Void[] voidArr) {
        return this.e.f2016b.a(this.e.f2015a, this.f2017a, this.f2018b, this.c);
    }
}
