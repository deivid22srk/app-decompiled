package com.google.android.gms.car;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class fx extends Binder implements fw {
    public static fw a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.ICarAudio");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof fw)) ? new fy(iBinder) : (fw) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.car.ICarAudio");
                int[] a2 = a();
                parcel2.writeNoException();
                parcel2.writeIntArray(a2);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.car.ICarAudio");
                int[] b2 = b();
                parcel2.writeNoException();
                parcel2.writeIntArray(b2);
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.car.ICarAudio");
                CarAudioConfiguration[] a3 = a(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeTypedArray(a3, 1);
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.car.ICarAudio");
                CarAudioConfiguration a4 = a(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                if (a4 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                a4.writeToParcel(parcel2, 1);
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.car.ICarAudio");
                CarAudioConfiguration[] b3 = b(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeTypedArray(b3, 1);
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.car.ICarAudio");
                CarAudioConfiguration b4 = b(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                if (b4 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                b4.writeToParcel(parcel2, 1);
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.car.ICarAudio");
                int c = c(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(c);
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.car.ICarAudio");
                int d = d(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(d);
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.car.ICarAudio");
                bo a5 = a(bg.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(a5 != null ? a5.asBinder() : null);
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.car.ICarAudio");
                bi b5 = b(bg.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(b5 != null ? b5.asBinder() : null);
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.car.ICarAudio");
                boolean a6 = a(parcel.readLong());
                parcel2.writeNoException();
                parcel2.writeInt(a6 ? 1 : 0);
                return true;
            case 12:
                parcel.enforceInterface("com.google.android.gms.car.ICarAudio");
                boolean b6 = b(parcel.readLong());
                parcel2.writeNoException();
                parcel2.writeInt(b6 ? 1 : 0);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.car.ICarAudio");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
