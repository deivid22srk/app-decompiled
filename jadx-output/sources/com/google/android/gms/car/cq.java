package com.google.android.gms.car;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class cq extends Binder implements cp {
    public static cp a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.ICarMediaBrowserEventListener");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof cp)) ? new cr(iBinder) : (cp) queryLocalInterface;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.car.ICarMediaBrowserEventListener");
                a(parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.car.ICarMediaBrowserEventListener");
                a(parcel.readString(), parcel.readInt());
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.car.ICarMediaBrowserEventListener");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
