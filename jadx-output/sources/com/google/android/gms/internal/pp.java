package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class pp extends Binder implements po {
    public static po a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof po)) ? new pq(iBinder) : (po) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
                a(pm.a(parcel.readStrongBinder()), parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
                a(pm.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
                a(pm.a(parcel.readStrongBinder()), parcel.readString(), parcel.createIntArray(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.safetynet.internal.ISafetyNetService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
