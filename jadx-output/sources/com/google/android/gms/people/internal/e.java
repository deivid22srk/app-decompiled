package com.google.android.gms.people.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.DataHolder;

/* loaded from: classes.dex */
public abstract class e extends Binder implements d {
    public e() {
        attachInterface(this, "com.google.android.gms.people.internal.IPeopleCallbacks");
    }

    public static d a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof d)) ? new f(iBinder) : (d) queryLocalInterface;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        DataHolder dataHolder = null;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                int readInt = parcel.readInt();
                Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                if (parcel.readInt() != 0) {
                    com.google.android.gms.common.data.e eVar = DataHolder.CREATOR;
                    dataHolder = com.google.android.gms.common.data.e.a(parcel);
                }
                a(readInt, bundle, dataHolder);
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, (DataHolder[]) parcel.createTypedArray(DataHolder.CREATOR));
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.people.internal.IPeopleCallbacks");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
