package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class fe extends Binder implements fd {
    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                int a2 = a();
                parcel2.writeNoException();
                parcel2.writeInt(a2);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
