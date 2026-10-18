package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class j implements Parcelable.Creator<AccountChangeEvent> {
    static void a(AccountChangeEvent accountChangeEvent, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, accountChangeEvent.f5355a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, accountChangeEvent.f5356b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, accountChangeEvent.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 4, accountChangeEvent.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 5, accountChangeEvent.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, accountChangeEvent.f);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AccountChangeEvent[] newArray(int i) {
        return new AccountChangeEvent[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AccountChangeEvent createFromParcel(Parcel parcel) {
        String str = null;
        int i = 0;
        int a2 = zza.a(parcel);
        long j = 0;
        int i2 = 0;
        String str2 = null;
        int i3 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i3 = zza.e(parcel, readInt);
                    break;
                case 2:
                    j = zza.f(parcel, readInt);
                    break;
                case 3:
                    str2 = zza.i(parcel, readInt);
                    break;
                case 4:
                    i2 = zza.e(parcel, readInt);
                    break;
                case 5:
                    i = zza.e(parcel, readInt);
                    break;
                case 6:
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
        return new AccountChangeEvent(i3, j, str2, i2, i, str);
    }
}
