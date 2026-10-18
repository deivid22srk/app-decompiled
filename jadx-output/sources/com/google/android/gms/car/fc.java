package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class fc implements Parcelable.Creator<CarInfo> {
    static void a(CarInfo carInfo, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 1, carInfo.f5406b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, carInfo.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, carInfo.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, carInfo.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 5, carInfo.f);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 6, carInfo.g);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, carInfo.h);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 8, carInfo.i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 9, carInfo.j);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 10, carInfo.k);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 11, carInfo.l);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 12, carInfo.m);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 13, carInfo.n);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 14, carInfo.o);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 15, carInfo.p);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 16, carInfo.q);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, carInfo.f5405a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CarInfo[] newArray(int i) {
        return new CarInfo[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CarInfo createFromParcel(Parcel parcel) {
        int a2 = zza.a(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        String str9 = null;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    str = zza.i(parcel, readInt);
                    break;
                case 2:
                    str2 = zza.i(parcel, readInt);
                    break;
                case 3:
                    str3 = zza.i(parcel, readInt);
                    break;
                case 4:
                    str4 = zza.i(parcel, readInt);
                    break;
                case 5:
                    i2 = zza.e(parcel, readInt);
                    break;
                case 6:
                    i3 = zza.e(parcel, readInt);
                    break;
                case 7:
                    z = zza.c(parcel, readInt);
                    break;
                case 8:
                    i4 = zza.e(parcel, readInt);
                    break;
                case 9:
                    str5 = zza.i(parcel, readInt);
                    break;
                case 10:
                    str6 = zza.i(parcel, readInt);
                    break;
                case 11:
                    str7 = zza.i(parcel, readInt);
                    break;
                case 12:
                    str8 = zza.i(parcel, readInt);
                    break;
                case 13:
                    z2 = zza.c(parcel, readInt);
                    break;
                case 14:
                    z3 = zza.c(parcel, readInt);
                    break;
                case 15:
                    z4 = zza.c(parcel, readInt);
                    break;
                case 16:
                    str9 = zza.i(parcel, readInt);
                    break;
                case 1000:
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
        return new CarInfo(i, str, str2, str3, str4, i2, i3, z, i4, str5, str6, str7, str8, z2, z3, z4, str9);
    }
}
