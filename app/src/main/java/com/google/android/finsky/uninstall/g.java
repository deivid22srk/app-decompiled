package com.google.android.finsky.uninstall;

import android.os.AsyncTask;
import com.google.android.finsky.download.am;

/* loaded from: classes.dex */
final class g extends AsyncTask<Void, Void, Void> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f4695a;

    /* renamed from: b, reason: collision with root package name */
    private long f4696b;
    private long c;

    private g(c cVar) {
        this.f4695a = cVar;
    }

    /* synthetic */ g(c cVar, byte b2) {
        this(cVar);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Void r5) {
        this.f4695a.f = this.f4696b;
        this.f4695a.g = this.c;
        this.f4695a.f4688a = true;
        this.f4695a.b();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Void doInBackground(Void[] voidArr) {
        long intValue = (com.google.android.finsky.cpkg.d.bv.b().intValue() * this.f4695a.i.s()) / 100;
        long d = am.d();
        this.f4696b = intValue + ((10 * d) / 100);
        this.c = d;
        return null;
    }
}
