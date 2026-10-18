package com.google.android.gms.car;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class cn extends Binder implements cm {
    public static cm a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.ICarMediaBrowser");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof cm)) ? new co(iBinder) : (cm) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.car.ICarMediaBrowser");
                a(cq.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? CarMediaBrowserListNode.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.car.ICarMediaBrowser");
                a(cq.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? CarMediaBrowserRootNode.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.car.ICarMediaBrowser");
                a(cq.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? CarMediaBrowserSongNode.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.car.ICarMediaBrowser");
                a(cq.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? CarMediaBrowserSourceNode.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.car.ICarMediaBrowser");
                boolean a2 = a(cq.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(a2 ? 1 : 0);
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.car.ICarMediaBrowser");
                boolean b2 = b(cq.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(b2 ? 1 : 0);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.car.ICarMediaBrowser");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
