package com.google.android.finsky.installer;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class m implements k {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f2863a;

    m(IBinder iBinder) {
        this.f2863a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2863a;
    }

    @Override // com.google.android.finsky.installer.k
    public final void a(String str) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.finsky.installer.IMultiUserCoordinatorServiceListener");
            obtain.writeString(str);
            this.f2863a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.finsky.installer.k
    public final void b(String str) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.finsky.installer.IMultiUserCoordinatorServiceListener");
            obtain.writeString(str);
            this.f2863a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
