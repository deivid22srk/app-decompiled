package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* loaded from: classes.dex */
public final class r implements Parcelable.Creator<GetConfigsResponse> {
    static void a(GetConfigsResponse getConfigsResponse, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, getConfigsResponse.f6534a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, getConfigsResponse.f6535b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, getConfigsResponse.c, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GetConfigsResponse[] newArray(int i) {
        return new GetConfigsResponse[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GetConfigsResponse createFromParcel(Parcel parcel) {
        int i = 0;
        int a2 = zza.a(parcel);
        ConnectionConfiguration[] connectionConfigurationArr = null;
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
                    connectionConfigurationArr = (ConnectionConfiguration[]) zza.b(parcel, readInt, ConnectionConfiguration.CREATOR);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new GetConfigsResponse(i2, i, connectionConfigurationArr);
    }
}
