package com.google.android.gms.car;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
final class bk implements bi {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5489a;

    bk(IBinder iBinder) {
        this.f5489a = iBinder;
    }

    @Override // com.google.android.gms.car.bi
    public final void a(bl blVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarAudioRecord");
            obtain.writeStrongBinder(blVar != null ? blVar.asBinder() : null);
            this.f5489a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.bi
    public final void a(bl blVar, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarAudioRecord");
            obtain.writeStrongBinder(blVar != null ? blVar.asBinder() : null);
            obtain.writeInt(i);
            this.f5489a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5489a;
    }

    @Override // com.google.android.gms.car.bi
    public final void b(bl blVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarAudioRecord");
            obtain.writeStrongBinder(blVar != null ? blVar.asBinder() : null);
            this.f5489a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.bi
    public final boolean b(bl blVar, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarAudioRecord");
            obtain.writeStrongBinder(blVar != null ? blVar.asBinder() : null);
            obtain.writeInt(i);
            this.f5489a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.bi
    public final void c(bl blVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarAudioRecord");
            obtain.writeStrongBinder(blVar != null ? blVar.asBinder() : null);
            this.f5489a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.bi
    public final ParcelFileDescriptor d(bl blVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarAudioRecord");
            obtain.writeStrongBinder(blVar != null ? blVar.asBinder() : null);
            this.f5489a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.bi
    public final void e(bl blVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarAudioRecord");
            obtain.writeStrongBinder(blVar != null ? blVar.asBinder() : null);
            this.f5489a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
