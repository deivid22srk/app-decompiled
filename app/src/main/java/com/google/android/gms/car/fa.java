package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class fa implements Parcelable.Creator<CarFacet> {
    static void a(CarFacet carFacet, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, carFacet.f5402b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, carFacet.f5401a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, carFacet.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CarFacet[] newArray(int i) {
        return new CarFacet[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CarFacet createFromParcel(Parcel parcel) {
        int i = 0;
        int a2 = zza.a(parcel);
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zza.e(parcel, readInt);
                    break;
                case 2:
                    str = zza.i(parcel, readInt);
                    break;
                case 1000:
                    i2 = zza.e(parcel, readInt);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new CarFacet(i2, i, str);
    }
}
