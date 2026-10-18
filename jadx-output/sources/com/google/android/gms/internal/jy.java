package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class jy extends Binder implements jx {
    public static jx a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.checkin.internal.ICheckinService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof jx)) ? new jz(iBinder) : (jx) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.checkin.internal.ICheckinService");
                String a2 = a();
                parcel2.writeNoException();
                parcel2.writeString(a2);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.checkin.internal.ICheckinService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
