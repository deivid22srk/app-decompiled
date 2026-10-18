package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class v extends Binder implements u {
    public v() {
        attachInterface(this, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public static u a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof u)) ? new w(iBinder) : (u) queryLocalInterface;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        UserAttributeParcel userAttributeParcel;
        EventParcel eventParcel;
        AppMetadata appMetadata = null;
        AppMetadata appMetadata2 = null;
        AppMetadata appMetadata3 = null;
        AppMetadata appMetadata4 = null;
        EventParcel eventParcel2 = null;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                if (parcel.readInt() != 0) {
                    r rVar = EventParcel.CREATOR;
                    eventParcel = r.a(parcel);
                } else {
                    eventParcel = null;
                }
                if (parcel.readInt() != 0) {
                    h hVar = AppMetadata.CREATOR;
                    appMetadata2 = h.a(parcel);
                }
                a(eventParcel, appMetadata2);
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                if (parcel.readInt() != 0) {
                    f fVar = UserAttributeParcel.CREATOR;
                    userAttributeParcel = f.a(parcel);
                } else {
                    userAttributeParcel = null;
                }
                if (parcel.readInt() != 0) {
                    h hVar2 = AppMetadata.CREATOR;
                    appMetadata3 = h.a(parcel);
                }
                a(userAttributeParcel, appMetadata3);
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                if (parcel.readInt() != 0) {
                    h hVar3 = AppMetadata.CREATOR;
                    appMetadata4 = h.a(parcel);
                }
                a(appMetadata4);
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                if (parcel.readInt() != 0) {
                    r rVar2 = EventParcel.CREATOR;
                    eventParcel2 = r.a(parcel);
                }
                a(eventParcel2, parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                if (parcel.readInt() != 0) {
                    h hVar4 = AppMetadata.CREATOR;
                    appMetadata = h.a(parcel);
                }
                b(appMetadata);
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.measurement.internal.IMeasurementService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
