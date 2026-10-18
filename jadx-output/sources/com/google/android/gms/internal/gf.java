package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class gf implements gd {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5999a;

    gf(IBinder iBinder) {
        this.f5999a = iBinder;
    }

    @Override // com.google.android.gms.internal.gd
    public final IBinder a(com.google.android.gms.dynamic.a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
            obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
            this.f5999a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readStrongBinder();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5999a;
    }
}
