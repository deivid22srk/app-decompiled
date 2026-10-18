package com.google.android.gms.common.people.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator<AudienceMember> {
    static void a(AudienceMember audienceMember, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, audienceMember.f5769b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, audienceMember.f5768a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, audienceMember.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, audienceMember.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, audienceMember.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, audienceMember.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, audienceMember.g);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, audienceMember.h);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AudienceMember[] newArray(int i) {
        return new AudienceMember[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AudienceMember createFromParcel(Parcel parcel) {
        int i = 0;
        Bundle bundle = null;
        int a2 = zza.a(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i2 = 0;
        int i3 = 0;
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
                    str4 = zza.i(parcel, readInt);
                    break;
                case 4:
                    str3 = zza.i(parcel, readInt);
                    break;
                case 5:
                    str2 = zza.i(parcel, readInt);
                    break;
                case 6:
                    str = zza.i(parcel, readInt);
                    break;
                case 7:
                    bundle = zza.k(parcel, readInt);
                    break;
                case 1000:
                    i3 = zza.e(parcel, readInt);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new AudienceMember(i3, i2, i, str4, str3, str2, str, bundle);
    }
}
