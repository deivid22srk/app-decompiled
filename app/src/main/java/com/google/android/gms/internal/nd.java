package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;

/* loaded from: classes.dex */
public abstract class nd extends Binder implements nc {
    public nd() {
        attachInterface(this, "com.google.android.gms.deviceconnection.internal.IDeviceConnectionCallbacks");
    }

    public static nc a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.deviceconnection.internal.IDeviceConnectionCallbacks");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof nc)) ? new ne(iBinder) : (nc) queryLocalInterface;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        DataHolder dataHolder;
        switch (i) {
            case 1001:
                parcel.enforceInterface("com.google.android.gms.deviceconnection.internal.IDeviceConnectionCallbacks");
                if (parcel.readInt() != 0) {
                    com.google.android.gms.common.data.e eVar = DataHolder.CREATOR;
                    dataHolder = com.google.android.gms.common.data.e.a(parcel);
                } else {
                    dataHolder = null;
                }
                a(dataHolder);
                parcel2.writeNoException();
                return true;
            case 1002:
                parcel.enforceInterface("com.google.android.gms.deviceconnection.internal.IDeviceConnectionCallbacks");
                a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.deviceconnection.internal.IDeviceConnectionCallbacks");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
