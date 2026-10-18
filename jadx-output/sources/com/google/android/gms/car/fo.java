package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class fo implements Parcelable.Creator<CarUiInfo> {
    static void a(CarUiInfo carUiInfo, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 1, carUiInfo.f5430b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, carUiInfo.f5429a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, carUiInfo.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, carUiInfo.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, carUiInfo.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CarUiInfo[] newArray(int i) {
        return new CarUiInfo[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CarUiInfo createFromParcel(Parcel parcel) {
        boolean z = false;
        int a2 = zza.a(parcel);
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    z4 = zza.c(parcel, readInt);
                    break;
                case 2:
                    z3 = zza.c(parcel, readInt);
                    break;
                case 3:
                    z2 = zza.c(parcel, readInt);
                    break;
                case 4:
                    z = zza.c(parcel, readInt);
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
        return new CarUiInfo(i, z4, z3, z2, z);
    }
}
