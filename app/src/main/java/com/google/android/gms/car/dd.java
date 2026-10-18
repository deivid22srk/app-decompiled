package com.google.android.gms.car;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class dd implements db {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5504a;

    dd(IBinder iBinder) {
        this.f5504a = iBinder;
    }

    @Override // com.google.android.gms.car.db
    public final void a(int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarMessageCallback");
            obtain.writeInt(i);
            this.f5504a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.db
    public final void a(int i, int i2, int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarMessageCallback");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            this.f5504a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5504a;
    }
}
