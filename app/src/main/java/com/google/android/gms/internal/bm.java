package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class bm extends Binder implements bl {
    public static bl a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof bl)) ? new bn(iBinder) : (bl) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
                IBinder a2 = a(parcel.readString(), com.google.android.gms.dynamic.b.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeStrongBinder(a2);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
                IBinder b2 = b(parcel.readString(), com.google.android.gms.dynamic.b.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeStrongBinder(b2);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
