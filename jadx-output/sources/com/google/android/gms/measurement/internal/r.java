package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class r implements Parcelable.Creator<EventParcel> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ EventParcel createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public static EventParcel a(Parcel parcel) {
        String str = null;
        int a2 = zza.a(parcel);
        int i = 0;
        long j = 0;
        EventParams eventParams = null;
        String str2 = null;
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
                    eventParams = (EventParams) zza.a(parcel, readInt, EventParams.CREATOR);
                    break;
                case 4:
                    str = zza.i(parcel, readInt);
                    break;
                case 5:
                    j = zza.f(parcel, readInt);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new EventParcel(i, str2, eventParams, str, j);
    }

    static void a(EventParcel eventParcel, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, eventParcel.f6283a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, eventParcel.f6284b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, eventParcel.c, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, eventParcel.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, eventParcel.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ EventParcel[] newArray(int i) {
        return new EventParcel[i];
    }
}
