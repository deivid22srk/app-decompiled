package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* loaded from: classes.dex */
public final class q implements Parcelable.Creator<GetConfigResponse> {
    static void a(GetConfigResponse getConfigResponse, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, getConfigResponse.f6532a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, getConfigResponse.f6533b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, getConfigResponse.c, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GetConfigResponse[] newArray(int i) {
        return new GetConfigResponse[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GetConfigResponse createFromParcel(Parcel parcel) {
        int i = 0;
        int a2 = zza.a(parcel);
        ConnectionConfiguration connectionConfiguration = null;
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
                    connectionConfiguration = (ConnectionConfiguration) zza.a(parcel, readInt, ConnectionConfiguration.CREATOR);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new GetConfigResponse(i2, i, connectionConfiguration);
    }
}
