package com.google.android.gms.ads.internal.formats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator<NativeAdOptionsParcel> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ NativeAdOptionsParcel createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public static NativeAdOptionsParcel a(Parcel parcel) {
        boolean z = false;
        int a2 = zza.a(parcel);
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i2 = zza.e(parcel, readInt);
                    break;
                case 2:
                    z2 = zza.c(parcel, readInt);
                    break;
                case 3:
                    i = zza.e(parcel, readInt);
                    break;
                case 4:
                    z = zza.c(parcel, readInt);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new NativeAdOptionsParcel(i2, z2, i, z);
    }

    static void a(NativeAdOptionsParcel nativeAdOptionsParcel, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, nativeAdOptionsParcel.f5314a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, nativeAdOptionsParcel.f5315b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 3, nativeAdOptionsParcel.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, nativeAdOptionsParcel.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ NativeAdOptionsParcel[] newArray(int i) {
        return new NativeAdOptionsParcel[i];
    }
}
