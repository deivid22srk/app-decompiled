package com.google.android.finsky.zapp.a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class b extends Binder implements a {
    public b() {
        attachInterface(this, "com.google.android.finsky.zapp.protocol.IPlayModuleService");
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        c eVar = null;
        switch (i) {
            case 2:
                parcel.enforceInterface("com.google.android.finsky.zapp.protocol.IPlayModuleService");
                String readString = parcel.readString();
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.finsky.zapp.protocol.IPlayModuleServiceCallbacks");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof c)) {
                        eVar = (c) queryLocalInterface;
                    } else {
                        eVar = new e(readStrongBinder);
                    }
                }
                a(readString, createTypedArrayList, eVar);
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.finsky.zapp.protocol.IPlayModuleService");
                a(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.finsky.zapp.protocol.IPlayModuleService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
