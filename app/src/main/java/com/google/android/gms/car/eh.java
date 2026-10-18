package com.google.android.gms.car;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class eh implements ef {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5514a;

    eh(IBinder iBinder) {
        this.f5514a = iBinder;
    }

    @Override // com.google.android.gms.car.ef
    public final void a() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarVendorExtensionClient");
            this.f5514a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.ef
    public final void a(int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarVendorExtensionClient");
            obtain.writeInt(i);
            this.f5514a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5514a;
    }

    @Override // com.google.android.gms.car.ef
    public final void b() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarVendorExtensionClient");
            this.f5514a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
