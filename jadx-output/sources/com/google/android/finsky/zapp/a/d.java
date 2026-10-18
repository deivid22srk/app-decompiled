package com.google.android.finsky.zapp.a;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class d extends Binder implements c {
    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Bundle bundle;
        switch (i) {
            case 2:
                parcel.enforceInterface("com.google.android.finsky.zapp.protocol.IPlayModuleServiceCallbacks");
                int readInt = parcel.readInt();
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                } else {
                    bundle = null;
                }
                a(readInt, createTypedArrayList, bundle);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.finsky.zapp.protocol.IPlayModuleServiceCallbacks");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
