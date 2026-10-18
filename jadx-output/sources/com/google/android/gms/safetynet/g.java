package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class g implements Parcelable.Creator<AttestationData> {
    static void a(AttestationData attestationData, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, attestationData.f6436a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, attestationData.f6437b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AttestationData[] newArray(int i) {
        return new AttestationData[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AttestationData createFromParcel(Parcel parcel) {
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
        return new AttestationData(i, str);
    }
}
