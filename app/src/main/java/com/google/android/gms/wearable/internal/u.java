package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class u implements Parcelable.Creator<GetFdForAssetResponse> {
    static void a(GetFdForAssetResponse getFdForAssetResponse, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, getFdForAssetResponse.f6540a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, getFdForAssetResponse.f6541b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, getFdForAssetResponse.c, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GetFdForAssetResponse[] newArray(int i) {
        return new GetFdForAssetResponse[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GetFdForAssetResponse createFromParcel(Parcel parcel) {
        int i = 0;
        int a2 = zza.a(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
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
                    parcelFileDescriptor = (ParcelFileDescriptor) zza.a(parcel, readInt, ParcelFileDescriptor.CREATOR);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new GetFdForAssetResponse(i2, i, parcelFileDescriptor);
    }
}
