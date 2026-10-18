package com.google.android.play;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f6822a;

    c(IBinder iBinder) {
        this.f6822a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6822a;
    }

    @Override // com.google.android.play.a
    public final List<Bundle> a(int i, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.play.IUserContentService");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.f6822a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createTypedArrayList(Bundle.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
