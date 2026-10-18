package com.google.android.gms.car;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class dp implements dn {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5508a;

    dp(IBinder iBinder) {
        this.f5508a = iBinder;
    }

    @Override // com.google.android.gms.car.dn
    public final void a(String str, String str2, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarPhoneStatusEventListener");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeInt(i);
            this.f5508a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5508a;
    }
}
