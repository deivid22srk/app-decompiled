package com.google.android.gms.car;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class bv extends Binder implements bu {
    public static bu a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.ICarBluetooth");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof bu)) ? new bw(iBinder) : (bu) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        bx bzVar;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.car.ICarBluetooth");
                int a2 = a();
                parcel2.writeNoException();
                parcel2.writeInt(a2);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.car.ICarBluetooth");
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    bzVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.car.ICarBluetoothClient");
                    bzVar = (queryLocalInterface == null || !(queryLocalInterface instanceof bx)) ? new bz(readStrongBinder) : (bx) queryLocalInterface;
                }
                boolean a3 = a(bzVar);
                parcel2.writeNoException();
                parcel2.writeInt(a3 ? 1 : 0);
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.car.ICarBluetooth");
                boolean b2 = b();
                parcel2.writeNoException();
                parcel2.writeInt(b2 ? 1 : 0);
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.car.ICarBluetooth");
                boolean c = c();
                parcel2.writeNoException();
                parcel2.writeInt(c ? 1 : 0);
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.car.ICarBluetooth");
                boolean d = d();
                parcel2.writeNoException();
                parcel2.writeInt(d ? 1 : 0);
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.car.ICarBluetooth");
                boolean e = e();
                parcel2.writeNoException();
                parcel2.writeInt(e ? 1 : 0);
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.car.ICarBluetooth");
                boolean f = f();
                parcel2.writeNoException();
                parcel2.writeInt(f ? 1 : 0);
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.car.ICarBluetooth");
                String g = g();
                parcel2.writeNoException();
                parcel2.writeString(g);
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.car.ICarBluetooth");
                int[] h = h();
                parcel2.writeNoException();
                parcel2.writeIntArray(h);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.car.ICarBluetooth");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
