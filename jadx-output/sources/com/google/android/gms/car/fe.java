package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.CarMediaBrowserListNode;
import com.google.android.gms.car.CarMediaBrowserSourceNode;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class fe implements Parcelable.Creator<CarMediaBrowserListNode> {
    static void a(CarMediaBrowserListNode carMediaBrowserListNode, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 1, carMediaBrowserListNode.f5410b, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, carMediaBrowserListNode.f5409a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, carMediaBrowserListNode.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 3, carMediaBrowserListNode.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, carMediaBrowserListNode.e, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CarMediaBrowserListNode[] newArray(int i) {
        return new CarMediaBrowserListNode[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CarMediaBrowserListNode createFromParcel(Parcel parcel) {
        CarMediaBrowserListNode.CarMediaSong[] carMediaSongArr = null;
        int i = 0;
        int a2 = zza.a(parcel);
        int i2 = 0;
        CarMediaBrowserSourceNode.CarMediaList carMediaList = null;
        int i3 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    carMediaList = (CarMediaBrowserSourceNode.CarMediaList) zza.a(parcel, readInt, CarMediaBrowserSourceNode.CarMediaList.CREATOR);
                    break;
                case 2:
                    i2 = zza.e(parcel, readInt);
                    break;
                case 3:
                    i = zza.e(parcel, readInt);
                    break;
                case 4:
                    carMediaSongArr = (CarMediaBrowserListNode.CarMediaSong[]) zza.b(parcel, readInt, CarMediaBrowserListNode.CarMediaSong.CREATOR);
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
        return new CarMediaBrowserListNode(i3, carMediaList, i2, i, carMediaSongArr);
    }
}
