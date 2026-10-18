package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g implements Parcelable.Creator<RecoveryReadResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RecoveryReadResponse createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public static RecoveryReadResponse a(Parcel parcel) {
        String str = null;
        int a2 = zza.a(parcel);
        int i = 0;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zza.e(parcel, readInt);
                    break;
                case 2:
                    str6 = zza.i(parcel, readInt);
                    break;
                case 3:
                    str5 = zza.i(parcel, readInt);
                    break;
                case 4:
                    str4 = zza.i(parcel, readInt);
                    break;
                case 5:
                    arrayList = zza.c(parcel, readInt, Country.CREATOR);
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
        return new RecoveryReadResponse(i, str6, str5, str4, arrayList, str3, str2, str);
    }

    static void a(RecoveryReadResponse recoveryReadResponse, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, recoveryReadResponse.f5366a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, recoveryReadResponse.f5367b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, recoveryReadResponse.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, recoveryReadResponse.d);
        com.google.android.gms.common.internal.safeparcel.a.c(parcel, 5, recoveryReadResponse.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, recoveryReadResponse.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, recoveryReadResponse.g);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 8, recoveryReadResponse.h);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RecoveryReadResponse[] newArray(int i) {
        return new RecoveryReadResponse[i];
    }
}
