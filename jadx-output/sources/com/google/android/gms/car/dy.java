package com.google.android.gms.car;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class dy implements dw {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5511a;

    dy(IBinder iBinder) {
        this.f5511a = iBinder;
    }

    @Override // com.google.android.gms.car.dw
    public final CarSensorEvent a(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarSensor");
            obtain.writeInt(i);
            this.f5511a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0 ? CarSensorEvent.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.dw
    public final void a(int i, dz dzVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarSensor");
            obtain.writeInt(i);
            obtain.writeStrongBinder(dzVar != null ? dzVar.asBinder() : null);
            this.f5511a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.dw
    public final boolean a(int i, int i2, dz dzVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarSensor");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeStrongBinder(dzVar != null ? dzVar.asBinder() : null);
            this.f5511a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.dw
    public final int[] a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarSensor");
            this.f5511a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createIntArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5511a;
    }
}
