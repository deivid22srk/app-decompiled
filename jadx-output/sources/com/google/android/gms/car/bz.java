package com.google.android.gms.car;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class bz implements bx {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5494a;

    bz(IBinder iBinder) {
        this.f5494a = iBinder;
    }

    @Override // com.google.android.gms.car.bx
    public final void a() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarBluetoothClient");
            this.f5494a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5494a;
    }

    @Override // com.google.android.gms.car.bx
    public final void b() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarBluetoothClient");
            this.f5494a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.bx
    public final void c() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarBluetoothClient");
            this.f5494a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.bx
    public final void d() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarBluetoothClient");
            this.f5494a.transact(4, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.bx
    public final void e() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarBluetoothClient");
            this.f5494a.transact(5, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.bx
    public final void f() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarBluetoothClient");
            this.f5494a.transact(6, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.bx
    public final void g() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarBluetoothClient");
            this.f5494a.transact(7, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
