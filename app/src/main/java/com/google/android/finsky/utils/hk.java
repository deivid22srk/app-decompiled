package com.google.android.finsky.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class hk implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final hj f4962a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f4963b;

    /* synthetic */ hk(Context context, hj hjVar, byte b2) {
        this(context, hjVar);
    }

    private hk(Context context, hj hjVar) {
        this.f4963b = context;
        this.f4962a = hjVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Boolean bool;
        Boolean bool2;
        synchronized (hi.class) {
            try {
                try {
                    Boolean unused = hi.f4961b = Boolean.valueOf(com.google.android.c.b.a(iBinder).a());
                } finally {
                    this.f4963b.unbindService(this);
                    hj hjVar = this.f4962a;
                    bool2 = hi.f4961b;
                    hjVar.a(bool2.booleanValue());
                }
            } catch (RemoteException e) {
                FinskyLog.e("Error calling school-ownership service; assume not school-owned", new Object[0]);
                Boolean unused2 = hi.f4961b = false;
                this.f4963b.unbindService(this);
                hj hjVar2 = this.f4962a;
                bool = hi.f4961b;
                hjVar2.a(bool.booleanValue());
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
