package com.google.android.finsky;

import android.os.AsyncTask;
import com.google.android.finsky.download.am;
import com.google.android.finsky.utils.bg;

/* loaded from: classes.dex */
final class q extends AsyncTask<Void, Void, Void> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FinskyApp f4426a;

    q(FinskyApp finskyApp) {
        this.f4426a = finskyApp;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Void doInBackground(Void[] voidArr) {
        bg.aC.a((com.google.android.finsky.c.o<Long>) Long.valueOf(am.d()));
        return null;
    }
}
