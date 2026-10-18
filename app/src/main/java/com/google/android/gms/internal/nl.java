package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.feedback.ErrorReport;

/* loaded from: classes.dex */
final class nl implements nj {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f6184a;

    nl(IBinder iBinder) {
        this.f6184a = iBinder;
    }

    @Override // com.google.android.gms.internal.nj
    public final void a(int i, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.feedback.internal.IFeedbackService");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.f6184a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.nj
    public final boolean a(ErrorReport errorReport) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.feedback.internal.IFeedbackService");
            if (errorReport != null) {
                obtain.writeInt(1);
                errorReport.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6184a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6184a;
    }

    @Override // com.google.android.gms.internal.nj
    public final boolean b(ErrorReport errorReport) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.feedback.internal.IFeedbackService");
            if (errorReport != null) {
                obtain.writeInt(1);
                errorReport.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6184a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
