package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class bj implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ UserAttributeParcel f6348a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bg f6349b;

    bj(bg bgVar, UserAttributeParcel userAttributeParcel) {
        this.f6349b = bgVar;
        this.f6348a = userAttributeParcel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u uVar = this.f6349b.f6345b;
        if (uVar == null) {
            this.f6349b.l().f6388a.a("Discarding data. Failed to set user attribute");
            return;
        }
        try {
            uVar.a(this.f6348a, this.f6349b.f().a(this.f6349b.l().b()));
            this.f6349b.p();
        } catch (RemoteException e) {
            this.f6349b.l().f6388a.a("Failed to send attribute to AppMeasurementService", e);
        }
    }
}
