package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class jz implements jx {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f6101a;

    jz(IBinder iBinder) {
        this.f6101a = iBinder;
    }

    @Override // com.google.android.gms.internal.jx
    public final String a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.checkin.internal.ICheckinService");
            this.f6101a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6101a;
    }
}
