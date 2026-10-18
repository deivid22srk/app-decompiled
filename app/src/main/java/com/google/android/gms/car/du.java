package com.google.android.gms.car;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class du extends Binder implements dt {
    public static dt a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.ICarRadioCallback");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof dt)) ? new dv(iBinder) : (dt) queryLocalInterface;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.car.ICarRadioCallback");
                a(parcel.readInt(), parcel.readInt());
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.car.ICarRadioCallback");
                b(parcel.readInt(), parcel.readInt());
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.car.ICarRadioCallback");
                a(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.car.ICarRadioCallback");
                c(parcel.readInt(), parcel.readInt());
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.car.ICarRadioCallback");
                a(parcel.readInt(), parcel.readInt() != 0 ? RadioStationInfo.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.car.ICarRadioCallback");
                b(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.car.ICarRadioCallback");
                a(parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.car.ICarRadioCallback");
                a(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0 ? RadioStationInfo.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.car.ICarRadioCallback");
                a(parcel.createTypedArrayList(StationPresetList.CREATOR));
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.car.ICarRadioCallback");
                a(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.createTypedArrayList(RadioStationInfo.CREATOR));
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.car.ICarRadioCallback");
                a(parcel.readInt(), parcel.readInt(), parcel.createTypedArrayList(TrafficIncident.CREATOR));
                return true;
            case 12:
                parcel.enforceInterface("com.google.android.gms.car.ICarRadioCallback");
                a(parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            case 13:
                parcel.enforceInterface("com.google.android.gms.car.ICarRadioCallback");
                d(parcel.readInt(), parcel.readInt());
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.car.ICarRadioCallback");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
