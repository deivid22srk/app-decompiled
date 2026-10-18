package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class f implements Parcelable.Creator<AuthAccountRequest> {
    static void a(AuthAccountRequest authAccountRequest, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, authAccountRequest.f5683a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, authAccountRequest.f5684b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, authAccountRequest.c, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AuthAccountRequest[] newArray(int i) {
        return new AuthAccountRequest[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AuthAccountRequest createFromParcel(Parcel parcel) {
        Scope[] scopeArr = null;
        int a2 = zza.a(parcel);
        int i = 0;
        IBinder iBinder = null;
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
                    scopeArr = (Scope[]) zza.b(parcel, readInt, Scope.CREATOR);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new AuthAccountRequest(i, iBinder, scopeArr);
    }
}
