package com.android.vending.licensing;

import android.os.Binder;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class b extends Binder implements a {
    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.android.vending.licensing.ILicenseResultListener");
                a(parcel.readInt(), parcel.readString(), parcel.readString());
                return true;
            case 1598968902:
                parcel2.writeString("com.android.vending.licensing.ILicenseResultListener");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
