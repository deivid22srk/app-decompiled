package com.google.android.gms.car;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class bt implements br {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5492a;

    bt(IBinder iBinder) {
        this.f5492a = iBinder;
    }

    @Override // com.google.android.gms.car.br
    public final void a() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarAudioTrackCallback");
            this.f5492a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.br
    public final void a(int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarAudioTrackCallback");
            obtain.writeInt(i);
            this.f5492a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5492a;
    }
}
