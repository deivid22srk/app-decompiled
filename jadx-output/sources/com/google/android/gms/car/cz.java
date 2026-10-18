package com.google.android.gms.car;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class cz extends Binder implements cy {
    public static cy a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.ICarMessage");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof cy)) ? new da(iBinder) : (cy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.car.ICarMessage");
                a(dc.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.car.ICarMessage");
                b(dc.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.car.ICarMessage");
                boolean a2 = a(dc.a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(a2 ? 1 : 0);
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.car.ICarMessage");
                a(dc.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.car.ICarMessage");
                int[] a3 = a(dc.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeIntArray(a3);
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.car.ICarMessage");
                b(dc.a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.car.ICarMessage");
                c(dc.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.car.ICarMessage");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
