package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.clearcut.LogEventParcelable;

/* loaded from: classes.dex */
public abstract class ko extends Binder implements kn {
    public static kn a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof kn)) ? new kp(iBinder) : (kn) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        kk kmVar;
        LogEventParcelable logEventParcelable = null;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    kmVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                    kmVar = (queryLocalInterface == null || !(queryLocalInterface instanceof kk)) ? new km(readStrongBinder) : (kk) queryLocalInterface;
                }
                if (parcel.readInt() != 0) {
                    com.google.android.gms.clearcut.g gVar = LogEventParcelable.CREATOR;
                    logEventParcelable = com.google.android.gms.clearcut.g.a(parcel);
                }
                a(kmVar, logEventParcelable);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
