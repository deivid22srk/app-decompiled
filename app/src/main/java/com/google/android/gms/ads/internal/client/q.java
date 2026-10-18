package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.eu;

/* loaded from: classes.dex */
public abstract class q extends Binder implements p {
    public static p a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof p)) ? new r(iBinder) : (p) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        AdSizeParcel adSizeParcel = null;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                com.google.android.gms.dynamic.a a2 = com.google.android.gms.dynamic.b.a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    h hVar = AdSizeParcel.CREATOR;
                    adSizeParcel = h.a(parcel);
                }
                IBinder a3 = a(a2, adSizeParcel, parcel.readString(), eu.a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(a3);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                com.google.android.gms.dynamic.a a4 = com.google.android.gms.dynamic.b.a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    h hVar2 = AdSizeParcel.CREATOR;
                    adSizeParcel = h.a(parcel);
                }
                IBinder a5 = a(a4, adSizeParcel, parcel.readString(), eu.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(a5);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
