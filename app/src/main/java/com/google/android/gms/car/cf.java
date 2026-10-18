package com.google.android.gms.car;

import android.os.IBinder;
import android.os.Parcel;
import android.view.KeyEvent;
import com.google.android.gms.car.CarCall;
import java.util.List;

/* loaded from: classes.dex */
final class cf implements cd {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5496a;

    cf(IBinder iBinder) {
        this.f5496a = iBinder;
    }

    @Override // com.google.android.gms.car.cd
    public final void a(KeyEvent keyEvent) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarCallListener");
            if (keyEvent != null) {
                obtain.writeInt(1);
                keyEvent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f5496a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.cd
    public final void a(CarCall carCall) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarCallListener");
            if (carCall != null) {
                obtain.writeInt(1);
                carCall.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f5496a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.cd
    public final void a(CarCall carCall, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarCallListener");
            if (carCall != null) {
                obtain.writeInt(1);
                carCall.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeInt(i);
            this.f5496a.transact(5, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.cd
    public final void a(CarCall carCall, CarCall.Details details) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarCallListener");
            if (carCall != null) {
                obtain.writeInt(1);
                carCall.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (details != null) {
                obtain.writeInt(1);
                details.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f5496a.transact(8, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.cd
    public final void a(CarCall carCall, CarCall carCall2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarCallListener");
            if (carCall != null) {
                obtain.writeInt(1);
                carCall.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (carCall2 != null) {
                obtain.writeInt(1);
                carCall2.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f5496a.transact(6, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.cd
    public final void a(CarCall carCall, String str) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarCallListener");
            if (carCall != null) {
                obtain.writeInt(1);
                carCall.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeString(str);
            this.f5496a.transact(10, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.cd
    public final void a(CarCall carCall, List<CarCall> list) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarCallListener");
            if (carCall != null) {
                obtain.writeInt(1);
                carCall.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeTypedList(list);
            this.f5496a.transact(7, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.cd
    public final void a(boolean z, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarCallListener");
            obtain.writeInt(z ? 1 : 0);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.f5496a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5496a;
    }

    @Override // com.google.android.gms.car.cd
    public final void b(CarCall carCall) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarCallListener");
            if (carCall != null) {
                obtain.writeInt(1);
                carCall.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f5496a.transact(4, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.cd
    public final void b(CarCall carCall, List<String> list) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarCallListener");
            if (carCall != null) {
                obtain.writeInt(1);
                carCall.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeStringList(list);
            this.f5496a.transact(9, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.cd
    public final void c(CarCall carCall) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarCallListener");
            if (carCall != null) {
                obtain.writeInt(1);
                carCall.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f5496a.transact(11, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.cd
    public final void c(CarCall carCall, List<CarCall> list) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarCallListener");
            if (carCall != null) {
                obtain.writeInt(1);
                carCall.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeTypedList(list);
            this.f5496a.transact(12, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
