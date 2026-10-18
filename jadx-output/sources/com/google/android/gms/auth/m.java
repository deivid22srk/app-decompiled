package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m implements Parcelable.Creator<TokenData> {
    static void a(TokenData tokenData, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, tokenData.f5372a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, tokenData.f5373b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, tokenData.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, tokenData.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, tokenData.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 6, tokenData.f);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TokenData[] newArray(int i) {
        return new TokenData[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TokenData createFromParcel(Parcel parcel) {
        ArrayList<String> arrayList = null;
        boolean z = false;
        int a2 = zza.a(parcel);
        boolean z2 = false;
        Long l = null;
        String str = null;
        int i = 0;
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
                    l = zza.g(parcel, readInt);
                    break;
                case 4:
                    z2 = zza.c(parcel, readInt);
                    break;
                case 5:
                    z = zza.c(parcel, readInt);
                    break;
                case 6:
                    arrayList = zza.o(parcel, readInt);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new TokenData(i, str, l, z2, z, arrayList);
    }
}
