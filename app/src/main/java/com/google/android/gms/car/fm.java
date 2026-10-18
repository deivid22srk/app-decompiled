package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.CarPhoneStatus;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class fm implements Parcelable.Creator<CarPhoneStatus> {
    static void a(CarPhoneStatus carPhoneStatus, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 1, carPhoneStatus.f5424b, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, carPhoneStatus.f5423a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, carPhoneStatus.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CarPhoneStatus[] newArray(int i) {
        return new CarPhoneStatus[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CarPhoneStatus createFromParcel(Parcel parcel) {
        int a2 = zza.a(parcel);
        CarPhoneStatus.CarCall[] carCallArr = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    carCallArr = (CarPhoneStatus.CarCall[]) zza.b(parcel, readInt, CarPhoneStatus.CarCall.CREATOR);
                    break;
                case 2:
                    i2 = zza.e(parcel, readInt);
                    break;
                case 1000:
                    i = zza.e(parcel, readInt);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new CarPhoneStatus(i, carCallArr, i2);
    }
}
