package com.google.android.gms.car;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class eg extends Binder implements ef {
    public static ef a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.ICarVendorExtensionClient");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof ef)) ? new eh(iBinder) : (ef) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.car.ICarVendorExtensionClient");
                a(parcel.readInt());
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.car.ICarVendorExtensionClient");
                a();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.car.ICarVendorExtensionClient");
                b();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.car.ICarVendorExtensionClient");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
