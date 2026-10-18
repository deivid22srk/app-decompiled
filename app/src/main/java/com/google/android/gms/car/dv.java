package com.google.android.gms.car;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
final class dv implements dt {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f5510a;

    dv(IBinder iBinder) {
        this.f5510a = iBinder;
    }

    @Override // com.google.android.gms.car.dt
    public final void a(int i, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarRadioCallback");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.f5510a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.dt
    public final void a(int i, int i2, int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarRadioCallback");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            this.f5510a.transact(12, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.dt
    public final void a(int i, int i2, RadioStationInfo radioStationInfo) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarRadioCallback");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            if (radioStationInfo != null) {
                obtain.writeInt(1);
                radioStationInfo.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f5510a.transact(8, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.dt
    public final void a(int i, int i2, List<TrafficIncident> list) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarRadioCallback");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeTypedList(list);
            this.f5510a.transact(11, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.dt
    public final void a(int i, int i2, boolean z) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarRadioCallback");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(z ? 1 : 0);
            this.f5510a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.dt
    public final void a(int i, int i2, boolean z, List<RadioStationInfo> list) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarRadioCallback");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(z ? 1 : 0);
            obtain.writeTypedList(list);
            this.f5510a.transact(10, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.dt
    public final void a(int i, RadioStationInfo radioStationInfo) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarRadioCallback");
            obtain.writeInt(i);
            if (radioStationInfo != null) {
                obtain.writeInt(1);
                radioStationInfo.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f5510a.transact(5, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.dt
    public final void a(int i, boolean z) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarRadioCallback");
            obtain.writeInt(i);
            obtain.writeInt(z ? 1 : 0);
            this.f5510a.transact(7, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.dt
    public final void a(List<StationPresetList> list) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarRadioCallback");
            obtain.writeTypedList(list);
            this.f5510a.transact(9, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5510a;
    }

    @Override // com.google.android.gms.car.dt
    public final void b(int i, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarRadioCallback");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.f5510a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.dt
    public final void b(int i, int i2, boolean z) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarRadioCallback");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(z ? 1 : 0);
            this.f5510a.transact(6, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.dt
    public final void c(int i, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarRadioCallback");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.f5510a.transact(4, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.car.dt
    public final void d(int i, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.car.ICarRadioCallback");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.f5510a.transact(13, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
