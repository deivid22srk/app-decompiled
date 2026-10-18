package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class ng extends Binder implements nf {
    public static nf a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.deviceconnection.internal.IDeviceConnectionService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof nf)) ? new nh(iBinder) : (nf) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1001:
                parcel.enforceInterface("com.google.android.gms.deviceconnection.internal.IDeviceConnectionService");
                a(nd.a(parcel.readStrongBinder()), parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 1002:
                parcel.enforceInterface("com.google.android.gms.deviceconnection.internal.IDeviceConnectionService");
                a(nd.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.deviceconnection.internal.IDeviceConnectionService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
