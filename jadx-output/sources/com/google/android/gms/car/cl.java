package com.google.android.gms.car;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class cl implements cj {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5498a;

    cl(IBinder iBinder) {
        this.f5498a = iBinder;
    }

    @Override // com.google.android.gms.car.cj
    public final void a() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarConnectionListener");
            this.f5498a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.cj
    public final void a(int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarConnectionListener");
            obtain.writeInt(i);
            this.f5498a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5498a;
    }
}
