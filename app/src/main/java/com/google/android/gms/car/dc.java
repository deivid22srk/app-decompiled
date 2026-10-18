package com.google.android.gms.car;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class dc extends Binder implements db {
    public static db a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.ICarMessageCallback");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof db)) ? new dd(iBinder) : (db) queryLocalInterface;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.car.ICarMessageCallback");
                a(parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.car.ICarMessageCallback");
                a(parcel.readInt());
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.car.ICarMessageCallback");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
