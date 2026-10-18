package com.google.android.gms.car;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class bd implements bb {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5487a;

    bd(IBinder iBinder) {
        this.f5487a = iBinder;
    }

    @Override // com.google.android.gms.car.bb
    public final void a() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarRetailModeListener");
            this.f5487a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5487a;
    }

    @Override // com.google.android.gms.car.bb
    public final void b() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarRetailModeListener");
            this.f5487a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
