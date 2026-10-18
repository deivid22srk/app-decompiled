package com.google.android.gms.googlehelp.internal.common;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.googlehelp.GoogleHelp;

/* loaded from: classes.dex */
public abstract class w extends Binder implements v {
    public static v a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof v)) ? new x(iBinder) : (v) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
                a(parcel.readInt() != 0 ? GoogleHelp.CREATOR.createFromParcel(parcel) : null, t.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
                a(parcel.readInt() != 0 ? GoogleHelp.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bitmap) Bitmap.CREATOR.createFromParcel(parcel) : null, t.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
                a(parcel.readInt() != 0 ? (Bitmap) Bitmap.CREATOR.createFromParcel(parcel) : null, t.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
                a(t.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
                b(t.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
                c(t.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
