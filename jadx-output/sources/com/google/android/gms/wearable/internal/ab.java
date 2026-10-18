package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public abstract class ab extends Binder implements aa {
    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IFileDescriptorReceiver");
                a(parcel.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.wearable.internal.IFileDescriptorReceiver");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
