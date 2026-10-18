package com.google.android.gms.car;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
public abstract class cb extends Binder implements ca {
    public static ca a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.ICarCall");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof ca)) ? new cc(iBinder) : (ca) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.car.ICarCall");
                List<CarCall> a2 = a();
                parcel2.writeNoException();
                parcel2.writeTypedList(a2);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.car.ICarCall");
                boolean b2 = b();
                parcel2.writeNoException();
                parcel2.writeInt(b2 ? 1 : 0);
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.car.ICarCall");
                a(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.car.ICarCall");
                int c = c();
                parcel2.writeNoException();
                parcel2.writeInt(c);
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.car.ICarCall");
                int d = d();
                parcel2.writeNoException();
                parcel2.writeInt(d);
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.car.ICarCall");
                a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.car.ICarCall");
                boolean a3 = a(ce.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(a3 ? 1 : 0);
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.car.ICarCall");
                boolean b3 = b(ce.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(b3 ? 1 : 0);
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.car.ICarCall");
                a(parcel.readInt() != 0 ? CarCall.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.car.ICarCall");
                a(parcel.readInt() != 0 ? CarCall.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.car.ICarCall");
                b(parcel.readInt() != 0 ? CarCall.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 12:
                parcel.enforceInterface("com.google.android.gms.car.ICarCall");
                c(parcel.readInt() != 0 ? CarCall.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 13:
                parcel.enforceInterface("com.google.android.gms.car.ICarCall");
                d(parcel.readInt() != 0 ? CarCall.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.car.ICarCall");
                a(parcel.readInt() != 0 ? CarCall.CREATOR.createFromParcel(parcel) : null, (char) parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.car.ICarCall");
                e(parcel.readInt() != 0 ? CarCall.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.car.ICarCall");
                a(parcel.readInt() != 0 ? CarCall.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 17:
                parcel.enforceInterface("com.google.android.gms.car.ICarCall");
                a(parcel.readInt() != 0 ? CarCall.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? CarCall.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 18:
                parcel.enforceInterface("com.google.android.gms.car.ICarCall");
                f(parcel.readInt() != 0 ? CarCall.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 19:
                parcel.enforceInterface("com.google.android.gms.car.ICarCall");
                a(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.car.ICarCall");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
