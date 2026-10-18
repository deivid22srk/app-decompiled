package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class o implements Parcelable.Creator<GetCloudSyncOptInStatusResponse> {
    static void a(GetCloudSyncOptInStatusResponse getCloudSyncOptInStatusResponse, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, getCloudSyncOptInStatusResponse.f6528a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, getCloudSyncOptInStatusResponse.f6529b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, getCloudSyncOptInStatusResponse.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, getCloudSyncOptInStatusResponse.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GetCloudSyncOptInStatusResponse[] newArray(int i) {
        return new GetCloudSyncOptInStatusResponse[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GetCloudSyncOptInStatusResponse createFromParcel(Parcel parcel) {
        boolean z = false;
        int a2 = zza.a(parcel);
        boolean z2 = false;
        int i = 0;
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
                    z2 = zza.c(parcel, readInt);
                    break;
                case 4:
                    z = zza.c(parcel, readInt);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new GetCloudSyncOptInStatusResponse(i2, i, z2, z);
    }
}
