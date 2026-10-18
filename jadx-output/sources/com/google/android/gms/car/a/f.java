package com.google.android.gms.car.a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5453a;

    f(IBinder iBinder) {
        this.f5453a = iBinder;
    }

    @Override // com.google.android.gms.car.a.d
    public final void a(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.diagnostics.IDataCollectedCallback");
            if (parcelFileDescriptor != null) {
                obtain.writeInt(1);
                parcelFileDescriptor.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f5453a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5453a;
    }
}
