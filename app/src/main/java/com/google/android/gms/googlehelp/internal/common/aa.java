package com.google.android.gms.googlehelp.internal.common;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class aa implements Parcelable.Creator<OverflowMenuItem> {
    static void a(OverflowMenuItem overflowMenuItem, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, overflowMenuItem.f5822a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, overflowMenuItem.f5823b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, overflowMenuItem.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, overflowMenuItem.d, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ OverflowMenuItem[] newArray(int i) {
        return new OverflowMenuItem[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ OverflowMenuItem createFromParcel(Parcel parcel) {
        Intent intent = null;
        int a2 = zza.a(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i2 = zza.e(parcel, readInt);
                    break;
                case 2:
                    i = zza.e(parcel, readInt);
                    break;
                case 3:
                    str = zza.i(parcel, readInt);
                    break;
                case 4:
                    intent = (Intent) zza.a(parcel, readInt, Intent.CREATOR);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new OverflowMenuItem(i2, i, str, intent);
    }
}
