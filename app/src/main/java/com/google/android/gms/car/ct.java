package com.google.android.gms.car;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class ct extends Binder implements cs {
    public static cs a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.ICarMediaPlaybackStatus");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof cs)) ? new cu(iBinder) : (cs) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.car.ICarMediaPlaybackStatus");
                a(cw.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.car.ICarMediaPlaybackStatus");
                a(cw.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createByteArray(), parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.car.ICarMediaPlaybackStatus");
                boolean a2 = a(cw.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(a2 ? 1 : 0);
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.car.ICarMediaPlaybackStatus");
                boolean b2 = b(cw.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(b2 ? 1 : 0);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.car.ICarMediaPlaybackStatus");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
