package com.google.android.gms.car;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class by extends Binder implements bx {
    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.car.ICarBluetoothClient");
                a();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.car.ICarBluetoothClient");
                b();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.car.ICarBluetoothClient");
                c();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.car.ICarBluetoothClient");
                d();
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.car.ICarBluetoothClient");
                e();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.car.ICarBluetoothClient");
                f();
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.car.ICarBluetoothClient");
                g();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.car.ICarBluetoothClient");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
