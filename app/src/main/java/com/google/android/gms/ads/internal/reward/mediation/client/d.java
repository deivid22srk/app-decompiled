package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class d implements Parcelable.Creator<RewardItemParcel> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RewardItemParcel createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public static RewardItemParcel a(Parcel parcel) {
        int i = 0;
        int a2 = zza.a(parcel);
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i2 = zza.e(parcel, readInt);
                    break;
                case 2:
                    str = zza.i(parcel, readInt);
                    break;
                case 3:
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
        return new RewardItemParcel(i2, str, i);
    }

    static void a(RewardItemParcel rewardItemParcel, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, rewardItemParcel.f5348a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, rewardItemParcel.f5349b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 3, rewardItemParcel.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RewardItemParcel[] newArray(int i) {
        return new RewardItemParcel[i];
    }
}
