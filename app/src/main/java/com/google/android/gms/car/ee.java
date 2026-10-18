package com.google.android.gms.car;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
final class ee implements ec {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5513a;

    ee(IBinder iBinder) {
        this.f5513a = iBinder;
    }

    @Override // com.google.android.gms.car.ec
    public final void a(ef efVar, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarVendorExtension");
            obtain.writeStrongBinder(efVar != null ? efVar.asBinder() : null);
            obtain.writeInt(i);
            this.f5513a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.ec
    public final boolean a(ef efVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarVendorExtension");
            obtain.writeStrongBinder(efVar != null ? efVar.asBinder() : null);
            this.f5513a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5513a;
    }

    @Override // com.google.android.gms.car.ec
    public final void b(ef efVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarVendorExtension");
            obtain.writeStrongBinder(efVar != null ? efVar.asBinder() : null);
            this.f5513a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.ec
    public final void b(ef efVar, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarVendorExtension");
            obtain.writeStrongBinder(efVar != null ? efVar.asBinder() : null);
            obtain.writeInt(i);
            this.f5513a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.ec
    public final String c(ef efVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarVendorExtension");
            obtain.writeStrongBinder(efVar != null ? efVar.asBinder() : null);
            this.f5513a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.ec
    public final void c(ef efVar, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarVendorExtension");
            obtain.writeStrongBinder(efVar != null ? efVar.asBinder() : null);
            obtain.writeInt(i);
            this.f5513a.transact(9, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.ec
    public final byte[] d(ef efVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarVendorExtension");
            obtain.writeStrongBinder(efVar != null ? efVar.asBinder() : null);
            this.f5513a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createByteArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.ec
    public final ParcelFileDescriptor e(ef efVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarVendorExtension");
            obtain.writeStrongBinder(efVar != null ? efVar.asBinder() : null);
            this.f5513a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.ec
    public final ParcelFileDescriptor f(ef efVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarVendorExtension");
            obtain.writeStrongBinder(efVar != null ? efVar.asBinder() : null);
            this.f5513a.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
