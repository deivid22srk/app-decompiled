package com.google.android.gms.car;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class cx implements cv {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5502a;

    cx(IBinder iBinder) {
        this.f5502a = iBinder;
    }

    @Override // com.google.android.gms.car.cv
    public final void a(int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarMediaPlaybackStatusEventListener");
            obtain.writeInt(i);
            this.f5502a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5502a;
    }
}
