package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.CarMediaBrowserRootNode;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class ff implements Parcelable.Creator<CarMediaBrowserRootNode> {
    static void a(CarMediaBrowserRootNode carMediaBrowserRootNode, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 1, carMediaBrowserRootNode.f5414b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, carMediaBrowserRootNode.f5413a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, carMediaBrowserRootNode.c, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CarMediaBrowserRootNode[] newArray(int i) {
        return new CarMediaBrowserRootNode[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CarMediaBrowserRootNode createFromParcel(Parcel parcel) {
        CarMediaBrowserRootNode.CarMediaSource[] carMediaSourceArr = null;
        int a2 = zza.a(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    str = zza.i(parcel, readInt);
                    break;
                case 2:
                    carMediaSourceArr = (CarMediaBrowserRootNode.CarMediaSource[]) zza.b(parcel, readInt, CarMediaBrowserRootNode.CarMediaSource.CREATOR);
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
        return new CarMediaBrowserRootNode(i, str, carMediaSourceArr);
    }
}
