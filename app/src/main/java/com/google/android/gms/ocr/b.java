package com.google.android.gms.ocr;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator<CreditCardOcrResult> {
    static void a(CreditCardOcrResult creditCardOcrResult, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, creditCardOcrResult.f6390a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, creditCardOcrResult.f6391b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 3, creditCardOcrResult.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 4, creditCardOcrResult.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 5, creditCardOcrResult.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, creditCardOcrResult.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, creditCardOcrResult.g);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 8, creditCardOcrResult.h);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 9, creditCardOcrResult.i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 10, creditCardOcrResult.j);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 11, creditCardOcrResult.k);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 12, creditCardOcrResult.l);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CreditCardOcrResult[] newArray(int i) {
        return new CreditCardOcrResult[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CreditCardOcrResult createFromParcel(Parcel parcel) {
        int a2 = zza.a(parcel);
        int i = 0;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        String str2 = null;
        String str3 = null;
        boolean z = false;
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
                    str = zza.i(parcel, readInt);
                    break;
                case 3:
                    i2 = zza.e(parcel, readInt);
                    break;
                case 4:
                    i3 = zza.e(parcel, readInt);
                    break;
                case 5:
                    i4 = zza.e(parcel, readInt);
                    break;
                case 6:
                    str2 = zza.i(parcel, readInt);
                    break;
                case 7:
                    str3 = zza.i(parcel, readInt);
                    break;
                case 8:
                    z = zza.c(parcel, readInt);
                    break;
                case 9:
                    str4 = zza.i(parcel, readInt);
                    break;
                case 10:
                    str5 = zza.i(parcel, readInt);
                    break;
                case 11:
                    str6 = zza.i(parcel, readInt);
                    break;
                case 12:
                    str7 = zza.i(parcel, readInt);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new CreditCardOcrResult(i, str, i2, i3, i4, str2, str3, z, str4, str5, str6, str7);
    }
}
