package com.google.android.gms.car;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class cr implements cp {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5500a;

    cr(IBinder iBinder) {
        this.f5500a = iBinder;
    }

    @Override // com.google.android.gms.car.cp
    public final void a(String str, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarMediaBrowserEventListener");
            obtain.writeString(str);
            obtain.writeInt(i);
            this.f5500a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.cp
    public final void a(String str, int i, boolean z) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarMediaBrowserEventListener");
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeInt(z ? 1 : 0);
            this.f5500a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5500a;
    }
}
