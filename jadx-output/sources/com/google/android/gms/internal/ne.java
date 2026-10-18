package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;

/* loaded from: classes.dex */
final class ne implements nc {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f6182a;

    ne(IBinder iBinder) {
        this.f6182a = iBinder;
    }

    @Override // com.google.android.gms.internal.nc
    public final void a(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.deviceconnection.internal.IDeviceConnectionCallbacks");
            obtain.writeInt(i);
            this.f6182a.transact(1002, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.nc
    public final void a(DataHolder dataHolder) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.deviceconnection.internal.IDeviceConnectionCallbacks");
            if (dataHolder != null) {
                obtain.writeInt(1);
                dataHolder.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6182a.transact(1001, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6182a;
    }
}
