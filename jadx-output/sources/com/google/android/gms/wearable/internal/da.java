package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class da implements Parcelable.Creator<ChannelSendFileResponse> {
    static void a(ChannelSendFileResponse channelSendFileResponse, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, channelSendFileResponse.f6506a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, channelSendFileResponse.f6507b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ChannelSendFileResponse[] newArray(int i) {
        return new ChannelSendFileResponse[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ChannelSendFileResponse createFromParcel(Parcel parcel) {
        int i = 0;
        int a2 = zza.a(parcel);
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
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new ChannelSendFileResponse(i2, i);
    }
}
