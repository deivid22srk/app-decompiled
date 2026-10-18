package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class cs implements Parcelable.Creator<AncsNotificationParcelable> {
    static void a(AncsNotificationParcelable ancsNotificationParcelable, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, ancsNotificationParcelable.f6496a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, ancsNotificationParcelable.f6497b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, ancsNotificationParcelable.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, ancsNotificationParcelable.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, ancsNotificationParcelable.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, ancsNotificationParcelable.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, ancsNotificationParcelable.g);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 8, ancsNotificationParcelable.h == null ? ancsNotificationParcelable.c : ancsNotificationParcelable.h);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 9, ancsNotificationParcelable.i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 10, ancsNotificationParcelable.j);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 11, ancsNotificationParcelable.k);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 12, ancsNotificationParcelable.l);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AncsNotificationParcelable[] newArray(int i) {
        return new AncsNotificationParcelable[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AncsNotificationParcelable createFromParcel(Parcel parcel) {
        int a2 = zza.a(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zza.e(parcel, readInt);
                    break;
                case 2:
                    i2 = zza.e(parcel, readInt);
                    break;
                case 3:
                    str = zza.i(parcel, readInt);
                    break;
                case 4:
                    str2 = zza.i(parcel, readInt);
                    break;
                case 5:
                    str3 = zza.i(parcel, readInt);
                    break;
                case 6:
                    str4 = zza.i(parcel, readInt);
                    break;
                case 7:
                    str5 = zza.i(parcel, readInt);
                    break;
                case 8:
                    str6 = zza.i(parcel, readInt);
                    break;
                case 9:
                    b2 = zza.d(parcel, readInt);
                    break;
                case 10:
                    b3 = zza.d(parcel, readInt);
                    break;
                case 11:
                    b4 = zza.d(parcel, readInt);
                    break;
                case 12:
                    b5 = zza.d(parcel, readInt);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new AncsNotificationParcelable(i, i2, str, str2, str3, str4, str5, str6, b2, b3, b4, b5);
    }
}
