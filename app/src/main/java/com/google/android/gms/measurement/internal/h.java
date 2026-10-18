package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class h implements Parcelable.Creator<AppMetadata> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AppMetadata createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public static AppMetadata a(Parcel parcel) {
        long j = 0;
        boolean z = false;
        String str = null;
        int a2 = zza.a(parcel);
        long j2 = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zza.e(parcel, readInt);
                    break;
                case 2:
                    str5 = zza.i(parcel, readInt);
                    break;
                case 3:
                    str4 = zza.i(parcel, readInt);
                    break;
                case 4:
                    str3 = zza.i(parcel, readInt);
                    break;
                case 5:
                    str2 = zza.i(parcel, readInt);
                    break;
                case 6:
                    j2 = zza.f(parcel, readInt);
                    break;
                case 7:
                    j = zza.f(parcel, readInt);
                    break;
                case 8:
                    str = zza.i(parcel, readInt);
                    break;
                case 9:
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
        return new AppMetadata(i, str5, str4, str3, str2, j2, j, str, z);
    }

    static void a(AppMetadata appMetadata, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, appMetadata.f6279a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, appMetadata.f6280b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, appMetadata.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, appMetadata.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, appMetadata.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, appMetadata.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, appMetadata.g);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 8, appMetadata.h);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 9, appMetadata.i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AppMetadata[] newArray(int i) {
        return new AppMetadata[i];
    }
}
