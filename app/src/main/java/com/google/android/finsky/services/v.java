package com.google.android.finsky.services;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class v extends Binder implements u {
    public v() {
        attachInterface(this, "com.google.android.finsky.services.IMarketCatalogService");
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.finsky.services.IMarketCatalogService");
                boolean a2 = a(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(a2 ? 1 : 0);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.finsky.services.IMarketCatalogService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
