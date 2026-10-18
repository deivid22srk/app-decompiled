package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class f implements Parcelable.Creator<UserAttributeParcel> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ UserAttributeParcel createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public static UserAttributeParcel a(Parcel parcel) {
        int a2 = zza.a(parcel);
        int i = 0;
        long j = 0;
        String str = null;
        String str2 = null;
        Float f = null;
        Long l = null;
        String str3 = null;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zza.e(parcel, readInt);
                    break;
                case 2:
                    str3 = zza.i(parcel, readInt);
                    break;
                case 3:
                    j = zza.f(parcel, readInt);
                    break;
                case 4:
                    l = zza.g(parcel, readInt);
                    break;
                case 5:
                    int a3 = zza.a(parcel, readInt);
                    if (a3 != 0) {
                        zza.b(parcel, a3, 4);
                        f = Float.valueOf(parcel.readFloat());
                        break;
                    } else {
                        f = null;
                        break;
                    }
                case 6:
                    str2 = zza.i(parcel, readInt);
                    break;
                case 7:
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
        return new UserAttributeParcel(i, str3, j, l, f, str2, str);
    }

    static void a(UserAttributeParcel userAttributeParcel, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, userAttributeParcel.f6285a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, userAttributeParcel.f6286b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, userAttributeParcel.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, userAttributeParcel.d);
        Float f = userAttributeParcel.e;
        if (f != null) {
            com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, 4);
            parcel.writeFloat(f.floatValue());
        }
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, userAttributeParcel.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, userAttributeParcel.g);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ UserAttributeParcel[] newArray(int i) {
        return new UserAttributeParcel[i];
    }
}
