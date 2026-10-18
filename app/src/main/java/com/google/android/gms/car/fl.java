package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.CarPhoneStatus;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class fl implements Parcelable.Creator<CarPhoneStatus.CarCall> {
    static void a(CarPhoneStatus.CarCall carCall, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, carCall.f5426b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, carCall.f5425a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, carCall.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, carCall.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, carCall.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, carCall.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, carCall.g);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CarPhoneStatus.CarCall[] newArray(int i) {
        return new CarPhoneStatus.CarCall[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CarPhoneStatus.CarCall createFromParcel(Parcel parcel) {
        int i = 0;
        byte[] bArr = null;
        int a2 = zza.a(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
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
                    str3 = zza.i(parcel, readInt);
                    break;
                case 4:
                    str2 = zza.i(parcel, readInt);
                    break;
                case 5:
                    str = zza.i(parcel, readInt);
                    break;
                case 6:
                    bArr = zza.l(parcel, readInt);
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
        return new CarPhoneStatus.CarCall(i3, i2, i, str3, str2, str, bArr);
    }
}
