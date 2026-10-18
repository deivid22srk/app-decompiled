package com.google.android.gms.car;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.data.BitmapTeleporter;

/* loaded from: classes.dex */
final class ci implements cg {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5497a;

    ci(IBinder iBinder) {
        this.f5497a = iBinder;
    }

    @Override // com.google.android.gms.car.cg
    public final void a(int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarCallback");
            obtain.writeInt(i);
            this.f5497a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.cg
    public final void a(BitmapTeleporter bitmapTeleporter) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarCallback");
            if (bitmapTeleporter != null) {
                obtain.writeInt(1);
                bitmapTeleporter.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f5497a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5497a;
    }
}
