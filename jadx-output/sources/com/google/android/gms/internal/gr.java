package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class gr implements gp {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f6004a;

    gr(IBinder iBinder) {
        this.f6004a = iBinder;
    }

    @Override // com.google.android.gms.internal.gp
    public final IBinder a(com.google.android.gms.dynamic.a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManagerCreator");
            obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
            this.f6004a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readStrongBinder();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6004a;
    }
}
