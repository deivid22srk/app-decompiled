package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator<VersionInfoParcel> {
    static void a(VersionInfoParcel versionInfoParcel, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, versionInfoParcel.f5351a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, versionInfoParcel.f5352b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 3, versionInfoParcel.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 4, versionInfoParcel.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, versionInfoParcel.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ VersionInfoParcel[] newArray(int i) {
        return new VersionInfoParcel[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ VersionInfoParcel createFromParcel(Parcel parcel) {
        boolean z = false;
        int a2 = zza.a(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i3 = zza.e(parcel, readInt);
                    break;
                case 2:
                    str = zza.i(parcel, readInt);
                    break;
                case 3:
                    i2 = zza.e(parcel, readInt);
                    break;
                case 4:
                    i = zza.e(parcel, readInt);
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
        return new VersionInfoParcel(i3, str, i2, i, z);
    }
}
