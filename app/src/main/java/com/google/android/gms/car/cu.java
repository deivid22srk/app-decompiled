package com.google.android.gms.car;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class cu implements cs {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5501a;

    cu(IBinder iBinder) {
        this.f5501a = iBinder;
    }

    @Override // com.google.android.gms.car.cs
    public final void a(cv cvVar, int i, String str, int i2, boolean z, boolean z2, boolean z3) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarMediaPlaybackStatus");
            obtain.writeStrongBinder(cvVar != null ? cvVar.asBinder() : null);
            obtain.writeInt(i);
            obtain.writeString(str);
            obtain.writeInt(i2);
            obtain.writeInt(z ? 1 : 0);
            obtain.writeInt(z2 ? 1 : 0);
            obtain.writeInt(z3 ? 1 : 0);
            this.f5501a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.cs
    public final void a(cv cvVar, String str, String str2, String str3, byte[] bArr, String str4, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarMediaPlaybackStatus");
            obtain.writeStrongBinder(cvVar != null ? cvVar.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeByteArray(bArr);
            obtain.writeString(str4);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.f5501a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.cs
    public final boolean a(cv cvVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarMediaPlaybackStatus");
            obtain.writeStrongBinder(cvVar != null ? cvVar.asBinder() : null);
            this.f5501a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5501a;
    }

    @Override // com.google.android.gms.car.cs
    public final boolean b(cv cvVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarMediaPlaybackStatus");
            obtain.writeStrongBinder(cvVar != null ? cvVar.asBinder() : null);
            this.f5501a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
