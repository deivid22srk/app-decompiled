package com.google.android.gms.car;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.KeyEvent;
import com.google.android.gms.car.CarCall;

/* loaded from: classes.dex */
public abstract class ce extends Binder implements cd {
    public static cd a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.ICarCallListener");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof cd)) ? new cf(iBinder) : (cd) queryLocalInterface;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.car.ICarCallListener");
                a(parcel.readInt() != 0 ? (KeyEvent) KeyEvent.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.car.ICarCallListener");
                a(parcel.readInt() != 0, parcel.readInt(), parcel.readInt());
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.car.ICarCallListener");
                a(parcel.readInt() != 0 ? CarCall.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.car.ICarCallListener");
                b(parcel.readInt() != 0 ? CarCall.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.car.ICarCallListener");
                a(parcel.readInt() != 0 ? CarCall.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.car.ICarCallListener");
                a(parcel.readInt() != 0 ? CarCall.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? CarCall.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.car.ICarCallListener");
                a(parcel.readInt() != 0 ? CarCall.CREATOR.createFromParcel(parcel) : null, parcel.createTypedArrayList(CarCall.CREATOR));
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.car.ICarCallListener");
                a(parcel.readInt() != 0 ? CarCall.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? CarCall.Details.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.car.ICarCallListener");
                b(parcel.readInt() != 0 ? CarCall.CREATOR.createFromParcel(parcel) : null, parcel.createStringArrayList());
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.car.ICarCallListener");
                a(parcel.readInt() != 0 ? CarCall.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.car.ICarCallListener");
                c(parcel.readInt() != 0 ? CarCall.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 12:
                parcel.enforceInterface("com.google.android.gms.car.ICarCallListener");
                c(parcel.readInt() != 0 ? CarCall.CREATOR.createFromParcel(parcel) : null, parcel.createTypedArrayList(CarCall.CREATOR));
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.car.ICarCallListener");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
