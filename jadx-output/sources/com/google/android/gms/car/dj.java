package com.google.android.gms.car;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class dj implements dh {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5506a;

    dj(IBinder iBinder) {
        this.f5506a = iBinder;
    }

    @Override // com.google.android.gms.car.dh
    public final void a() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarNavigationStatusEventListener");
            this.f5506a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.dh
    public final void a(int i, int i2, int i3, int i4, int i5) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarNavigationStatusEventListener");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            obtain.writeInt(i4);
            obtain.writeInt(i5);
            this.f5506a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5506a;
    }
}
