package com.google.android.c;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class b extends Binder implements a {
    public static a a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.nfcprovision.ISchoolOwnedService");
        if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
            return (a) queryLocalInterface;
        }
        return new c(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.nfcprovision.ISchoolOwnedService");
                boolean a2 = a();
                parcel2.writeNoException();
                parcel2.writeInt(a2 ? 1 : 0);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.nfcprovision.ISchoolOwnedService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
