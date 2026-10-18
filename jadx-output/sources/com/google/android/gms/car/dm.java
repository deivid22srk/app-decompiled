package com.google.android.gms.car;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class dm implements dk {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5507a;

    dm(IBinder iBinder) {
        this.f5507a = iBinder;
    }

    @Override // com.google.android.gms.car.dk
    public final void a(dn dnVar, CarPhoneStatus carPhoneStatus) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarPhoneStatus");
            obtain.writeStrongBinder(dnVar != null ? dnVar.asBinder() : null);
            if (carPhoneStatus != null) {
                obtain.writeInt(1);
                carPhoneStatus.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f5507a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.dk
    public final boolean a(dn dnVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarPhoneStatus");
            obtain.writeStrongBinder(dnVar != null ? dnVar.asBinder() : null);
            this.f5507a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5507a;
    }

    @Override // com.google.android.gms.car.dk
    public final boolean b(dn dnVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarPhoneStatus");
            obtain.writeStrongBinder(dnVar != null ? dnVar.asBinder() : null);
            this.f5507a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
