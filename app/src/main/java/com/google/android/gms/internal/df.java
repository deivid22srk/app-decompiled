package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class df extends Binder implements de {
    public static de a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof de)) ? new dg(iBinder) : (de) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                com.google.android.gms.dynamic.a a2 = a();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(a2 != null ? a2.asBinder() : null);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                Uri b2 = b();
                parcel2.writeNoException();
                if (b2 != null) {
                    parcel2.writeInt(1);
                    b2.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                double c = c();
                parcel2.writeNoException();
                parcel2.writeDouble(c);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
