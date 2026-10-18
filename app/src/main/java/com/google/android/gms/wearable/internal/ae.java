package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public abstract class ae extends Binder implements ad {
    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.ILargeAssetSyncRequestResponder");
                a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.wearable.internal.ILargeAssetSyncRequestResponder");
                a(parcel.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel) : null, parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.wearable.internal.ILargeAssetSyncRequestResponder");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
