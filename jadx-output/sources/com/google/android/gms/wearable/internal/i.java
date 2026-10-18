package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class i implements Parcelable.Creator<EnqueueLargeAssetResponse> {
    static void a(EnqueueLargeAssetResponse enqueueLargeAssetResponse, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, enqueueLargeAssetResponse.f6516a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, enqueueLargeAssetResponse.f6517b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, enqueueLargeAssetResponse.c, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ EnqueueLargeAssetResponse[] newArray(int i) {
        return new EnqueueLargeAssetResponse[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ EnqueueLargeAssetResponse createFromParcel(Parcel parcel) {
        int i = 0;
        int a2 = zza.a(parcel);
        LargeAssetQueueEntryParcelable largeAssetQueueEntryParcelable = null;
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
                    largeAssetQueueEntryParcelable = (LargeAssetQueueEntryParcelable) zza.a(parcel, readInt, LargeAssetQueueEntryParcelable.CREATOR);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new EnqueueLargeAssetResponse(i2, i, largeAssetQueueEntryParcelable);
    }
}
