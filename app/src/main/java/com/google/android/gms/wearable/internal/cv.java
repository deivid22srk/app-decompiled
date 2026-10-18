package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class cv implements Parcelable.Creator<CapabilityInfoParcelable> {
    static void a(CapabilityInfoParcelable capabilityInfoParcelable, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, capabilityInfoParcelable.f6498a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, capabilityInfoParcelable.f6499b);
        com.google.android.gms.common.internal.safeparcel.a.c(parcel, 3, capabilityInfoParcelable.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CapabilityInfoParcelable[] newArray(int i) {
        return new CapabilityInfoParcelable[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CapabilityInfoParcelable createFromParcel(Parcel parcel) {
        ArrayList arrayList = null;
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
                case 3:
                    arrayList = zza.c(parcel, readInt, NodeParcelable.CREATOR);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new CapabilityInfoParcelable(i, str, arrayList);
    }
}
