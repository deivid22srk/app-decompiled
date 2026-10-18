package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class ff implements fd {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5973a;

    ff(IBinder iBinder) {
        this.f5973a = iBinder;
    }

    @Override // com.google.android.gms.internal.fd
    public final int a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
            this.f5973a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5973a;
    }
}
