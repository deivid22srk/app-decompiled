package com.android.vending.a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class f extends Binder implements e {
    public f() {
        attachInterface(this, "com.android.vending.billing.IInAppBillingService");
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                int a2 = a(parcel.readInt(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(a2);
                return true;
            case 2:
                parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                Bundle a3 = a(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (a3 != null) {
                    parcel2.writeInt(1);
                    a3.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 3:
                parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                Bundle a4 = a(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                if (a4 != null) {
                    parcel2.writeInt(1);
                    a4.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 4:
                parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                Bundle a5 = a(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                if (a5 != null) {
                    parcel2.writeInt(1);
                    a5.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 5:
                parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                int b2 = b(parcel.readInt(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(b2);
                return true;
            case 6:
                parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                int c = c(parcel.readInt(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(c);
                return true;
            case 7:
                parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                Bundle a6 = a(parcel.readInt(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                if (a6 != null) {
                    parcel2.writeInt(1);
                    a6.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 8:
                parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                Bundle a7 = a(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (a7 != null) {
                    parcel2.writeInt(1);
                    a7.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 9:
                parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                Bundle a8 = a(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (a8 != null) {
                    parcel2.writeInt(1);
                    a8.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 1598968902:
                parcel2.writeString("com.android.vending.billing.IInAppBillingService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
