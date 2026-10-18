package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class e implements Parcelable.Creator<LogOptions> {
    static void a(LogOptions logOptions, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, logOptions.f5802a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, logOptions.f5803b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, logOptions.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LogOptions[] newArray(int i) {
        return new LogOptions[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LogOptions createFromParcel(Parcel parcel) {
        boolean z = false;
        int a2 = zza.a(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zza.e(parcel, readInt);
                    break;
                case 2:
                    str = zza.i(parcel, readInt);
                    break;
                case 3:
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
        return new LogOptions(i, str, z);
    }
}
