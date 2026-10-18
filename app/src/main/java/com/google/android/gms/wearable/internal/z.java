package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class z implements x {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f6630a;

    z(IBinder iBinder) {
        this.f6630a = iBinder;
    }

    @Override // com.google.android.gms.wearable.internal.x
    public final void a(int i, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.f6630a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6630a;
    }
}
