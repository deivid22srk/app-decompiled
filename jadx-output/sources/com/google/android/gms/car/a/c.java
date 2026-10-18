package com.google.android.gms.car.a;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5452a;

    c(IBinder iBinder) {
        this.f5452a = iBinder;
    }

    @Override // com.google.android.gms.car.a.a
    public final void a(d dVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.diagnostics.ICarDiagnostics");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            this.f5452a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5452a;
    }

    @Override // com.google.android.gms.car.a.a
    public final void b(d dVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.diagnostics.ICarDiagnostics");
            obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
            this.f5452a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
