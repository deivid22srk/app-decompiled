package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class ax implements Parcelable.Creator<LargeAssetSyncRequestPayload> {
    static void a(LargeAssetSyncRequestPayload largeAssetSyncRequestPayload, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, largeAssetSyncRequestPayload.f6558a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, largeAssetSyncRequestPayload.f6559b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, largeAssetSyncRequestPayload.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LargeAssetSyncRequestPayload[] newArray(int i) {
        return new LargeAssetSyncRequestPayload[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LargeAssetSyncRequestPayload createFromParcel(Parcel parcel) {
        int a2 = zza.a(parcel);
        int i = 0;
        String str = null;
        long j = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zza.e(parcel, readInt);
                    break;
                case 2:
                    str = zza.i(parcel, readInt);
                    break;
                case 3:
                    j = zza.f(parcel, readInt);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new LargeAssetSyncRequestPayload(i, str, j);
    }
}
