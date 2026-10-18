package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator<ConnectionEvent> {
    static void a(ConnectionEvent connectionEvent, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, connectionEvent.f5773a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, connectionEvent.f5774b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, connectionEvent.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, connectionEvent.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, connectionEvent.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, connectionEvent.g);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 8, connectionEvent.h);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 10, connectionEvent.j);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 11, connectionEvent.k);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 12, connectionEvent.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 13, connectionEvent.i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ConnectionEvent[] newArray(int i) {
        return new ConnectionEvent[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ConnectionEvent createFromParcel(Parcel parcel) {
        int a2 = zza.a(parcel);
        int i = 0;
        long j = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        long j2 = 0;
        long j3 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zza.e(parcel, readInt);
                    break;
                case 2:
                    j = zza.f(parcel, readInt);
                    break;
                case 3:
                case 9:
                default:
                    zza.b(parcel, readInt);
                    break;
                case 4:
                    str = zza.i(parcel, readInt);
                    break;
                case 5:
                    str2 = zza.i(parcel, readInt);
                    break;
                case 6:
                    str3 = zza.i(parcel, readInt);
                    break;
                case 7:
                    str4 = zza.i(parcel, readInt);
                    break;
                case 8:
                    str5 = zza.i(parcel, readInt);
                    break;
                case 10:
                    j2 = zza.f(parcel, readInt);
                    break;
                case 11:
                    j3 = zza.f(parcel, readInt);
                    break;
                case 12:
                    i2 = zza.e(parcel, readInt);
                    break;
                case 13:
                    str6 = zza.i(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new ConnectionEvent(i, j, i2, str, str2, str3, str4, str5, str6, j2, j3);
    }
}
