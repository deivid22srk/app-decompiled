package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class h implements Parcelable.Creator<AdSizeParcel> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AdSizeParcel createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public static AdSizeParcel a(Parcel parcel) {
        AdSizeParcel[] adSizeParcelArr = null;
        boolean z = false;
        int a2 = zza.a(parcel);
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        int i2 = 0;
        boolean z4 = false;
        int i3 = 0;
        int i4 = 0;
        String str = null;
        int i5 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i5 = zza.e(parcel, readInt);
                    break;
                case 2:
                    str = zza.i(parcel, readInt);
                    break;
                case 3:
                    i4 = zza.e(parcel, readInt);
                    break;
                case 4:
                    i3 = zza.e(parcel, readInt);
                    break;
                case 5:
                    z4 = zza.c(parcel, readInt);
                    break;
                case 6:
                    i2 = zza.e(parcel, readInt);
                    break;
                case 7:
                    i = zza.e(parcel, readInt);
                    break;
                case 8:
                    adSizeParcelArr = (AdSizeParcel[]) zza.b(parcel, readInt, AdSizeParcel.CREATOR);
                    break;
                case 9:
                    z3 = zza.c(parcel, readInt);
                    break;
                case 10:
                    z2 = zza.c(parcel, readInt);
                    break;
                case 11:
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
        return new AdSizeParcel(i5, str, i4, i3, z4, i2, i, adSizeParcelArr, z3, z2, z);
    }

    static void a(AdSizeParcel adSizeParcel, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, adSizeParcel.f5299a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, adSizeParcel.f5300b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 3, adSizeParcel.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 4, adSizeParcel.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, adSizeParcel.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 6, adSizeParcel.f);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 7, adSizeParcel.g);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 8, adSizeParcel.h, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 9, adSizeParcel.i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 10, adSizeParcel.j);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 11, adSizeParcel.k);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AdSizeParcel[] newArray(int i) {
        return new AdSizeParcel[i];
    }
}
