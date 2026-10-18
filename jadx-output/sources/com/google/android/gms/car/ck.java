package com.google.android.gms.car;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class ck extends Binder implements cj {
    public ck() {
        attachInterface(this, "com.google.android.gms.car.ICarConnectionListener");
    }

    public static cj a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.ICarConnectionListener");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof cj)) ? new cl(iBinder) : (cj) queryLocalInterface;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.car.ICarConnectionListener");
                a(parcel.readInt());
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.car.ICarConnectionListener");
                a();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.car.ICarConnectionListener");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
