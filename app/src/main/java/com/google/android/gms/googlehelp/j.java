package com.google.android.gms.googlehelp;

import android.os.AsyncTask;

/* loaded from: classes.dex */
final class j extends AsyncTask<Void, Void, Void> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.common.api.m f5851a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f5852b;

    j(com.google.android.gms.common.api.m mVar, l lVar) {
        this.f5851a = mVar;
        this.f5852b = lVar;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Void doInBackground(Void[] voidArr) {
        if (this.f5851a.c().b()) {
            this.f5852b.a().a(new k(this));
            return null;
        }
        this.f5852b.b();
        this.f5851a.d();
        return null;
    }
}
