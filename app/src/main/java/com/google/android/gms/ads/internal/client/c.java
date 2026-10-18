package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator<SearchAdRequestParcel> {
    static void a(SearchAdRequestParcel searchAdRequestParcel, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, searchAdRequestParcel.f5301a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, searchAdRequestParcel.f5302b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 3, searchAdRequestParcel.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 4, searchAdRequestParcel.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 5, searchAdRequestParcel.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 6, searchAdRequestParcel.f);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 7, searchAdRequestParcel.g);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 8, searchAdRequestParcel.h);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 9, searchAdRequestParcel.i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 10, searchAdRequestParcel.j);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 11, searchAdRequestParcel.k);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 12, searchAdRequestParcel.l);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 13, searchAdRequestParcel.m);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 14, searchAdRequestParcel.n);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 15, searchAdRequestParcel.o);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SearchAdRequestParcel[] newArray(int i) {
        return new SearchAdRequestParcel[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SearchAdRequestParcel createFromParcel(Parcel parcel) {
        int a2 = zza.a(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        String str = null;
        int i10 = 0;
        String str2 = null;
        int i11 = 0;
        int i12 = 0;
        String str3 = null;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zza.e(parcel, readInt);
                    break;
                case 2:
                    i2 = zza.e(parcel, readInt);
                    break;
                case 3:
                    i3 = zza.e(parcel, readInt);
                    break;
                case 4:
                    i4 = zza.e(parcel, readInt);
                    break;
                case 5:
                    i5 = zza.e(parcel, readInt);
                    break;
                case 6:
                    i6 = zza.e(parcel, readInt);
                    break;
                case 7:
                    i7 = zza.e(parcel, readInt);
                    break;
                case 8:
                    i8 = zza.e(parcel, readInt);
                    break;
                case 9:
                    i9 = zza.e(parcel, readInt);
                    break;
                case 10:
                    str = zza.i(parcel, readInt);
                    break;
                case 11:
                    i10 = zza.e(parcel, readInt);
                    break;
                case 12:
                    str2 = zza.i(parcel, readInt);
                    break;
                case 13:
                    i11 = zza.e(parcel, readInt);
                    break;
                case 14:
                    i12 = zza.e(parcel, readInt);
                    break;
                case 15:
                    str3 = zza.i(parcel, readInt);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new SearchAdRequestParcel(i, i2, i3, i4, i5, i6, i7, i8, i9, str, i10, str2, i11, i12, str3);
    }
}
