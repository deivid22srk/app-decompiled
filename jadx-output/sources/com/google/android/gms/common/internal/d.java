package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class d implements Parcelable.Creator<ValidateAccountRequest> {
    static void a(ValidateAccountRequest validateAccountRequest, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, validateAccountRequest.f5692a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, validateAccountRequest.f5693b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, validateAccountRequest.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, validateAccountRequest.d, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, validateAccountRequest.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, validateAccountRequest.f);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ValidateAccountRequest[] newArray(int i) {
        return new ValidateAccountRequest[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ValidateAccountRequest createFromParcel(Parcel parcel) {
        int i = 0;
        String str = null;
        int a2 = zza.a(parcel);
        Bundle bundle = null;
        Scope[] scopeArr = null;
        IBinder iBinder = null;
        int i2 = 0;
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
                    iBinder = zza.j(parcel, readInt);
                    break;
                case 4:
                    scopeArr = (Scope[]) zza.b(parcel, readInt, Scope.CREATOR);
                    break;
                case 5:
                    bundle = zza.k(parcel, readInt);
                    break;
                case 6:
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
        return new ValidateAccountRequest(i2, i, iBinder, scopeArr, bundle, str);
    }
}
