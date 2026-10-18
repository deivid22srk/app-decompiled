package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.RadioStationInfo;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class en implements Parcelable.Creator<RadioStationInfo.MetaData> {
    static void a(RadioStationInfo.MetaData metaData, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, metaData.f5441b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, metaData.f5440a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, metaData.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, metaData.d, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, metaData.e, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RadioStationInfo.MetaData[] newArray(int i) {
        return new RadioStationInfo.MetaData[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RadioStationInfo.MetaData createFromParcel(Parcel parcel) {
        RadioStationInfo.HdData hdData = null;
        int i = 0;
        int a2 = zza.a(parcel);
        RadioStationInfo.RdsData rdsData = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i2 = zza.e(parcel, readInt);
                    break;
                case 2:
                    i = zza.e(parcel, readInt);
                    break;
                case 3:
                    rdsData = (RadioStationInfo.RdsData) zza.a(parcel, readInt, RadioStationInfo.RdsData.CREATOR);
                    break;
                case 4:
                    hdData = (RadioStationInfo.HdData) zza.a(parcel, readInt, RadioStationInfo.HdData.CREATOR);
                    break;
                case 1000:
                    i3 = zza.e(parcel, readInt);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new RadioStationInfo.MetaData(i3, i2, i, rdsData, hdData);
    }
}
