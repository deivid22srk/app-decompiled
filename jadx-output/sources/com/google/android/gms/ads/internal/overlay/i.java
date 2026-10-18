package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class i implements Parcelable.Creator<AdOverlayInfoParcel> {
    static void a(AdOverlayInfoParcel adOverlayInfoParcel, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, adOverlayInfoParcel.f5318a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, adOverlayInfoParcel.f5319b, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, com.google.android.gms.dynamic.d.a(adOverlayInfoParcel.c).asBinder());
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, com.google.android.gms.dynamic.d.a(adOverlayInfoParcel.d).asBinder());
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, com.google.android.gms.dynamic.d.a(adOverlayInfoParcel.e).asBinder());
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, com.google.android.gms.dynamic.d.a(adOverlayInfoParcel.f).asBinder());
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, adOverlayInfoParcel.g);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 8, adOverlayInfoParcel.h);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 9, adOverlayInfoParcel.i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 10, com.google.android.gms.dynamic.d.a(adOverlayInfoParcel.j).asBinder());
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 11, adOverlayInfoParcel.k);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 12, adOverlayInfoParcel.l);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 13, adOverlayInfoParcel.m);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 14, adOverlayInfoParcel.n, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 15, com.google.android.gms.dynamic.d.a(adOverlayInfoParcel.o).asBinder());
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 17, adOverlayInfoParcel.q, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 16, adOverlayInfoParcel.p);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AdOverlayInfoParcel[] newArray(int i) {
        return new AdOverlayInfoParcel[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AdOverlayInfoParcel createFromParcel(Parcel parcel) {
        int a2 = zza.a(parcel);
        int i = 0;
        AdLauncherIntentInfoParcel adLauncherIntentInfoParcel = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        boolean z = false;
        String str2 = null;
        IBinder iBinder5 = null;
        int i2 = 0;
        int i3 = 0;
        String str3 = null;
        VersionInfoParcel versionInfoParcel = null;
        IBinder iBinder6 = null;
        String str4 = null;
        InterstitialAdParameterParcel interstitialAdParameterParcel = null;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zza.e(parcel, readInt);
                    break;
                case 2:
                    adLauncherIntentInfoParcel = (AdLauncherIntentInfoParcel) zza.a(parcel, readInt, AdLauncherIntentInfoParcel.CREATOR);
                    break;
                case 3:
                    iBinder = zza.j(parcel, readInt);
                    break;
                case 4:
                    iBinder2 = zza.j(parcel, readInt);
                    break;
                case 5:
                    iBinder3 = zza.j(parcel, readInt);
                    break;
                case 6:
                    iBinder4 = zza.j(parcel, readInt);
                    break;
                case 7:
                    str = zza.i(parcel, readInt);
                    break;
                case 8:
                    z = zza.c(parcel, readInt);
                    break;
                case 9:
                    str2 = zza.i(parcel, readInt);
                    break;
                case 10:
                    iBinder5 = zza.j(parcel, readInt);
                    break;
                case 11:
                    i2 = zza.e(parcel, readInt);
                    break;
                case 12:
                    i3 = zza.e(parcel, readInt);
                    break;
                case 13:
                    str3 = zza.i(parcel, readInt);
                    break;
                case 14:
                    versionInfoParcel = (VersionInfoParcel) zza.a(parcel, readInt, VersionInfoParcel.CREATOR);
                    break;
                case 15:
                    iBinder6 = zza.j(parcel, readInt);
                    break;
                case 16:
                    str4 = zza.i(parcel, readInt);
                    break;
                case 17:
                    interstitialAdParameterParcel = (InterstitialAdParameterParcel) zza.a(parcel, readInt, InterstitialAdParameterParcel.CREATOR);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new AdOverlayInfoParcel(i, adLauncherIntentInfoParcel, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i2, i3, str3, versionInfoParcel, iBinder6, str4, interstitialAdParameterParcel);
    }
}
