package com.android.vending.setup;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class b extends Binder implements a {
    public b() {
        attachInterface(this, "com.android.vending.setup.IPlaySetupService");
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        RestoreConfig restoreConfig;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.android.vending.setup.IPlaySetupService");
                Bundle a2 = a();
                parcel2.writeNoException();
                if (a2 != null) {
                    parcel2.writeInt(1);
                    a2.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 2:
                parcel.enforceInterface("com.android.vending.setup.IPlaySetupService");
                b();
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.android.vending.setup.IPlaySetupService");
                boolean c = c();
                parcel2.writeNoException();
                parcel2.writeInt(c ? 1 : 0);
                return true;
            case 4:
                parcel.enforceInterface("com.android.vending.setup.IPlaySetupService");
                Bundle a3 = a(parcel.readString());
                parcel2.writeNoException();
                if (a3 != null) {
                    parcel2.writeInt(1);
                    a3.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 5:
                parcel.enforceInterface("com.android.vending.setup.IPlaySetupService");
                d();
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.android.vending.setup.IPlaySetupService");
                Bundle e = e();
                parcel2.writeNoException();
                if (e != null) {
                    parcel2.writeInt(1);
                    e.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 7:
                parcel.enforceInterface("com.android.vending.setup.IPlaySetupService");
                f();
                parcel2.writeNoException();
                return true;
            case 8:
                parcel.enforceInterface("com.android.vending.setup.IPlaySetupService");
                if (parcel.readInt() != 0) {
                    restoreConfig = RestoreConfig.CREATOR.createFromParcel(parcel);
                } else {
                    restoreConfig = null;
                }
                Bundle a4 = a(restoreConfig);
                parcel2.writeNoException();
                if (a4 != null) {
                    parcel2.writeInt(1);
                    a4.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 1598968902:
                parcel2.writeString("com.android.vending.setup.IPlaySetupService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
