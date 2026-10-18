package com.google.android.gms.people.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class j implements Parcelable.Creator<ParcelableLoadImageOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ParcelableLoadImageOptions createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public static ParcelableLoadImageOptions a(Parcel parcel) {
        boolean z = false;
        int a2 = zza.a(parcel);
        int i = 0;
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
        return new ParcelableLoadImageOptions(i3, i2, i, z);
    }

    static void a(ParcelableLoadImageOptions parcelableLoadImageOptions, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, parcelableLoadImageOptions.f6407b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, parcelableLoadImageOptions.f6406a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, parcelableLoadImageOptions.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, parcelableLoadImageOptions.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ParcelableLoadImageOptions[] newArray(int i) {
        return new ParcelableLoadImageOptions[i];
    }
}
