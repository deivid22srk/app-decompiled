package com.google.android.play;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b extends Binder implements a {
    public static a a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.IUserContentService");
        if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
            return (a) queryLocalInterface;
        }
        return new c(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.play.IUserContentService");
                List<Bundle> a2 = a(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeTypedList(a2);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.play.IUserContentService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
