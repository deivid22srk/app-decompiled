package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class eq implements Parcelable.Creator<StationPresetList> {
    static void a(StationPresetList stationPresetList, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 1, stationPresetList.f5447b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, stationPresetList.f5446a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, stationPresetList.c);
        com.google.android.gms.common.internal.safeparcel.a.c(parcel, 3, stationPresetList.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ StationPresetList[] newArray(int i) {
        return new StationPresetList[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ StationPresetList createFromParcel(Parcel parcel) {
        ArrayList arrayList = null;
        int a2 = zza.a(parcel);
        String str = null;
        int i = 0;
        ArrayList<Integer> arrayList2 = null;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    str = zza.i(parcel, readInt);
                    break;
                case 2:
                    arrayList2 = zza.n(parcel, readInt);
                    break;
                case 3:
                    arrayList = zza.c(parcel, readInt, StationPreset.CREATOR);
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
        return new StationPresetList(i, str, arrayList2, arrayList);
    }
}
