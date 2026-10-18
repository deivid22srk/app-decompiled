package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.CarMediaBrowserRootNode;
import com.google.android.gms.car.CarMediaBrowserSourceNode;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class fh implements Parcelable.Creator<CarMediaBrowserSourceNode> {
    static void a(CarMediaBrowserSourceNode carMediaBrowserSourceNode, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 1, carMediaBrowserSourceNode.f5420b, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, carMediaBrowserSourceNode.f5419a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, carMediaBrowserSourceNode.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 3, carMediaBrowserSourceNode.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, carMediaBrowserSourceNode.e, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CarMediaBrowserSourceNode[] newArray(int i) {
        return new CarMediaBrowserSourceNode[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CarMediaBrowserSourceNode createFromParcel(Parcel parcel) {
        CarMediaBrowserSourceNode.CarMediaList[] carMediaListArr = null;
        int i = 0;
        int a2 = zza.a(parcel);
        int i2 = 0;
        CarMediaBrowserRootNode.CarMediaSource carMediaSource = null;
        int i3 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    carMediaSource = (CarMediaBrowserRootNode.CarMediaSource) zza.a(parcel, readInt, CarMediaBrowserRootNode.CarMediaSource.CREATOR);
                    break;
                case 2:
                    i2 = zza.e(parcel, readInt);
                    break;
                case 3:
                    i = zza.e(parcel, readInt);
                    break;
                case 4:
                    carMediaListArr = (CarMediaBrowserSourceNode.CarMediaList[]) zza.b(parcel, readInt, CarMediaBrowserSourceNode.CarMediaList.CREATOR);
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
        return new CarMediaBrowserSourceNode(i3, carMediaSource, i2, i, carMediaListArr);
    }
}
