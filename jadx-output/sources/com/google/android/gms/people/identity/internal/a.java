package com.google.android.gms.people.identity.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator<AccountToken> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AccountToken createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public static AccountToken a(Parcel parcel) {
        String str = null;
        int a2 = zza.a(parcel);
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    str2 = zza.i(parcel, readInt);
                    break;
                case 2:
                    str = zza.i(parcel, readInt);
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
        return new AccountToken(i, str2, str);
    }

    static void a(AccountToken accountToken, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 1, accountToken.f6399b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, accountToken.f6398a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, accountToken.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AccountToken[] newArray(int i) {
        return new AccountToken[i];
    }
}
