package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.AttestationData;
import com.google.android.gms.safetynet.SafeBrowsingData;

/* loaded from: classes.dex */
final class pn implements pl {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f6233a;

    pn(IBinder iBinder) {
        this.f6233a = iBinder;
    }

    @Override // com.google.android.gms.internal.pl
    public final void a(Status status, AttestationData attestationData) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
            if (status != null) {
                obtain.writeInt(1);
                status.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (attestationData != null) {
                obtain.writeInt(1);
                attestationData.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6233a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.pl
    public final void a(Status status, SafeBrowsingData safeBrowsingData) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
            if (status != null) {
                obtain.writeInt(1);
                status.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (safeBrowsingData != null) {
                obtain.writeInt(1);
                safeBrowsingData.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6233a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.pl
    public final void a(String str) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
            obtain.writeString(str);
            this.f6233a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6233a;
    }
}
