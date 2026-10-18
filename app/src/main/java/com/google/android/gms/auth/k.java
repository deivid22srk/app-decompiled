package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class k implements Parcelable.Creator<AccountChangeEventsRequest> {
    static void a(AccountChangeEventsRequest accountChangeEventsRequest, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, accountChangeEventsRequest.f5357a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, accountChangeEventsRequest.f5358b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, accountChangeEventsRequest.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, accountChangeEventsRequest.d, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AccountChangeEventsRequest[] newArray(int i) {
        return new AccountChangeEventsRequest[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AccountChangeEventsRequest createFromParcel(Parcel parcel) {
        Account account = null;
        int a2 = zza.a(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i2 = zza.e(parcel, readInt);
                    break;
                case 2:
                    i = zza.e(parcel, readInt);
                    break;
                case 3:
                    str = zza.i(parcel, readInt);
                    break;
                case 4:
                    account = (Account) zza.a(parcel, readInt, Account.CREATOR);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new AccountChangeEventsRequest(i2, i, str, account);
    }
}
