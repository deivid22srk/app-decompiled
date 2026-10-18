package com.google.android.finsky.installer;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class i extends Binder implements h {
    public i() {
        attachInterface(this, "com.google.android.finsky.installer.IMultiUserCoordinatorService");
    }

    public static h a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.installer.IMultiUserCoordinatorService");
        if (queryLocalInterface != null && (queryLocalInterface instanceof h)) {
            return (h) queryLocalInterface;
        }
        return new j(iBinder);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        k mVar;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.finsky.installer.IMultiUserCoordinatorService");
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    mVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.finsky.installer.IMultiUserCoordinatorServiceListener");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof k)) {
                        mVar = (k) queryLocalInterface;
                    } else {
                        mVar = new m(readStrongBinder);
                    }
                }
                a(mVar);
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.finsky.installer.IMultiUserCoordinatorService");
                boolean a2 = a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(a2 ? 1 : 0);
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.finsky.installer.IMultiUserCoordinatorService");
                b(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.finsky.installer.IMultiUserCoordinatorService");
                a();
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.finsky.installer.IMultiUserCoordinatorService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
