package com.google.android.finsky.services;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class x extends Binder implements w {
    public x() {
        attachInterface(this, "com.google.android.finsky.services.IPlayAfwAppService");
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.finsky.services.IPlayAfwAppService");
                Bundle a2 = a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(1);
                a2.writeToParcel(parcel2, 1);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.finsky.services.IPlayAfwAppService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
