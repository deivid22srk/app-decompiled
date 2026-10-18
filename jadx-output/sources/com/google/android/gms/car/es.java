package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.CarCall;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class es implements Parcelable.Creator<CarCall> {
    static void a(CarCall carCall, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, carCall.f5398b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, carCall.f5397a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, carCall.c, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 3, carCall.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, carCall.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 5, carCall.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, carCall.g, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, carCall.h);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CarCall[] newArray(int i) {
        return new CarCall[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CarCall createFromParcel(Parcel parcel) {
        CarCall.Details details = null;
        boolean z = false;
        int a2 = zza.a(parcel);
        int i = 0;
        String str = null;
        ArrayList<String> arrayList = null;
        CarCall carCall = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i2 = zza.e(parcel, readInt);
                    break;
                case 2:
                    carCall = (CarCall) zza.a(parcel, readInt, CarCall.CREATOR);
                    break;
                case 3:
                    arrayList = zza.o(parcel, readInt);
                    break;
                case 4:
                    str = zza.i(parcel, readInt);
                    break;
                case 5:
                    i = zza.e(parcel, readInt);
                    break;
                case 6:
                    details = (CarCall.Details) zza.a(parcel, readInt, CarCall.Details.CREATOR);
                    break;
                case 7:
                    z = zza.c(parcel, readInt);
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
        return new CarCall(i3, i2, carCall, arrayList, str, i, details, z);
    }
}
