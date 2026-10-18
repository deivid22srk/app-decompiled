package com.google.android.gms.c.a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.np;
import com.google.android.gms.internal.nr;
import com.google.android.gms.internal.ns;
import com.google.android.gms.internal.nu;

/* loaded from: classes.dex */
public abstract class b extends Binder implements a {
    public static a a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdm.internal.INetworkQualityService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new c(iBinder) : (a) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        ns nsVar = null;
        np nrVar = null;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.mdm.internal.INetworkQualityService");
                a(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.mdm.internal.INetworkQualityService");
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.herrevad.internal.IActiveNetworkQualityCallbacks");
                    nrVar = (queryLocalInterface == null || !(queryLocalInterface instanceof np)) ? new nr(readStrongBinder) : (np) queryLocalInterface;
                }
                a(nrVar);
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.mdm.internal.INetworkQualityService");
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.herrevad.internal.IConnectedNetworksQualityCallbacks");
                    nsVar = (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof ns)) ? new nu(readStrongBinder2) : (ns) queryLocalInterface2;
                }
                a(nsVar);
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.mdm.internal.INetworkQualityService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
