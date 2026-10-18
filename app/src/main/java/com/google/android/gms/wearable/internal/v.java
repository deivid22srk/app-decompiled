package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class v implements Parcelable.Creator<GetLargeAssetQueueStateResponse> {
    static void a(GetLargeAssetQueueStateResponse getLargeAssetQueueStateResponse, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, getLargeAssetQueueStateResponse.f6542a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, getLargeAssetQueueStateResponse.f6543b, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, getLargeAssetQueueStateResponse.c, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GetLargeAssetQueueStateResponse[] newArray(int i) {
        return new GetLargeAssetQueueStateResponse[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GetLargeAssetQueueStateResponse createFromParcel(Parcel parcel) {
        int a2 = zza.a(parcel);
        Status status = null;
        int i = 0;
        LargeAssetQueueStateParcelable largeAssetQueueStateParcelable = null;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zza.e(parcel, readInt);
                    break;
                case 2:
                    status = (Status) zza.a(parcel, readInt, Status.CREATOR);
                    break;
                case 3:
                    largeAssetQueueStateParcelable = (LargeAssetQueueStateParcelable) zza.a(parcel, readInt, LargeAssetQueueStateParcelable.CREATOR);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new GetLargeAssetQueueStateResponse(i, status, largeAssetQueueStateParcelable);
    }
}
