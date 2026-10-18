package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator<AuthAccountResult> {
    static void a(AuthAccountResult authAccountResult, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, authAccountResult.f6442a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, authAccountResult.f6443b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, authAccountResult.c, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AuthAccountResult[] newArray(int i) {
        return new AuthAccountResult[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AuthAccountResult createFromParcel(Parcel parcel) {
        int i = 0;
        int a2 = zza.a(parcel);
        Intent intent = null;
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
                    intent = (Intent) zza.a(parcel, readInt, Intent.CREATOR);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new AuthAccountResult(i2, i, intent);
    }
}
