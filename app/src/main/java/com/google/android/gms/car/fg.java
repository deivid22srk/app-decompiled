package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.CarMediaBrowserListNode;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class fg implements Parcelable.Creator<CarMediaBrowserSongNode> {
    static void a(CarMediaBrowserSongNode carMediaBrowserSongNode, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 1, carMediaBrowserSongNode.f5418b, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, carMediaBrowserSongNode.f5417a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, carMediaBrowserSongNode.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 3, carMediaBrowserSongNode.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CarMediaBrowserSongNode[] newArray(int i) {
        return new CarMediaBrowserSongNode[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CarMediaBrowserSongNode createFromParcel(Parcel parcel) {
        int a2 = zza.a(parcel);
        byte[] bArr = null;
        CarMediaBrowserListNode.CarMediaSong carMediaSong = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    carMediaSong = (CarMediaBrowserListNode.CarMediaSong) zza.a(parcel, readInt, CarMediaBrowserListNode.CarMediaSong.CREATOR);
                    break;
                case 2:
                    bArr = zza.l(parcel, readInt);
                    break;
                case 3:
                    i2 = zza.e(parcel, readInt);
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
        return new CarMediaBrowserSongNode(i, carMediaSong, bArr, i2);
    }
}
