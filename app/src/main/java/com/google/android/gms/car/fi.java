package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.CarMediaBrowserSourceNode;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class fi implements Parcelable.Creator<CarMediaBrowserSourceNode.CarMediaList> {
    static void a(CarMediaBrowserSourceNode.CarMediaList carMediaList, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 1, carMediaList.f5422b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, carMediaList.f5421a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, carMediaList.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, carMediaList.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 4, carMediaList.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CarMediaBrowserSourceNode.CarMediaList[] newArray(int i) {
        return new CarMediaBrowserSourceNode.CarMediaList[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CarMediaBrowserSourceNode.CarMediaList createFromParcel(Parcel parcel) {
        int i = 0;
        byte[] bArr = null;
        int a2 = zza.a(parcel);
        String str = null;
        String str2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    str2 = zza.i(parcel, readInt);
                    break;
                case 2:
                    str = zza.i(parcel, readInt);
                    break;
                case 3:
                    bArr = zza.l(parcel, readInt);
                    break;
                case 4:
                    i = zza.e(parcel, readInt);
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
        return new CarMediaBrowserSourceNode.CarMediaList(i2, str2, str, bArr, i);
    }
}
