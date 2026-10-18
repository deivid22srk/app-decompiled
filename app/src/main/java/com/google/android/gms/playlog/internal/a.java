package com.google.android.gms.playlog.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator<PlayLoggerContext> {
    static void a(PlayLoggerContext playLoggerContext, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, playLoggerContext.f6434a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, playLoggerContext.f6435b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 3, playLoggerContext.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 4, playLoggerContext.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, playLoggerContext.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, playLoggerContext.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, playLoggerContext.g);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 8, playLoggerContext.h);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 9, playLoggerContext.i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 10, playLoggerContext.j);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PlayLoggerContext[] newArray(int i) {
        return new PlayLoggerContext[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PlayLoggerContext createFromParcel(Parcel parcel) {
        String str = null;
        int i = 0;
        int a2 = zza.a(parcel);
        boolean z = true;
        boolean z2 = false;
        String str2 = null;
        String str3 = null;
        int i2 = 0;
        int i3 = 0;
        String str4 = null;
        int i4 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i4 = zza.e(parcel, readInt);
                    break;
                case 2:
                    str4 = zza.i(parcel, readInt);
                    break;
                case 3:
                    i3 = zza.e(parcel, readInt);
                    break;
                case 4:
                    i2 = zza.e(parcel, readInt);
                    break;
                case 5:
                    str3 = zza.i(parcel, readInt);
                    break;
                case 6:
                    str2 = zza.i(parcel, readInt);
                    break;
                case 7:
                    z = zza.c(parcel, readInt);
                    break;
                case 8:
                    str = zza.i(parcel, readInt);
                    break;
                case 9:
                    z2 = zza.c(parcel, readInt);
                    break;
                case 10:
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
        return new PlayLoggerContext(i4, str4, i3, i2, str3, str2, z, str, z2, i);
    }
}
