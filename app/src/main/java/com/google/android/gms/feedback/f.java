package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class f implements Parcelable.Creator<ThemeSettings> {
    static void a(ThemeSettings themeSettings, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, themeSettings.f5804a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, themeSettings.f5805b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 3, themeSettings.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ThemeSettings[] newArray(int i) {
        return new ThemeSettings[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ThemeSettings createFromParcel(Parcel parcel) {
        int i = 0;
        int a2 = zza.a(parcel);
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i3 = zza.e(parcel, readInt);
                    break;
                case 2:
                    i2 = zza.e(parcel, readInt);
                    break;
                case 3:
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
        return new ThemeSettings(i3, i2, i);
    }
}
