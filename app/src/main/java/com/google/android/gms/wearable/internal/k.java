package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class k implements Parcelable.Creator<GetCapabilityResponse> {
    static void a(GetCapabilityResponse getCapabilityResponse, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, getCapabilityResponse.f6520a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, getCapabilityResponse.f6521b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, getCapabilityResponse.c, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GetCapabilityResponse[] newArray(int i) {
        return new GetCapabilityResponse[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GetCapabilityResponse createFromParcel(Parcel parcel) {
        int i = 0;
        int a2 = zza.a(parcel);
        CapabilityInfoParcelable capabilityInfoParcelable = null;
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
                    capabilityInfoParcelable = (CapabilityInfoParcelable) zza.a(parcel, readInt, CapabilityInfoParcelable.CREATOR);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new GetCapabilityResponse(i2, i, capabilityInfoParcelable);
    }
}
