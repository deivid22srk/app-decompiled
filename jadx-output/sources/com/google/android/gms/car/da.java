package com.google.android.gms.car;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class da implements cy {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5503a;

    da(IBinder iBinder) {
        this.f5503a = iBinder;
    }

    @Override // com.google.android.gms.car.cy
    public final void a(db dbVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarMessage");
            obtain.writeStrongBinder(dbVar != null ? dbVar.asBinder() : null);
            this.f5503a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.cy
    public final void a(db dbVar, int i, int i2, int i3) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarMessage");
            obtain.writeStrongBinder(dbVar != null ? dbVar.asBinder() : null);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            this.f5503a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.cy
    public final boolean a(db dbVar, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarMessage");
            obtain.writeStrongBinder(dbVar != null ? dbVar.asBinder() : null);
            obtain.writeInt(i);
            this.f5503a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.cy
    public final int[] a(db dbVar, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarMessage");
            obtain.writeStrongBinder(dbVar != null ? dbVar.asBinder() : null);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.f5503a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createIntArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5503a;
    }

    @Override // com.google.android.gms.car.cy
    public final void b(db dbVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarMessage");
            obtain.writeStrongBinder(dbVar != null ? dbVar.asBinder() : null);
            this.f5503a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.cy
    public final void b(db dbVar, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarMessage");
            obtain.writeStrongBinder(dbVar != null ? dbVar.asBinder() : null);
            obtain.writeInt(i);
            this.f5503a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.cy
    public final void c(db dbVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarMessage");
            obtain.writeStrongBinder(dbVar != null ? dbVar.asBinder() : null);
            this.f5503a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
