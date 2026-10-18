package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.RadioStationInfo;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class el implements Parcelable.Creator<RadioStationInfo> {
    static void a(RadioStationInfo radioStationInfo, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, radioStationInfo.f5438b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, radioStationInfo.f5437a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, radioStationInfo.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 3, radioStationInfo.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, radioStationInfo.e, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RadioStationInfo[] newArray(int i) {
        return new RadioStationInfo[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RadioStationInfo createFromParcel(Parcel parcel) {
        int i = 0;
        int a2 = zza.a(parcel);
        RadioStationInfo.MetaData metaData = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i3 = zza.e(parcel, readInt);
                    break;
                case 2:
                    i2 = zza.e(parcel, readInt);
                    break;
                case 3:
                    i = zza.e(parcel, readInt);
                    break;
                case 4:
                    metaData = (RadioStationInfo.MetaData) zza.a(parcel, readInt, RadioStationInfo.MetaData.CREATOR);
                    break;
                case 1000:
                    i4 = zza.e(parcel, readInt);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new RadioStationInfo(i4, i3, i2, i, metaData);
    }
}
