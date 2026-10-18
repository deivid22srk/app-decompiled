package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.RadioStationInfo;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class eo implements Parcelable.Creator<RadioStationInfo.RdsData> {
    static void a(RadioStationInfo.RdsData rdsData, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 1, rdsData.f5443b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, rdsData.f5442a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, rdsData.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 3, rdsData.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, rdsData.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 5, rdsData.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, rdsData.g);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, rdsData.h);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 8, rdsData.i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 9, rdsData.j);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RadioStationInfo.RdsData[] newArray(int i) {
        return new RadioStationInfo.RdsData[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RadioStationInfo.RdsData createFromParcel(Parcel parcel) {
        String str = null;
        boolean z = false;
        int a2 = zza.a(parcel);
        boolean z2 = false;
        String str2 = null;
        int i = 0;
        String str3 = null;
        int i2 = 0;
        int i3 = 0;
        ArrayList<Integer> arrayList = null;
        int i4 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    arrayList = zza.n(parcel, readInt);
                    break;
                case 2:
                    i3 = zza.e(parcel, readInt);
                    break;
                case 3:
                    i2 = zza.e(parcel, readInt);
                    break;
                case 4:
                    str3 = zza.i(parcel, readInt);
                    break;
                case 5:
                    i = zza.e(parcel, readInt);
                    break;
                case 6:
                    str2 = zza.i(parcel, readInt);
                    break;
                case 7:
                    str = zza.i(parcel, readInt);
                    break;
                case 8:
                    z2 = zza.c(parcel, readInt);
                    break;
                case 9:
                    z = zza.c(parcel, readInt);
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
        return new RadioStationInfo.RdsData(i4, arrayList, i3, i2, str3, i, str2, str, z2, z);
    }
}
