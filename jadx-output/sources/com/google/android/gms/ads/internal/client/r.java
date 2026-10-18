package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.et;

/* loaded from: classes.dex */
final class r implements p {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5308a;

    r(IBinder iBinder) {
        this.f5308a = iBinder;
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final IBinder a(com.google.android.gms.dynamic.a aVar, AdSizeParcel adSizeParcel, String str, et etVar, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
            if (adSizeParcel != null) {
                obtain.writeInt(1);
                adSizeParcel.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeString(str);
            obtain.writeStrongBinder(etVar != null ? etVar.asBinder() : null);
            obtain.writeInt(i);
            this.f5308a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readStrongBinder();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.p
    public final IBinder a(com.google.android.gms.dynamic.a aVar, AdSizeParcel adSizeParcel, String str, et etVar, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
            if (adSizeParcel != null) {
                obtain.writeInt(1);
                adSizeParcel.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeString(str);
            obtain.writeStrongBinder(etVar != null ? etVar.asBinder() : null);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.f5308a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readStrongBinder();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5308a;
    }
}
