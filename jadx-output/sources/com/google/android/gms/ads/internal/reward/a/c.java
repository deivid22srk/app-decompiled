package com.google.android.gms.ads.internal.reward.a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.et;

/* loaded from: classes.dex */
final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5347a;

    c(IBinder iBinder) {
        this.f5347a = iBinder;
    }

    @Override // com.google.android.gms.ads.internal.reward.a.a
    public final IBinder a(com.google.android.gms.dynamic.a aVar, et etVar, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
            obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
            obtain.writeStrongBinder(etVar != null ? etVar.asBinder() : null);
            obtain.writeInt(i);
            this.f5347a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readStrongBinder();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5347a;
    }
}
