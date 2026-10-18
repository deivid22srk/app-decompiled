package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class bk implements bi {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5896a;

    bk(IBinder iBinder) {
        this.f5896a = iBinder;
    }

    @Override // com.google.android.gms.internal.bi
    public final com.google.android.gms.dynamic.a a(com.google.android.gms.dynamic.a aVar, com.google.android.gms.dynamic.a aVar2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
            obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
            obtain.writeStrongBinder(aVar2 != null ? aVar2.asBinder() : null);
            this.f5896a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
            return com.google.android.gms.dynamic.b.a(obtain2.readStrongBinder());
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.bi
    public final String a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
            this.f5896a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.bi
    public final String a(com.google.android.gms.dynamic.a aVar, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
            obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
            obtain.writeString(str);
            this.f5896a.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.bi
    public final void a(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
            obtain.writeString(str);
            this.f5896a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.bi
    public final void a(String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f5896a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.bi
    public final boolean a(com.google.android.gms.dynamic.a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
            obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
            this.f5896a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.bi
    public final boolean a(String str, boolean z) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
            obtain.writeString(str);
            obtain.writeInt(z ? 1 : 0);
            this.f5896a.transact(11, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5896a;
    }

    @Override // com.google.android.gms.internal.bi
    public final com.google.android.gms.dynamic.a b(com.google.android.gms.dynamic.a aVar, com.google.android.gms.dynamic.a aVar2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
            obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
            obtain.writeStrongBinder(aVar2 != null ? aVar2.asBinder() : null);
            this.f5896a.transact(10, obtain, obtain2, 0);
            obtain2.readException();
            return com.google.android.gms.dynamic.b.a(obtain2.readStrongBinder());
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.bi
    public final boolean b(com.google.android.gms.dynamic.a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
            obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
            this.f5896a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.bi
    public final String c(com.google.android.gms.dynamic.a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
            obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
            this.f5896a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.bi
    public final void d(com.google.android.gms.dynamic.a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
            obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
            this.f5896a.transact(9, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
