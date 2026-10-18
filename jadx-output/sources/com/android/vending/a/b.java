package com.android.vending.a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class b extends Binder implements a {
    public b() {
        attachInterface(this, "com.android.vending.billing.IBillingAccountService");
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.android.vending.billing.IBillingAccountService");
                int a2 = a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(a2);
                return true;
            case 2:
                parcel.enforceInterface("com.android.vending.billing.IBillingAccountService");
                Bundle b2 = b(parcel.readString());
                parcel2.writeNoException();
                if (b2 != null) {
                    parcel2.writeInt(1);
                    b2.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 1598968902:
                parcel2.writeString("com.android.vending.billing.IBillingAccountService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
