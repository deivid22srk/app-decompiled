package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class fb implements Parcelable.Creator<CarFrxEvent> {
    static void a(CarFrxEvent carFrxEvent, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, carFrxEvent.f5404b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, carFrxEvent.f5403a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, carFrxEvent.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 3, carFrxEvent.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CarFrxEvent[] newArray(int i) {
        return new CarFrxEvent[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CarFrxEvent createFromParcel(Parcel parcel) {
        int i = 0;
        int a2 = zza.a(parcel);
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i3 = zza.e(parcel, readInt);
                    break;
                case 2:
                    i2 = zza.e(parcel, readInt);
                    break;
                case 3:
                    i = zza.e(parcel, readInt);
                    break;
                case 1000:
                    i4 = zza.e(parcel, readInt);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new CarFrxEvent(i4, i3, i2, i);
    }
}
