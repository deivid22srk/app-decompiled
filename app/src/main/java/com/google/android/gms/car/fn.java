package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class fn implements Parcelable.Creator<CarSensorEvent> {
    static void a(CarSensorEvent carSensorEvent, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, carSensorEvent.f5428b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, carSensorEvent.f5427a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, carSensorEvent.c);
        float[] fArr = carSensorEvent.d;
        if (fArr != null) {
            int a3 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3);
            parcel.writeFloatArray(fArr);
            com.google.android.gms.common.internal.safeparcel.a.b(parcel, a3);
        }
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, carSensorEvent.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CarSensorEvent[] newArray(int i) {
        return new CarSensorEvent[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CarSensorEvent createFromParcel(Parcel parcel) {
        int i = 0;
        int a2 = zza.a(parcel);
        long j = 0;
        byte[] bArr = null;
        float[] fArr = null;
        int i2 = 0;
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
                    int a3 = zza.a(parcel, readInt);
                    int dataPosition = parcel.dataPosition();
                    if (a3 != 0) {
                        fArr = parcel.createFloatArray();
                        parcel.setDataPosition(a3 + dataPosition);
                        break;
                    } else {
                        fArr = null;
                        break;
                    }
                case 4:
                    bArr = zza.l(parcel, readInt);
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
        return new CarSensorEvent(i2, i, j, fArr, bArr);
    }
}
