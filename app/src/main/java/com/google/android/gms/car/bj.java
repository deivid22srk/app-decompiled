package com.google.android.gms.car;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public abstract class bj extends Binder implements bi {
    public static bi a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.ICarAudioRecord");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof bi)) ? new bk(iBinder) : (bi) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.car.ICarAudioRecord");
                a(bm.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.car.ICarAudioRecord");
                b(bm.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.car.ICarAudioRecord");
                c(bm.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.car.ICarAudioRecord");
                ParcelFileDescriptor d = d(bm.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (d == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                d.writeToParcel(parcel2, 1);
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.car.ICarAudioRecord");
                e(bm.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.car.ICarAudioRecord");
                a(bm.a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.car.ICarAudioRecord");
                boolean b2 = b(bm.a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(b2 ? 1 : 0);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.car.ICarAudioRecord");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
