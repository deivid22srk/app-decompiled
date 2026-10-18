package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ek implements Parcelable.Creator<RadioState> {
    static void a(RadioState radioState, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 1, radioState.f5436b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, radioState.f5435a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, radioState.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 3, radioState.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, radioState.e, i);
        com.google.android.gms.common.internal.safeparcel.a.c(parcel, 5, radioState.f);
        com.google.android.gms.common.internal.safeparcel.a.c(parcel, 6, radioState.g);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RadioState[] newArray(int i) {
        return new RadioState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RadioState createFromParcel(Parcel parcel) {
        ArrayList arrayList = null;
        int i = 0;
        int a2 = zza.a(parcel);
        ArrayList arrayList2 = null;
        RadioStationInfo radioStationInfo = null;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    z2 = zza.c(parcel, readInt);
                    break;
                case 2:
                    z = zza.c(parcel, readInt);
                    break;
                case 3:
                    i = zza.e(parcel, readInt);
                    break;
                case 4:
                    radioStationInfo = (RadioStationInfo) zza.a(parcel, readInt, RadioStationInfo.CREATOR);
                    break;
                case 5:
                    arrayList2 = zza.c(parcel, readInt, RadioStationInfo.CREATOR);
                    break;
                case 6:
                    arrayList = zza.c(parcel, readInt, StationPresetList.CREATOR);
                    break;
                case 1000:
                    i2 = zza.e(parcel, readInt);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new RadioState(i2, z2, z, i, radioStationInfo, arrayList2, arrayList);
    }
}
