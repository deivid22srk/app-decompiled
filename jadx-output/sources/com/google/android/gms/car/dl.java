package com.google.android.gms.car;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class dl extends Binder implements dk {
    public static dk a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.ICarPhoneStatus");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof dk)) ? new dm(iBinder) : (dk) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.car.ICarPhoneStatus");
                a(Cdo.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? CarPhoneStatus.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.car.ICarPhoneStatus");
                boolean a2 = a(Cdo.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(a2 ? 1 : 0);
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.car.ICarPhoneStatus");
                boolean b2 = b(Cdo.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(b2 ? 1 : 0);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.car.ICarPhoneStatus");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
