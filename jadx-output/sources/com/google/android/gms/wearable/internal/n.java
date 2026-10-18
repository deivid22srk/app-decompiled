package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class n implements Parcelable.Creator<GetCloudSyncOptInOutDoneResponse> {
    static void a(GetCloudSyncOptInOutDoneResponse getCloudSyncOptInOutDoneResponse, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, getCloudSyncOptInOutDoneResponse.f6526a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, getCloudSyncOptInOutDoneResponse.f6527b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, getCloudSyncOptInOutDoneResponse.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GetCloudSyncOptInOutDoneResponse[] newArray(int i) {
        return new GetCloudSyncOptInOutDoneResponse[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GetCloudSyncOptInOutDoneResponse createFromParcel(Parcel parcel) {
        boolean z = false;
        int a2 = zza.a(parcel);
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
        return new GetCloudSyncOptInOutDoneResponse(i2, i, z);
    }
}
