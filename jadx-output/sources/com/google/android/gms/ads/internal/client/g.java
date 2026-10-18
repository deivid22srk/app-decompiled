package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g implements Parcelable.Creator<AdRequestParcel> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AdRequestParcel createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public static AdRequestParcel a(Parcel parcel) {
        int a2 = zza.a(parcel);
        int i = 0;
        long j = 0;
        Bundle bundle = null;
        int i2 = 0;
        ArrayList<String> arrayList = null;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        String str = null;
        SearchAdRequestParcel searchAdRequestParcel = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        String str4 = null;
        boolean z3 = false;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zza.e(parcel, readInt);
                    break;
                case 2:
                    j = zza.f(parcel, readInt);
                    break;
                case 3:
                    bundle = zza.k(parcel, readInt);
                    break;
                case 4:
                    i2 = zza.e(parcel, readInt);
                    break;
                case 5:
                    arrayList = zza.o(parcel, readInt);
                    break;
                case 6:
                    z = zza.c(parcel, readInt);
                    break;
                case 7:
                    i3 = zza.e(parcel, readInt);
                    break;
                case 8:
                    z2 = zza.c(parcel, readInt);
                    break;
                case 9:
                    str = zza.i(parcel, readInt);
                    break;
                case 10:
                    searchAdRequestParcel = (SearchAdRequestParcel) zza.a(parcel, readInt, SearchAdRequestParcel.CREATOR);
                    break;
                case 11:
                    location = (Location) zza.a(parcel, readInt, Location.CREATOR);
                    break;
                case 12:
                    str2 = zza.i(parcel, readInt);
                    break;
                case 13:
                    bundle2 = zza.k(parcel, readInt);
                    break;
                case 14:
                    bundle3 = zza.k(parcel, readInt);
                    break;
                case 15:
                    arrayList2 = zza.o(parcel, readInt);
                    break;
                case 16:
                    str3 = zza.i(parcel, readInt);
                    break;
                case 17:
                    str4 = zza.i(parcel, readInt);
                    break;
                case 18:
                    z3 = zza.c(parcel, readInt);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new AdRequestParcel(i, j, bundle, i2, arrayList, z, i3, z2, str, searchAdRequestParcel, location, str2, bundle2, bundle3, arrayList2, str3, str4, z3);
    }

    static void a(AdRequestParcel adRequestParcel, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, adRequestParcel.f5297a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, adRequestParcel.f5298b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, adRequestParcel.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 4, adRequestParcel.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 5, adRequestParcel.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, adRequestParcel.f);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 7, adRequestParcel.g);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 8, adRequestParcel.h);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 9, adRequestParcel.i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 10, adRequestParcel.j, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 11, adRequestParcel.k, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 12, adRequestParcel.l);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 13, adRequestParcel.m);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 14, adRequestParcel.n);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 15, adRequestParcel.o);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 17, adRequestParcel.q);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 16, adRequestParcel.p);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 18, adRequestParcel.r);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AdRequestParcel[] newArray(int i) {
        return new AdRequestParcel[i];
    }
}
