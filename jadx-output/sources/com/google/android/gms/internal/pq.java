package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class pq implements po {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f6234a;

    pq(IBinder iBinder) {
        this.f6234a = iBinder;
    }

    @Override // com.google.android.gms.internal.po
    public final void a(pl plVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
            obtain.writeStrongBinder(plVar != null ? plVar.asBinder() : null);
            this.f6234a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.po
    public final void a(pl plVar, String str, int[] iArr, int i, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
            obtain.writeStrongBinder(plVar != null ? plVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeIntArray(iArr);
            obtain.writeInt(i);
            obtain.writeString(str2);
            this.f6234a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.po
    public final void a(pl plVar, byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
            obtain.writeStrongBinder(plVar != null ? plVar.asBinder() : null);
            obtain.writeByteArray(bArr);
            this.f6234a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6234a;
    }
}
