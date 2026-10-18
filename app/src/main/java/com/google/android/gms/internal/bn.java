package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class bn implements bl {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5897a;

    bn(IBinder iBinder) {
        this.f5897a = iBinder;
    }

    @Override // com.google.android.gms.internal.bl
    public final IBinder a(String str, com.google.android.gms.dynamic.a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
            obtain.writeString(str);
            obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
            this.f5897a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readStrongBinder();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5897a;
    }

    @Override // com.google.android.gms.internal.bl
    public final IBinder b(String str, com.google.android.gms.dynamic.a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
            obtain.writeString(str);
            obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
            this.f5897a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readStrongBinder();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
