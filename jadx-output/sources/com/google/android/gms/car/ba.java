package com.google.android.gms.car;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class ba implements ay {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5486a;

    ba(IBinder iBinder) {
        this.f5486a = iBinder;
    }

    @Override // com.google.android.gms.car.ay
    public final void a(bb bbVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarRetailMode");
            obtain.writeStrongBinder(bbVar != null ? bbVar.asBinder() : null);
            this.f5486a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.ay
    public final boolean a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarRetailMode");
            this.f5486a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5486a;
    }

    @Override // com.google.android.gms.car.ay
    public final void b(bb bbVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarRetailMode");
            obtain.writeStrongBinder(bbVar != null ? bbVar.asBinder() : null);
            this.f5486a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.ay
    public final boolean b() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarRetailMode");
            this.f5486a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
