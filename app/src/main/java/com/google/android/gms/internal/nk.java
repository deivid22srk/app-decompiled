package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.feedback.ErrorReport;

/* loaded from: classes.dex */
public abstract class nk extends Binder implements nj {
    public static nj a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.feedback.internal.IFeedbackService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof nj)) ? new nl(iBinder) : (nj) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.feedback.internal.IFeedbackService");
                boolean a2 = a(parcel.readInt() != 0 ? ErrorReport.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeInt(a2 ? 1 : 0);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.feedback.internal.IFeedbackService");
                a(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.feedback.internal.IFeedbackService");
                boolean b2 = b(parcel.readInt() != 0 ? ErrorReport.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeInt(b2 ? 1 : 0);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.feedback.internal.IFeedbackService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
