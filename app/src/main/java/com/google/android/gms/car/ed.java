package com.google.android.gms.car;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public abstract class ed extends Binder implements ec {
    public static ec a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.ICarVendorExtension");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof ec)) ? new ee(iBinder) : (ec) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.car.ICarVendorExtension");
                boolean a2 = a(eg.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(a2 ? 1 : 0);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.car.ICarVendorExtension");
                b(eg.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.car.ICarVendorExtension");
                String c = c(eg.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeString(c);
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.car.ICarVendorExtension");
                byte[] d = d(eg.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeByteArray(d);
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.car.ICarVendorExtension");
                ParcelFileDescriptor e = e(eg.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (e == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                e.writeToParcel(parcel2, 1);
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.car.ICarVendorExtension");
                a(eg.a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.car.ICarVendorExtension");
                b(eg.a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.car.ICarVendorExtension");
                ParcelFileDescriptor f = f(eg.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (f == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                f.writeToParcel(parcel2, 1);
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.car.ICarVendorExtension");
                c(eg.a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.car.ICarVendorExtension");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
