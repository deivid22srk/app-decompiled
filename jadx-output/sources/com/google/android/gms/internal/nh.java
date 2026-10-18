package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class nh implements nf {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f6183a;

    nh(IBinder iBinder) {
        this.f6183a = iBinder;
    }

    @Override // com.google.android.gms.internal.nf
    public final void a(nc ncVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.deviceconnection.internal.IDeviceConnectionService");
            obtain.writeStrongBinder(ncVar != null ? ncVar.asBinder() : null);
            this.f6183a.transact(1002, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.nf
    public final void a(nc ncVar, String[] strArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.deviceconnection.internal.IDeviceConnectionService");
            obtain.writeStrongBinder(ncVar != null ? ncVar.asBinder() : null);
            obtain.writeStringArray(strArr);
            this.f6183a.transact(1001, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6183a;
    }
}
