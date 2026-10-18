package com.google.android.gms.car;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class df extends Binder implements de {
    public static de a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.ICarNavigationStatus");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof de)) ? new dg(iBinder) : (de) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.car.ICarNavigationStatus");
                a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.car.ICarNavigationStatus");
                a(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.createByteArray(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.car.ICarNavigationStatus");
                a(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.car.ICarNavigationStatus");
                boolean a2 = a();
                parcel2.writeNoException();
                parcel2.writeInt(a2 ? 1 : 0);
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.car.ICarNavigationStatus");
                CarInstrumentClusterInfo b2 = b();
                parcel2.writeNoException();
                if (b2 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                b2.writeToParcel(parcel2, 1);
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.car.ICarNavigationStatus");
                boolean a3 = a(di.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(a3 ? 1 : 0);
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.car.ICarNavigationStatus");
                boolean b3 = b(di.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(b3 ? 1 : 0);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.car.ICarNavigationStatus");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
