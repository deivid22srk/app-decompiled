package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator<InterstitialAdParameterParcel> {
    static void a(InterstitialAdParameterParcel interstitialAdParameterParcel, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, interstitialAdParameterParcel.f5280a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, interstitialAdParameterParcel.f5281b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, interstitialAdParameterParcel.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, interstitialAdParameterParcel.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, interstitialAdParameterParcel.e);
        float f = interstitialAdParameterParcel.f;
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, 4);
        parcel.writeFloat(f);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ InterstitialAdParameterParcel[] newArray(int i) {
        return new InterstitialAdParameterParcel[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ InterstitialAdParameterParcel createFromParcel(Parcel parcel) {
        boolean z = false;
        int a2 = zza.a(parcel);
        String str = null;
        float f = 0.0f;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zza.e(parcel, readInt);
                    break;
                case 2:
                    z3 = zza.c(parcel, readInt);
                    break;
                case 3:
                    z2 = zza.c(parcel, readInt);
                    break;
                case 4:
                    str = zza.i(parcel, readInt);
                    break;
                case 5:
                    z = zza.c(parcel, readInt);
                    break;
                case 6:
                    zza.a(parcel, readInt, 4);
                    f = parcel.readFloat();
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new InterstitialAdParameterParcel(i, z3, z2, str, z, f);
    }
}
