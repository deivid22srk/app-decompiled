package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class bk implements Parcelable.Creator<RemoveLargeAssetQueueEntriesResponse> {
    static void a(RemoveLargeAssetQueueEntriesResponse removeLargeAssetQueueEntriesResponse, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, removeLargeAssetQueueEntriesResponse.f6570a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, removeLargeAssetQueueEntriesResponse.f6571b, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 3, removeLargeAssetQueueEntriesResponse.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RemoveLargeAssetQueueEntriesResponse[] newArray(int i) {
        return new RemoveLargeAssetQueueEntriesResponse[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RemoveLargeAssetQueueEntriesResponse createFromParcel(Parcel parcel) {
        int a2 = zza.a(parcel);
        Status status = null;
        int i = 0;
        int i2 = 0;
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
        return new RemoveLargeAssetQueueEntriesResponse(i, status, i2);
    }
}
