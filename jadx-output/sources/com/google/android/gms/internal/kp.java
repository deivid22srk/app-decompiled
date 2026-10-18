package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.clearcut.LogEventParcelable;

/* loaded from: classes.dex */
final class kp implements kn {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f6113a;

    kp(IBinder iBinder) {
        this.f6113a = iBinder;
    }

    @Override // com.google.android.gms.internal.kn
    public final void a(kk kkVar, LogEventParcelable logEventParcelable) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
            obtain.writeStrongBinder(kkVar != null ? kkVar.asBinder() : null);
            if (logEventParcelable != null) {
                obtain.writeInt(1);
                logEventParcelable.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6113a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6113a;
    }
}
