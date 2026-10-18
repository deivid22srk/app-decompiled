package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class ax implements Parcelable.Creator<ResolveAccountResponse> {
    static void a(ResolveAccountResponse resolveAccountResponse, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, resolveAccountResponse.f5690a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, resolveAccountResponse.f5691b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, resolveAccountResponse.c, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, resolveAccountResponse.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, resolveAccountResponse.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ResolveAccountResponse[] newArray(int i) {
        return new ResolveAccountResponse[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ResolveAccountResponse createFromParcel(Parcel parcel) {
        ConnectionResult connectionResult = null;
        boolean z = false;
        int a2 = zza.a(parcel);
        boolean z2 = false;
        IBinder iBinder = null;
        int i = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zza.e(parcel, readInt);
                    break;
                case 2:
                    iBinder = zza.j(parcel, readInt);
                    break;
                case 3:
                    connectionResult = (ConnectionResult) zza.a(parcel, readInt, ConnectionResult.CREATOR);
                    break;
                case 4:
                    z2 = zza.c(parcel, readInt);
                    break;
                case 5:
                    z = zza.c(parcel, readInt);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new ResolveAccountResponse(i, iBinder, connectionResult, z2, z);
    }
}
