package com.google.android.gms.car;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class az extends Binder implements ay {
    public static ay a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.ICarRetailMode");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof ay)) ? new ba(iBinder) : (ay) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.car.ICarRetailMode");
                a(bc.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.car.ICarRetailMode");
                b(bc.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.car.ICarRetailMode");
                boolean a2 = a();
                parcel2.writeNoException();
                parcel2.writeInt(a2 ? 1 : 0);
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.car.ICarRetailMode");
                boolean b2 = b();
                parcel2.writeNoException();
                parcel2.writeInt(b2 ? 1 : 0);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.car.ICarRetailMode");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
