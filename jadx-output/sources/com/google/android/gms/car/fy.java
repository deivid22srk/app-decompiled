package com.google.android.gms.car;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class fy implements fw {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5525a;

    fy(IBinder iBinder) {
        this.f5525a = iBinder;
    }

    @Override // com.google.android.gms.car.fw
    public final CarAudioConfiguration a(int i, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarAudio");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.f5525a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0 ? CarAudioConfiguration.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.fw
    public final bo a(bf bfVar, int i, int i2, int i3) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarAudio");
            obtain.writeStrongBinder(bfVar != null ? bfVar.asBinder() : null);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            this.f5525a.transact(9, obtain, obtain2, 0);
            obtain2.readException();
            return bp.a(obtain2.readStrongBinder());
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.fw
    public final boolean a(long j) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarAudio");
            obtain.writeLong(j);
            this.f5525a.transact(11, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.fw
    public final int[] a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarAudio");
            this.f5525a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createIntArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.fw
    public final CarAudioConfiguration[] a(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarAudio");
            obtain.writeInt(i);
            this.f5525a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return (CarAudioConfiguration[]) obtain2.createTypedArray(CarAudioConfiguration.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5525a;
    }

    @Override // com.google.android.gms.car.fw
    public final CarAudioConfiguration b(int i, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarAudio");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.f5525a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0 ? CarAudioConfiguration.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.fw
    public final bi b(bf bfVar, int i, int i2, int i3) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarAudio");
            obtain.writeStrongBinder(bfVar != null ? bfVar.asBinder() : null);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            this.f5525a.transact(10, obtain, obtain2, 0);
            obtain2.readException();
            return bj.a(obtain2.readStrongBinder());
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.fw
    public final boolean b(long j) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarAudio");
            obtain.writeLong(j);
            this.f5525a.transact(12, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.fw
    public final int[] b() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarAudio");
            this.f5525a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createIntArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.fw
    public final CarAudioConfiguration[] b(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarAudio");
            obtain.writeInt(i);
            this.f5525a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            return (CarAudioConfiguration[]) obtain2.createTypedArray(CarAudioConfiguration.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.fw
    public final int c(int i, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarAudio");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.f5525a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.fw
    public final int d(int i, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarAudio");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.f5525a.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
