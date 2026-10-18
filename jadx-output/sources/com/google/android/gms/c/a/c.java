package com.google.android.gms.c.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.np;
import com.google.android.gms.internal.ns;

/* loaded from: classes.dex */
final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5393a;

    c(IBinder iBinder) {
        this.f5393a = iBinder;
    }

    @Override // com.google.android.gms.c.a.a
    public final void a(np npVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.mdm.internal.INetworkQualityService");
            obtain.writeStrongBinder(npVar != null ? npVar.asBinder() : null);
            this.f5393a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.c.a.a
    public final void a(ns nsVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.mdm.internal.INetworkQualityService");
            obtain.writeStrongBinder(nsVar != null ? nsVar.asBinder() : null);
            this.f5393a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.c.a.a
    public final void a(String str, Bundle bundle, Bundle bundle2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.mdm.internal.INetworkQualityService");
            obtain.writeString(str);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (bundle2 != null) {
                obtain.writeInt(1);
                bundle2.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f5393a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5393a;
    }
}
