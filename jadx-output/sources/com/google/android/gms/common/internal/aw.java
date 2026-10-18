package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class aw implements Parcelable.Creator<ResolveAccountRequest> {
    static void a(ResolveAccountRequest resolveAccountRequest, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, resolveAccountRequest.f5688a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, resolveAccountRequest.f5689b, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 3, resolveAccountRequest.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, resolveAccountRequest.d, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ResolveAccountRequest[] newArray(int i) {
        return new ResolveAccountRequest[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ResolveAccountRequest createFromParcel(Parcel parcel) {
        int a2 = zza.a(parcel);
        int i = 0;
        Account account = null;
        int i2 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i2 = zza.e(parcel, readInt);
                    break;
                case 2:
                    account = (Account) zza.a(parcel, readInt, Account.CREATOR);
                    break;
                case 3:
                    i = zza.e(parcel, readInt);
                    break;
                case 4:
                    googleSignInAccount = (GoogleSignInAccount) zza.a(parcel, readInt, GoogleSignInAccount.CREATOR);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new ResolveAccountRequest(i2, account, i, googleSignInAccount);
    }
}
