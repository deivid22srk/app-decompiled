package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class i implements Parcelable.Creator<RecoveryWriteResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RecoveryWriteResponse createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public static RecoveryWriteResponse a(Parcel parcel) {
        int a2 = zza.a(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zza.e(parcel, readInt);
                    break;
                case 2:
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
        return new RecoveryWriteResponse(i, str);
    }

    static void a(RecoveryWriteResponse recoveryWriteResponse, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, recoveryWriteResponse.f5370a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, recoveryWriteResponse.f5371b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RecoveryWriteResponse[] newArray(int i) {
        return new RecoveryWriteResponse[i];
    }
}
