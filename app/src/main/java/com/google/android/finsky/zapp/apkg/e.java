package com.google.android.finsky.zapp.apkg;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    public IBinder f5246a;

    e(IBinder iBinder) {
        this.f5246a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5246a;
    }

    @Override // com.google.android.finsky.zapp.apkg.c
    public final void a(int i, List<Bundle> list, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.finsky.zapp.protocol.IPlayModuleServiceCallbacks");
            obtain.writeInt(i);
            obtain.writeTypedList(list);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f5246a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
