package com.deivid22srk.store.licensing;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f1191a;

    c(IBinder iBinder) {
        this.f1191a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f1191a;
    }

    @Override // com.deivid22srk.store.licensing.a
    public final void a(int i, String str, String str2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.deivid22srk.store.licensing.ILicenseResultListener");
            obtain.writeInt(i);
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f1191a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
