package com.google.android.gms.internal;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class dg implements de {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5943a;

    dg(IBinder iBinder) {
        this.f5943a = iBinder;
    }

    @Override // com.google.android.gms.internal.de
    public final com.google.android.gms.dynamic.a a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            this.f5943a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return com.google.android.gms.dynamic.b.a(obtain2.readStrongBinder());
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5943a;
    }

    @Override // com.google.android.gms.internal.de
    public final Uri b() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            this.f5943a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.de
    public final double c() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            this.f5943a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readDouble();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
