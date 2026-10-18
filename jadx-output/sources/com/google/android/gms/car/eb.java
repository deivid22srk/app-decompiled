package com.google.android.gms.car;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class eb implements dz {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5512a;

    eb(IBinder iBinder) {
        this.f5512a = iBinder;
    }

    @Override // com.google.android.gms.car.dz
    public final void a(CarSensorEvent carSensorEvent) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarSensorEventListener");
            if (carSensorEvent != null) {
                obtain.writeInt(1);
                carSensorEvent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f5512a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5512a;
    }
}
