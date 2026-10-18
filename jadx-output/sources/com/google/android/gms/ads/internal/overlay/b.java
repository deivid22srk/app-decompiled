package com.google.android.gms.ads.internal.overlay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator<AdLauncherIntentInfoParcel> {
    static void a(AdLauncherIntentInfoParcel adLauncherIntentInfoParcel, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, adLauncherIntentInfoParcel.f5316a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, adLauncherIntentInfoParcel.f5317b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, adLauncherIntentInfoParcel.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, adLauncherIntentInfoParcel.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, adLauncherIntentInfoParcel.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, adLauncherIntentInfoParcel.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, adLauncherIntentInfoParcel.g);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 8, adLauncherIntentInfoParcel.h);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AdLauncherIntentInfoParcel[] newArray(int i) {
        return new AdLauncherIntentInfoParcel[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AdLauncherIntentInfoParcel createFromParcel(Parcel parcel) {
        String str = null;
        int a2 = zza.a(parcel);
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zza.e(parcel, readInt);
                    break;
                case 2:
                    str7 = zza.i(parcel, readInt);
                    break;
                case 3:
                    str6 = zza.i(parcel, readInt);
                    break;
                case 4:
                    str5 = zza.i(parcel, readInt);
                    break;
                case 5:
                    str4 = zza.i(parcel, readInt);
                    break;
                case 6:
                    str3 = zza.i(parcel, readInt);
                    break;
                case 7:
                    str2 = zza.i(parcel, readInt);
                    break;
                case 8:
                    str = zza.i(parcel, readInt);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new AdLauncherIntentInfoParcel(i, str7, str6, str5, str4, str3, str2, str);
    }
}
