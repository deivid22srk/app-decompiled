package com.google.android.gms.car;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
final class bq implements bo {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5491a;

    bq(IBinder iBinder) {
        this.f5491a = iBinder;
    }

    @Override // com.google.android.gms.car.bo
    public final void a(br brVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarAudioTrack");
            obtain.writeStrongBinder(brVar != null ? brVar.asBinder() : null);
            this.f5491a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.bo
    public final void a(br brVar, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarAudioTrack");
            obtain.writeStrongBinder(brVar != null ? brVar.asBinder() : null);
            obtain.writeInt(i);
            this.f5491a.transact(8, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5491a;
    }

    @Override // com.google.android.gms.car.bo
    public final ParcelFileDescriptor b(br brVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarAudioTrack");
            obtain.writeStrongBinder(brVar != null ? brVar.asBinder() : null);
            this.f5491a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.bo
    public final void b(br brVar, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarAudioTrack");
            obtain.writeStrongBinder(brVar != null ? brVar.asBinder() : null);
            obtain.writeInt(i);
            this.f5491a.transact(9, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.bo
    public final void c(br brVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarAudioTrack");
            obtain.writeStrongBinder(brVar != null ? brVar.asBinder() : null);
            this.f5491a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.bo
    public final void d(br brVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarAudioTrack");
            obtain.writeStrongBinder(brVar != null ? brVar.asBinder() : null);
            this.f5491a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.bo
    public final void e(br brVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarAudioTrack");
            obtain.writeStrongBinder(brVar != null ? brVar.asBinder() : null);
            this.f5491a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.bo
    public final void f(br brVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarAudioTrack");
            obtain.writeStrongBinder(brVar != null ? brVar.asBinder() : null);
            this.f5491a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.bo
    public final void g(br brVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarAudioTrack");
            obtain.writeStrongBinder(brVar != null ? brVar.asBinder() : null);
            this.f5491a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
