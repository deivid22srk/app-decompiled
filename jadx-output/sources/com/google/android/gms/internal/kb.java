package com.google.android.gms.internal;

import android.util.Log;

/* loaded from: classes.dex */
final class kb implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ka f6106a;

    kb(ka kaVar) {
        this.f6106a = kaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        long j;
        com.google.android.gms.common.c.a aVar;
        com.google.android.gms.common.api.m mVar;
        com.google.android.gms.common.api.m mVar2;
        obj = this.f6106a.f;
        synchronized (obj) {
            j = this.f6106a.g;
            aVar = this.f6106a.d;
            if (j <= aVar.b()) {
                mVar = this.f6106a.j;
                if (mVar != null) {
                    Log.i("ClearcutLoggerApiImpl", "disconnect managed GoogleApiClient");
                    mVar2 = this.f6106a.j;
                    mVar2.d();
                    ka.e(this.f6106a);
                }
            }
        }
    }
}
