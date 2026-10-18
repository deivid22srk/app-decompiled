package com.android.vending.licensing;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class d extends Binder implements ILicensingService {
    public d() {
        attachInterface(this, "com.android.vending.licensing.ILicensingService");
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        a cVar;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.android.vending.licensing.ILicensingService");
                long readLong = parcel.readLong();
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    cVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.android.vending.licensing.ILicenseResultListener");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
                        cVar = (a) queryLocalInterface;
                    } else {
                        cVar = new c(readStrongBinder);
                    }
                }
                a(readLong, readString, cVar);
                return true;
            case 1598968902:
                parcel2.writeString("com.android.vending.licensing.ILicensingService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
