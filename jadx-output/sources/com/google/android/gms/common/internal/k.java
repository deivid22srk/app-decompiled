package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class k implements Parcelable.Creator<GetServiceRequest> {
    static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, getServiceRequest.f5686a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, getServiceRequest.f5687b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 3, getServiceRequest.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, getServiceRequest.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, getServiceRequest.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, getServiceRequest.f, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, getServiceRequest.g);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 8, getServiceRequest.h, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GetServiceRequest[] newArray(int i) {
        return new GetServiceRequest[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GetServiceRequest createFromParcel(Parcel parcel) {
        int i = 0;
        Account account = null;
        int a2 = zza.a(parcel);
        Bundle bundle = null;
        Scope[] scopeArr = null;
        IBinder iBinder = null;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i3 = zza.e(parcel, readInt);
                    break;
                case 2:
                    i2 = zza.e(parcel, readInt);
                    break;
                case 3:
                    i = zza.e(parcel, readInt);
                    break;
                case 4:
                    str = zza.i(parcel, readInt);
                    break;
                case 5:
                    iBinder = zza.j(parcel, readInt);
                    break;
                case 6:
                    scopeArr = (Scope[]) zza.b(parcel, readInt, Scope.CREATOR);
                    break;
                case 7:
                    bundle = zza.k(parcel, readInt);
                    break;
                case 8:
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
        return new GetServiceRequest(i3, i2, i, str, iBinder, scopeArr, bundle, account);
    }
}
