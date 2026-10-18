package com.google.android.finsky.receivers;

import android.os.AsyncTask;

/* loaded from: classes.dex */
final class ad extends AsyncTask<Void, Void, Long> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ai f4440a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f4441b;
    final /* synthetic */ com.google.android.finsky.bpkg.t c;
    final /* synthetic */ aj d;
    final /* synthetic */ u e;

    ad(u uVar, ai aiVar, long j, com.google.android.finsky.bpkg.t tVar, aj ajVar) {
        this.e = uVar;
        this.f4440a = aiVar;
        this.f4441b = j;
        this.c = tVar;
        this.d = ajVar;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Long l) {
        Long l2 = l;
        this.f4440a.f = l2.longValue();
        if (l2.longValue() > 0) {
            if (com.google.android.finsky.cpkg.d.bB.b().longValue() + ((com.google.android.finsky.cpkg.d.bA.b().intValue() * this.f4441b) / 100) <= l2.longValue()) {
                this.f4440a.f4451b |= 4096;
            }
        }
        this.e.a(this.c, this.f4440a, this.d);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Long doInBackground(Void[] voidArr) {
        return Long.valueOf(com.google.android.finsky.download.am.b());
    }
}
