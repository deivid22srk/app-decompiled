package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class af implements ad {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5699a;

    af(IBinder iBinder) {
        this.f5699a = iBinder;
    }

    @Override // com.google.android.gms.common.internal.ad
    public final Account a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
            this.f5699a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5699a;
    }
}
