package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.RadioStationInfo;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class em implements Parcelable.Creator<RadioStationInfo.HdData> {
    static void a(RadioStationInfo.HdData hdData, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, hdData.f5439a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RadioStationInfo.HdData[] newArray(int i) {
        return new RadioStationInfo.HdData[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RadioStationInfo.HdData createFromParcel(Parcel parcel) {
        int a2 = zza.a(parcel);
        int i = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
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
        return new RadioStationInfo.HdData(i);
    }
}
