package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class h implements Parcelable.Creator<RecoveryWriteRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RecoveryWriteRequest createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public static RecoveryWriteRequest a(Parcel parcel) {
        boolean z = false;
        String str = null;
        int a2 = zza.a(parcel);
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zza.e(parcel, readInt);
                    break;
                case 2:
                    str4 = zza.i(parcel, readInt);
                    break;
                case 3:
                    str3 = zza.i(parcel, readInt);
                    break;
                case 4:
                    str2 = zza.i(parcel, readInt);
                    break;
                case 5:
                    str = zza.i(parcel, readInt);
                    break;
                case 6:
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
        return new RecoveryWriteRequest(i, str4, str3, str2, str, z);
    }

    static void a(RecoveryWriteRequest recoveryWriteRequest, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, recoveryWriteRequest.f5368a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, recoveryWriteRequest.f5369b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, recoveryWriteRequest.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, recoveryWriteRequest.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, recoveryWriteRequest.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, recoveryWriteRequest.f);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RecoveryWriteRequest[] newArray(int i) {
        return new RecoveryWriteRequest[i];
    }
}
