package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class ae implements Parcelable.Creator<Status> {
    static void a(Status status, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, status.g);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, status.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, status.h);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, status.i, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status[] newArray(int i) {
        return new Status[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status createFromParcel(Parcel parcel) {
        PendingIntent pendingIntent = null;
        int a2 = zza.a(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
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
                    pendingIntent = (PendingIntent) zza.a(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 1000:
                    i2 = zza.e(parcel, readInt);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new Status(i2, i, str, pendingIntent);
    }
}
