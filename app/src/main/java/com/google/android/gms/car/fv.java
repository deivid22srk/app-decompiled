package com.google.android.gms.car;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class fv implements ft {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5524a;

    fv(IBinder iBinder) {
        this.f5524a = iBinder;
    }

    @Override // com.google.android.gms.car.ft
    public final void a(Intent intent) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarActivityStartListener");
            if (intent != null) {
                obtain.writeInt(1);
                intent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f5524a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5524a;
    }

    @Override // com.google.android.gms.car.ft
    public final void b(Intent intent) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarActivityStartListener");
            if (intent != null) {
                obtain.writeInt(1);
                intent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f5524a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
