package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j implements Parcelable.Creator<GetAllCapabilitiesResponse> {
    static void a(GetAllCapabilitiesResponse getAllCapabilitiesResponse, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, getAllCapabilitiesResponse.f6518a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, getAllCapabilitiesResponse.f6519b);
        com.google.android.gms.common.internal.safeparcel.a.c(parcel, 3, getAllCapabilitiesResponse.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GetAllCapabilitiesResponse[] newArray(int i) {
        return new GetAllCapabilitiesResponse[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GetAllCapabilitiesResponse createFromParcel(Parcel parcel) {
        int i = 0;
        int a2 = zza.a(parcel);
        ArrayList arrayList = null;
        int i2 = 0;
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
                    arrayList = zza.c(parcel, readInt, CapabilityInfoParcelable.CREATOR);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new GetAllCapabilitiesResponse(i2, i, arrayList);
    }
}
