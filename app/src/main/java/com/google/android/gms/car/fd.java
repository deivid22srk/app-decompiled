package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class fd implements Parcelable.Creator<CarInstrumentClusterInfo> {
    static void a(CarInstrumentClusterInfo carInstrumentClusterInfo, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, carInstrumentClusterInfo.f5408b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, carInstrumentClusterInfo.f5407a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, carInstrumentClusterInfo.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 3, carInstrumentClusterInfo.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 4, carInstrumentClusterInfo.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 5, carInstrumentClusterInfo.f);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CarInstrumentClusterInfo[] newArray(int i) {
        return new CarInstrumentClusterInfo[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CarInstrumentClusterInfo createFromParcel(Parcel parcel) {
        int i = 0;
        int a2 = zza.a(parcel);
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i5 = zza.e(parcel, readInt);
                    break;
                case 2:
                    i4 = zza.e(parcel, readInt);
                    break;
                case 3:
                    i3 = zza.e(parcel, readInt);
                    break;
                case 4:
                    i2 = zza.e(parcel, readInt);
                    break;
                case 5:
                    i = zza.e(parcel, readInt);
                    break;
                case 1000:
                    i6 = zza.e(parcel, readInt);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new CarInstrumentClusterInfo(i6, i5, i4, i3, i2, i);
    }
}
