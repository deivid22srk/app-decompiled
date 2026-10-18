package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class l implements Parcelable.Creator<RecordConsentRequest> {
    static void a(RecordConsentRequest recordConsentRequest, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, recordConsentRequest.f6446a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, recordConsentRequest.f6447b, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, recordConsentRequest.c, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, recordConsentRequest.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RecordConsentRequest[] newArray(int i) {
        return new RecordConsentRequest[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RecordConsentRequest createFromParcel(Parcel parcel) {
        int a2 = zza.a(parcel);
        Scope[] scopeArr = null;
        Account account = null;
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zza.e(parcel, readInt);
                    break;
                case 2:
                    account = (Account) zza.a(parcel, readInt, Account.CREATOR);
                    break;
                case 3:
                    scopeArr = (Scope[]) zza.b(parcel, readInt, Scope.CREATOR);
                    break;
                case 4:
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
        return new RecordConsentRequest(i, account, scopeArr, str);
    }
}
