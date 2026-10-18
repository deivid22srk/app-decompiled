package com.google.android.gms.googlehelp.internal.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class ag implements Parcelable.Creator<TogglingData> {
    static void a(TogglingData togglingData, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, togglingData.f5824a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, togglingData.f5825b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, togglingData.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, togglingData.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TogglingData[] newArray(int i) {
        return new TogglingData[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TogglingData createFromParcel(Parcel parcel) {
        String str = null;
        int a2 = zza.a(parcel);
        String str2 = null;
        int i = 0;
        String str3 = null;
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
                    str3 = zza.i(parcel, readInt);
                    break;
                case 4:
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
        return new TogglingData(i, str2, str3, str);
    }
}
