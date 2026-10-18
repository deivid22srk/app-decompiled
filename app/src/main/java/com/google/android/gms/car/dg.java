package com.google.android.gms.car;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class dg implements de {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5505a;

    dg(IBinder iBinder) {
        this.f5505a = iBinder;
    }

    @Override // com.google.android.gms.car.de
    public final void a(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarNavigationStatus");
            obtain.writeInt(i);
            this.f5505a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.de
    public final void a(int i, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarNavigationStatus");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.f5505a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.de
    public final void a(int i, String str, int i2, int i3, byte[] bArr, int i4) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarNavigationStatus");
            obtain.writeInt(i);
            obtain.writeString(str);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            obtain.writeByteArray(bArr);
            obtain.writeInt(i4);
            this.f5505a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.de
    public final boolean a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarNavigationStatus");
            this.f5505a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.de
    public final boolean a(dh dhVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarNavigationStatus");
            obtain.writeStrongBinder(dhVar != null ? dhVar.asBinder() : null);
            this.f5505a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5505a;
    }

    @Override // com.google.android.gms.car.de
    public final CarInstrumentClusterInfo b() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarNavigationStatus");
            this.f5505a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0 ? CarInstrumentClusterInfo.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.de
    public final boolean b(dh dhVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarNavigationStatus");
            obtain.writeStrongBinder(dhVar != null ? dhVar.asBinder() : null);
            this.f5505a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
