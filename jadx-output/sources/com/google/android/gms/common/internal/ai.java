package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class ai implements ag {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5700a;

    ai(IBinder iBinder) {
        this.f5700a = iBinder;
    }

    @Override // com.google.android.gms.common.internal.ag
    public final void a() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.ICancelToken");
            this.f5700a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5700a;
    }
}
