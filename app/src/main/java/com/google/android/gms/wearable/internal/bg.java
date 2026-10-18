package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class bg implements Parcelable.Creator<PackageStorageInfo> {
    static void a(PackageStorageInfo packageStorageInfo, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, packageStorageInfo.f6566a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, packageStorageInfo.f6567b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, packageStorageInfo.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, packageStorageInfo.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PackageStorageInfo[] newArray(int i) {
        return new PackageStorageInfo[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PackageStorageInfo createFromParcel(Parcel parcel) {
        String str = null;
        int a2 = zza.a(parcel);
        int i = 0;
        long j = 0;
        String str2 = null;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zza.e(parcel, readInt);
                    break;
                case 2:
                    str2 = zza.i(parcel, readInt);
                    break;
                case 3:
                    str = zza.i(parcel, readInt);
                    break;
                case 4:
                    j = zza.f(parcel, readInt);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new PackageStorageInfo(i, str2, str, j);
    }
}
