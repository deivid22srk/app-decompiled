package com.google.android.finsky.utils;

import android.content.Context;
import android.os.AsyncTask;

/* loaded from: classes.dex */
final class d extends AsyncTask<Void, Void, Void> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f4815a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Runnable f4816b;

    d(Context context, Runnable runnable) {
        this.f4815a = context;
        this.f4816b = runnable;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Void r2) {
        if (this.f4816b == null) {
            return;
        }
        this.f4816b.run();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Void doInBackground(Void[] voidArr) {
        a.a(this.f4815a);
        return null;
    }
}
