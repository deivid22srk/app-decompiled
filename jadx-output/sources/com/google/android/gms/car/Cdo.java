package com.google.android.gms.car;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.car.do, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class Cdo extends Binder implements dn {
    public static dn a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.ICarPhoneStatusEventListener");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof dn)) ? new dp(iBinder) : (dn) queryLocalInterface;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.car.ICarPhoneStatusEventListener");
                a(parcel.readString(), parcel.readString(), parcel.readInt());
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.car.ICarPhoneStatusEventListener");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
