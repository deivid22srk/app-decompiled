package com.google.android.gms.car;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class co implements cm {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5499a;

    co(IBinder iBinder) {
        this.f5499a = iBinder;
    }

    @Override // com.google.android.gms.car.cm
    public final void a(cp cpVar, CarMediaBrowserListNode carMediaBrowserListNode) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarMediaBrowser");
            obtain.writeStrongBinder(cpVar != null ? cpVar.asBinder() : null);
            if (carMediaBrowserListNode != null) {
                obtain.writeInt(1);
                carMediaBrowserListNode.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f5499a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.cm
    public final void a(cp cpVar, CarMediaBrowserRootNode carMediaBrowserRootNode) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarMediaBrowser");
            obtain.writeStrongBinder(cpVar != null ? cpVar.asBinder() : null);
            if (carMediaBrowserRootNode != null) {
                obtain.writeInt(1);
                carMediaBrowserRootNode.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f5499a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.cm
    public final void a(cp cpVar, CarMediaBrowserSongNode carMediaBrowserSongNode) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarMediaBrowser");
            obtain.writeStrongBinder(cpVar != null ? cpVar.asBinder() : null);
            if (carMediaBrowserSongNode != null) {
                obtain.writeInt(1);
                carMediaBrowserSongNode.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f5499a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.cm
    public final void a(cp cpVar, CarMediaBrowserSourceNode carMediaBrowserSourceNode) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarMediaBrowser");
            obtain.writeStrongBinder(cpVar != null ? cpVar.asBinder() : null);
            if (carMediaBrowserSourceNode != null) {
                obtain.writeInt(1);
                carMediaBrowserSourceNode.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f5499a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.cm
    public final boolean a(cp cpVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarMediaBrowser");
            obtain.writeStrongBinder(cpVar != null ? cpVar.asBinder() : null);
            this.f5499a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5499a;
    }

    @Override // com.google.android.gms.car.cm
    public final boolean b(cp cpVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarMediaBrowser");
            obtain.writeStrongBinder(cpVar != null ? cpVar.asBinder() : null);
            this.f5499a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
