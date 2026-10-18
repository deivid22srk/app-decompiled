package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class q implements Parcelable.Creator<EventParams> {
    static void a(EventParams eventParams, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, eventParams.f6281a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, eventParams.a());
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ EventParams[] newArray(int i) {
        return new EventParams[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ EventParams createFromParcel(Parcel parcel) {
        int a2 = zza.a(parcel);
        int i = 0;
        Bundle bundle = null;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zza.e(parcel, readInt);
                    break;
                case 2:
                    bundle = zza.k(parcel, readInt);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new EventParams(i, bundle);
    }
}
