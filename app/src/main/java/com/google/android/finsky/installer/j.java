package com.google.android.finsky.installer;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class j implements h {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f2862a;

    j(IBinder iBinder) {
        this.f2862a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2862a;
    }

    @Override // com.google.android.finsky.installer.h
    public final void a(k kVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.finsky.installer.IMultiUserCoordinatorService");
            obtain.writeStrongBinder(kVar != null ? kVar.asBinder() : null);
            this.f2862a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.finsky.installer.h
    public final boolean a(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.finsky.installer.IMultiUserCoordinatorService");
            obtain.writeString(str);
            this.f2862a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.finsky.installer.h
    public final void b(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.finsky.installer.IMultiUserCoordinatorService");
            obtain.writeString(str);
            this.f2862a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.finsky.installer.h
    public final void a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.finsky.installer.IMultiUserCoordinatorService");
            this.f2862a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
