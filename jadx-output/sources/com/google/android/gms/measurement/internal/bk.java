package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class bk implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bg f6350a;

    bk(bg bgVar) {
        this.f6350a = bgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u uVar = this.f6350a.f6345b;
        if (uVar == null) {
            this.f6350a.l().f6388a.a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            uVar.a(this.f6350a.f().a(this.f6350a.l().b()));
            this.f6350a.p();
        } catch (RemoteException e) {
            this.f6350a.l().f6388a.a("Failed to send app launch to AppMeasurementService", e);
        }
    }
}
