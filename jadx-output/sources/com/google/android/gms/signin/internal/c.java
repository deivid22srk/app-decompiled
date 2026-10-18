package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator<CheckServerAuthResult> {
    static void a(CheckServerAuthResult checkServerAuthResult, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, checkServerAuthResult.f6444a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, checkServerAuthResult.f6445b);
        com.google.android.gms.common.internal.safeparcel.a.c(parcel, 3, checkServerAuthResult.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CheckServerAuthResult[] newArray(int i) {
        return new CheckServerAuthResult[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CheckServerAuthResult createFromParcel(Parcel parcel) {
        boolean z = false;
        int a2 = zza.a(parcel);
        ArrayList arrayList = null;
        int i = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zza.e(parcel, readInt);
                    break;
                case 2:
                    z = zza.c(parcel, readInt);
                    break;
                case 3:
                    arrayList = zza.c(parcel, readInt, Scope.CREATOR);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new CheckServerAuthResult(i, z, arrayList);
    }
}
