package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class er implements Parcelable.Creator<TrafficIncident> {
    static void a(TrafficIncident trafficIncident, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, trafficIncident.f5449b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, trafficIncident.f5448a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, trafficIncident.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, trafficIncident.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, trafficIncident.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TrafficIncident[] newArray(int i) {
        return new TrafficIncident[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TrafficIncident createFromParcel(Parcel parcel) {
        double d = 0.0d;
        int i = 0;
        int a2 = zza.a(parcel);
        double d2 = 0.0d;
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
                    d2 = zza.h(parcel, readInt);
                    break;
                case 4:
                    d = zza.h(parcel, readInt);
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
        return new TrafficIncident(i3, i2, i, d2, d);
    }
}
