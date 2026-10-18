package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class au implements Parcelable.Creator<ConnectionConfiguration> {
    static void a(ConnectionConfiguration connectionConfiguration, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, connectionConfiguration.f6458a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, connectionConfiguration.f6459b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, connectionConfiguration.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 4, connectionConfiguration.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 5, connectionConfiguration.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, connectionConfiguration.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, connectionConfiguration.g);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 8, connectionConfiguration.h);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 9, connectionConfiguration.i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 10, connectionConfiguration.j);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ConnectionConfiguration[] newArray(int i) {
        return new ConnectionConfiguration[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ConnectionConfiguration createFromParcel(Parcel parcel) {
        String str = null;
        boolean z = false;
        int a2 = zza.a(parcel);
        String str2 = null;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        int i2 = 0;
        String str3 = null;
        String str4 = null;
        int i3 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i3 = zza.e(parcel, readInt);
                    break;
                case 2:
                    str4 = zza.i(parcel, readInt);
                    break;
                case 3:
                    str3 = zza.i(parcel, readInt);
                    break;
                case 4:
                    i2 = zza.e(parcel, readInt);
                    break;
                case 5:
                    i = zza.e(parcel, readInt);
                    break;
                case 6:
                    z3 = zza.c(parcel, readInt);
                    break;
                case 7:
                    z2 = zza.c(parcel, readInt);
                    break;
                case 8:
                    str2 = zza.i(parcel, readInt);
                    break;
                case 9:
                    z = zza.c(parcel, readInt);
                    break;
                case 10:
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
        return new ConnectionConfiguration(i3, str4, str3, i2, i, z3, z2, str2, z, str);
    }
}
