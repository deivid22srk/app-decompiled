package com.google.android.finsky.uninstall;

import android.os.AsyncTask;
import com.google.android.finsky.download.am;

/* loaded from: classes.dex */
final class f extends AsyncTask<Void, Void, Long> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f4693a;

    /* renamed from: b, reason: collision with root package name */
    private long f4694b;

    private f(c cVar) {
        this.f4693a = cVar;
    }

    /* synthetic */ f(c cVar, byte b2) {
        this(cVar);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Long l) {
        Long l2 = l;
        if (this.f4694b > this.f4693a.e) {
            this.f4693a.e = this.f4694b;
            this.f4693a.h = l2.longValue();
        }
        this.f4693a.f4689b = true;
        this.f4693a.b();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Long doInBackground(Void[] voidArr) {
        this.f4694b = System.currentTimeMillis();
        return Long.valueOf(am.c());
    }
}
