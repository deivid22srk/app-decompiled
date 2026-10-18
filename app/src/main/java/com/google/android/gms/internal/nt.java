package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.herrevad.PredictedNetworkQuality;

/* loaded from: classes.dex */
public abstract class nt extends Binder implements ns {
    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                parcel.enforceInterface("com.google.android.gms.herrevad.internal.IConnectedNetworksQualityCallbacks");
                a(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null, parcel.createTypedArrayList(PredictedNetworkQuality.CREATOR));
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.herrevad.internal.IConnectedNetworksQualityCallbacks");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
