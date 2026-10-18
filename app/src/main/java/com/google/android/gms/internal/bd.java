package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.RecoveryDecision;
import com.google.android.gms.auth.RecoveryReadResponse;
import com.google.android.gms.auth.RecoveryWriteRequest;
import com.google.android.gms.auth.RecoveryWriteResponse;

/* loaded from: classes.dex */
final class bd implements bb {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5890a;

    bd(IBinder iBinder) {
        this.f5890a = iBinder;
    }

    @Override // com.google.android.gms.internal.bb
    public final RecoveryDecision a(String str, String str2, boolean z, Bundle bundle) {
        RecoveryDecision recoveryDecision;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.auth.IRecoveryService");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeInt(z ? 1 : 0);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f5890a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                com.google.android.gms.auth.f fVar = RecoveryDecision.CREATOR;
                recoveryDecision = com.google.android.gms.auth.f.a(obtain2);
            } else {
                recoveryDecision = null;
            }
            return recoveryDecision;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.bb
    public final RecoveryReadResponse a(String str, String str2) {
        RecoveryReadResponse recoveryReadResponse;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.auth.IRecoveryService");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f5890a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                com.google.android.gms.auth.g gVar = RecoveryReadResponse.CREATOR;
                recoveryReadResponse = com.google.android.gms.auth.g.a(obtain2);
            } else {
                recoveryReadResponse = null;
            }
            return recoveryReadResponse;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.bb
    public final RecoveryWriteResponse a(RecoveryWriteRequest recoveryWriteRequest, String str) {
        RecoveryWriteResponse recoveryWriteResponse;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.auth.IRecoveryService");
            if (recoveryWriteRequest != null) {
                obtain.writeInt(1);
                recoveryWriteRequest.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeString(str);
            this.f5890a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                com.google.android.gms.auth.i iVar = RecoveryWriteResponse.CREATOR;
                recoveryWriteResponse = com.google.android.gms.auth.i.a(obtain2);
            } else {
                recoveryWriteResponse = null;
            }
            return recoveryWriteResponse;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5890a;
    }
}
