package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class bh implements Parcelable.Creator<PutDataResponse> {
    static void a(PutDataResponse putDataResponse, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, putDataResponse.f6568a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, putDataResponse.f6569b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, putDataResponse.c, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PutDataResponse[] newArray(int i) {
        return new PutDataResponse[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PutDataResponse createFromParcel(Parcel parcel) {
        int i = 0;
        int a2 = zza.a(parcel);
        DataItemParcelable dataItemParcelable = null;
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
                    dataItemParcelable = (DataItemParcelable) zza.a(parcel, readInt, DataItemParcelable.CREATOR);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new PutDataResponse(i2, i, dataItemParcelable);
    }
}
