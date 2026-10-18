package com.google.android.gms.car;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class dx extends Binder implements dw {
    public static dw a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.ICarSensor");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof dw)) ? new dy(iBinder) : (dw) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.car.ICarSensor");
                int[] a2 = a();
                parcel2.writeNoException();
                parcel2.writeIntArray(a2);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.car.ICarSensor");
                boolean a3 = a(parcel.readInt(), parcel.readInt(), ea.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(a3 ? 1 : 0);
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.car.ICarSensor");
                CarSensorEvent a4 = a(parcel.readInt());
                parcel2.writeNoException();
                if (a4 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                a4.writeToParcel(parcel2, 1);
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.car.ICarSensor");
                a(parcel.readInt(), ea.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.car.ICarSensor");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
