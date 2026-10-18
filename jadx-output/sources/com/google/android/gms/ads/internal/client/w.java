package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class w implements u {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5309a;

    w(IBinder iBinder) {
        this.f5309a = iBinder;
    }

    @Override // com.google.android.gms.ads.internal.client.u
    public final IBinder a(com.google.android.gms.dynamic.a aVar, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
            obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
            obtain.writeInt(i);
            this.f5309a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readStrongBinder();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5309a;
    }
}
