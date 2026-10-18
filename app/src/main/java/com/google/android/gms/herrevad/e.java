package com.google.android.gms.herrevad;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class e implements Parcelable.Creator<PredictedNetworkQuality> {
    static void a(PredictedNetworkQuality predictedNetworkQuality, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, predictedNetworkQuality.f5854a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, predictedNetworkQuality.f5855b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 3, predictedNetworkQuality.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, predictedNetworkQuality.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, predictedNetworkQuality.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PredictedNetworkQuality[] newArray(int i) {
        return new PredictedNetworkQuality[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PredictedNetworkQuality createFromParcel(Parcel parcel) {
        long j = 0;
        int i = 0;
        int a2 = zza.a(parcel);
        long j2 = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i3 = zza.e(parcel, readInt);
                    break;
                case 2:
                    i2 = zza.e(parcel, readInt);
                    break;
                case 3:
                    i = zza.e(parcel, readInt);
                    break;
                case 4:
                    j2 = zza.f(parcel, readInt);
                    break;
                case 5:
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
        return new PredictedNetworkQuality(i3, i2, i, j2, j);
    }
}
