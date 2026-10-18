package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.CarMediaBrowserRootNode;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class fk implements Parcelable.Creator<CarMediaBrowserRootNode.CarMediaSource> {
    static void a(CarMediaBrowserRootNode.CarMediaSource carMediaSource, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 1, carMediaSource.f5416b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, carMediaSource.f5415a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, carMediaSource.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, carMediaSource.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CarMediaBrowserRootNode.CarMediaSource[] newArray(int i) {
        return new CarMediaBrowserRootNode.CarMediaSource[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CarMediaBrowserRootNode.CarMediaSource createFromParcel(Parcel parcel) {
        byte[] bArr = null;
        int a2 = zza.a(parcel);
        String str = null;
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    str = zza.i(parcel, readInt);
                    break;
                case 2:
                    str2 = zza.i(parcel, readInt);
                    break;
                case 3:
                    bArr = zza.l(parcel, readInt);
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
        return new CarMediaBrowserRootNode.CarMediaSource(i, str, str2, bArr);
    }
}
