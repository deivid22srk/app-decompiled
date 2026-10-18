package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class bj extends Binder implements bi {
    public bj() {
        attachInterface(this, "com.google.android.gms.ads.adshield.internal.IAdShieldClient");
    }

    public static bi a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof bi)) ? new bk(iBinder) : (bi) queryLocalInterface;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                String a2 = a();
                parcel2.writeNoException();
                parcel2.writeString(a2);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                a(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                boolean a3 = a(com.google.android.gms.dynamic.b.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(a3 ? 1 : 0);
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                boolean b2 = b(com.google.android.gms.dynamic.b.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(b2 ? 1 : 0);
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                a(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                com.google.android.gms.dynamic.a a4 = a(com.google.android.gms.dynamic.b.a(parcel.readStrongBinder()), com.google.android.gms.dynamic.b.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeStrongBinder(a4 != null ? a4.asBinder() : null);
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                String c = c(com.google.android.gms.dynamic.b.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeString(c);
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                String a5 = a(com.google.android.gms.dynamic.b.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(a5);
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                d(com.google.android.gms.dynamic.b.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                com.google.android.gms.dynamic.a b3 = b(com.google.android.gms.dynamic.b.a(parcel.readStrongBinder()), com.google.android.gms.dynamic.b.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeStrongBinder(b3 != null ? b3.asBinder() : null);
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                boolean a6 = a(parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeInt(a6 ? 1 : 0);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
