package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.CarMediaBrowserListNode;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class fj implements Parcelable.Creator<CarMediaBrowserListNode.CarMediaSong> {
    static void a(CarMediaBrowserListNode.CarMediaSong carMediaSong, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 1, carMediaSong.f5412b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, carMediaSong.f5411a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, carMediaSong.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, carMediaSong.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, carMediaSong.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CarMediaBrowserListNode.CarMediaSong[] newArray(int i) {
        return new CarMediaBrowserListNode.CarMediaSong[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CarMediaBrowserListNode.CarMediaSong createFromParcel(Parcel parcel) {
        String str = null;
        int a2 = zza.a(parcel);
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    str4 = zza.i(parcel, readInt);
                    break;
                case 2:
                    str3 = zza.i(parcel, readInt);
                    break;
                case 3:
                    str2 = zza.i(parcel, readInt);
                    break;
                case 4:
                    str = zza.i(parcel, readInt);
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
        return new CarMediaBrowserListNode.CarMediaSong(i, str4, str3, str2, str);
    }
}
