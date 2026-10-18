package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.RecoveryDecision;
import com.google.android.gms.auth.RecoveryReadResponse;
import com.google.android.gms.auth.RecoveryWriteRequest;
import com.google.android.gms.auth.RecoveryWriteResponse;

/* loaded from: classes.dex */
public abstract class bc extends Binder implements bb {
    public static bb a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IRecoveryService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof bb)) ? new bd(iBinder) : (bb) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        RecoveryWriteRequest recoveryWriteRequest = null;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.auth.IRecoveryService");
                RecoveryDecision a2 = a(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (a2 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                a2.writeToParcel(parcel2, 1);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.auth.IRecoveryService");
                RecoveryReadResponse a3 = a(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                if (a3 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                a3.writeToParcel(parcel2, 1);
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.auth.IRecoveryService");
                if (parcel.readInt() != 0) {
                    com.google.android.gms.auth.h hVar = RecoveryWriteRequest.CREATOR;
                    recoveryWriteRequest = com.google.android.gms.auth.h.a(parcel);
                }
                RecoveryWriteResponse a4 = a(recoveryWriteRequest, parcel.readString());
                parcel2.writeNoException();
                if (a4 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                a4.writeToParcel(parcel2, 1);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.auth.IRecoveryService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
