package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class dj implements dh {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5944a;

    dj(IBinder iBinder) {
        this.f5944a = iBinder;
    }

    @Override // com.google.android.gms.internal.dh
    public final IBinder a(com.google.android.gms.dynamic.a aVar, com.google.android.gms.dynamic.a aVar2, com.google.android.gms.dynamic.a aVar3, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
            obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
            obtain.writeStrongBinder(aVar2 != null ? aVar2.asBinder() : null);
            obtain.writeStrongBinder(aVar3 != null ? aVar3.asBinder() : null);
            obtain.writeInt(i);
            this.f5944a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readStrongBinder();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5944a;
    }
}
