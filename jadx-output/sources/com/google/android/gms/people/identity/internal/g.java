package com.google.android.gms.people.identity.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class g implements Parcelable.Creator<ParcelableGetOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ParcelableGetOptions createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public static ParcelableGetOptions a(Parcel parcel) {
        Bundle bundle = null;
        boolean z = false;
        int a2 = zza.a(parcel);
        String str = null;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    z3 = zza.c(parcel, readInt);
                    break;
                case 2:
                    z2 = zza.c(parcel, readInt);
                    break;
                case 3:
                    str = zza.i(parcel, readInt);
                    break;
                case 4:
                    z = zza.c(parcel, readInt);
                    break;
                case 5:
                    bundle = zza.k(parcel, readInt);
                    break;
                case 1000:
                    i = zza.e(parcel, readInt);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new ParcelableGetOptions(i, z3, z2, z, str, bundle);
    }

    static void a(ParcelableGetOptions parcelableGetOptions, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 1, parcelableGetOptions.f6401b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, parcelableGetOptions.f6400a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, parcelableGetOptions.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, parcelableGetOptions.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, parcelableGetOptions.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, parcelableGetOptions.f);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ParcelableGetOptions[] newArray(int i) {
        return new ParcelableGetOptions[i];
    }
}
