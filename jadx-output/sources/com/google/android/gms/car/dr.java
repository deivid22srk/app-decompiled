package com.google.android.gms.car;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
public abstract class dr extends Binder implements dq {
    public static dq a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.ICarRadio");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof dq)) ? new ds(iBinder) : (dq) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.car.ICarRadio");
                a(du.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.car.ICarRadio");
                b(du.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.car.ICarRadio");
                a(parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.car.ICarRadio");
                b(parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.car.ICarRadio");
                a(parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.car.ICarRadio");
                a(parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.car.ICarRadio");
                a(parcel.readInt(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.car.ICarRadio");
                a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.car.ICarRadio");
                a(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.car.ICarRadio");
                a();
                parcel2.writeNoException();
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.car.ICarRadio");
                b(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 12:
                parcel.enforceInterface("com.google.android.gms.car.ICarRadio");
                c(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 13:
                parcel.enforceInterface("com.google.android.gms.car.ICarRadio");
                d(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.car.ICarRadio");
                List<RadioProperties> b2 = b();
                parcel2.writeNoException();
                parcel2.writeTypedList(b2);
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.car.ICarRadio");
                RadioState c = c();
                parcel2.writeNoException();
                if (c == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                c.writeToParcel(parcel2, 1);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.car.ICarRadio");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
