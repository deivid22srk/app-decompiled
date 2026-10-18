package com.google.android.gms.googlehelp.internal.common;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.googlehelp.GoogleHelp;

/* loaded from: classes.dex */
final class x implements v {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5847a;

    x(IBinder iBinder) {
        this.f5847a = iBinder;
    }

    @Override // com.google.android.gms.googlehelp.internal.common.v
    public final void a(Bitmap bitmap, s sVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            if (bitmap != null) {
                obtain.writeInt(1);
                bitmap.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeStrongBinder(sVar != null ? sVar.asBinder() : null);
            this.f5847a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.googlehelp.internal.common.v
    public final void a(GoogleHelp googleHelp, Bitmap bitmap, s sVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            if (googleHelp != null) {
                obtain.writeInt(1);
                googleHelp.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (bitmap != null) {
                obtain.writeInt(1);
                bitmap.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeStrongBinder(sVar != null ? sVar.asBinder() : null);
            this.f5847a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.googlehelp.internal.common.v
    public final void a(GoogleHelp googleHelp, s sVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            if (googleHelp != null) {
                obtain.writeInt(1);
                googleHelp.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeStrongBinder(sVar != null ? sVar.asBinder() : null);
            this.f5847a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.googlehelp.internal.common.v
    public final void a(s sVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            obtain.writeStrongBinder(sVar != null ? sVar.asBinder() : null);
            this.f5847a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5847a;
    }

    @Override // com.google.android.gms.googlehelp.internal.common.v
    public final void b(s sVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            obtain.writeStrongBinder(sVar != null ? sVar.asBinder() : null);
            this.f5847a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.googlehelp.internal.common.v
    public final void c(s sVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            obtain.writeStrongBinder(sVar != null ? sVar.asBinder() : null);
            this.f5847a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
