package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public final class bm implements ServiceConnection, com.google.android.gms.common.api.p, com.google.android.gms.common.api.q {

    /* renamed from: a, reason: collision with root package name */
    volatile boolean f6352a;

    /* renamed from: b, reason: collision with root package name */
    volatile y f6353b;
    final /* synthetic */ bg c;

    protected bm(bg bgVar) {
        this.c = bgVar;
    }

    @Override // com.google.android.gms.common.api.p
    public final void a(Bundle bundle) {
        com.google.android.gms.common.internal.av.b("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            this.f6352a = false;
            try {
                u o = this.f6353b.o();
                this.f6353b = null;
                this.c.k().a(new bp(this, o));
            } catch (DeadObjectException | IllegalStateException e) {
                this.f6353b = null;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.common.internal.av.b("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            this.f6352a = false;
            if (iBinder == null) {
                this.c.l().f6388a.a("Service connected with null binder");
                return;
            }
            u uVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    uVar = v.a(iBinder);
                    this.c.l().g.a("Bound to IMeasurementService interface");
                } else {
                    this.c.l().f6388a.a("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException e) {
                this.c.l().f6388a.a("Service connect failed to get IMeasurementService");
            }
            if (uVar == null) {
                try {
                    com.google.android.gms.common.stats.b.a().a(this.c.i(), this.c.f6344a);
                } catch (IllegalArgumentException e2) {
                }
            } else {
                this.c.k().a(new bn(this, uVar));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.common.internal.av.b("MeasurementServiceConnection.onServiceDisconnected");
        this.c.l().f.a("Service disconnected");
        this.c.k().a(new bo(this, componentName));
    }

    @Override // com.google.android.gms.common.api.p
    public final void a(int i) {
        com.google.android.gms.common.internal.av.b("MeasurementServiceConnection.onConnectionSuspended");
        this.c.l().f.a("Service connection suspended");
        this.c.k().a(new bq(this));
    }

    @Override // com.google.android.gms.common.api.q
    public final void a(ConnectionResult connectionResult) {
        com.google.android.gms.common.internal.av.b("MeasurementServiceConnection.onConnectionFailed");
        this.c.l().f6389b.a("Service connection failed", connectionResult);
        synchronized (this) {
            this.f6352a = false;
            this.f6353b = null;
        }
    }
}
