package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class bq implements Parcelable.Creator<StorageInfoResponse> {
    static void a(StorageInfoResponse storageInfoResponse, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, storageInfoResponse.f6578a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, storageInfoResponse.f6579b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, storageInfoResponse.c);
        com.google.android.gms.common.internal.safeparcel.a.c(parcel, 4, storageInfoResponse.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ StorageInfoResponse[] newArray(int i) {
        return new StorageInfoResponse[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ StorageInfoResponse createFromParcel(Parcel parcel) {
        int i = 0;
        int a2 = zza.a(parcel);
        long j = 0;
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
                    j = zza.f(parcel, readInt);
                    break;
                case 4:
                    arrayList = zza.c(parcel, readInt, PackageStorageInfo.CREATOR);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new StorageInfoResponse(i2, i, j, arrayList);
    }
}
