package com.google.android.gms.car;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.CarCall;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class et implements Parcelable.Creator<CarCall.Details> {
    static void a(CarCall.Details details, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 1, details.f5400b, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, details.f5399a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, details.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, details.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, details.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, details.f, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, details.g, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CarCall.Details[] newArray(int i) {
        return new CarCall.Details[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CarCall.Details createFromParcel(Parcel parcel) {
        Uri uri = null;
        int a2 = zza.a(parcel);
        int i = 0;
        long j = 0;
        Uri uri2 = null;
        String str = null;
        String str2 = null;
        Uri uri3 = null;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    uri3 = (Uri) zza.a(parcel, readInt, Uri.CREATOR);
                    break;
                case 2:
                    str2 = zza.i(parcel, readInt);
                    break;
                case 3:
                    str = zza.i(parcel, readInt);
                    break;
                case 4:
                    j = zza.f(parcel, readInt);
                    break;
                case 5:
                    uri2 = (Uri) zza.a(parcel, readInt, Uri.CREATOR);
                    break;
                case 6:
                    uri = (Uri) zza.a(parcel, readInt, Uri.CREATOR);
                    break;
                case 1000:
                    i = zza.e(parcel, readInt);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new CarCall.Details(i, uri3, str2, str, j, uri2, uri);
    }
}
