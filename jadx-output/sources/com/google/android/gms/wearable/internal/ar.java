package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class ar implements Parcelable.Creator<LargeAssetQuery> {
    static void a(LargeAssetQuery largeAssetQuery, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, largeAssetQuery.f6548a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, largeAssetQuery.f6549b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, largeAssetQuery.c, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LargeAssetQuery[] newArray(int i) {
        return new LargeAssetQuery[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LargeAssetQuery createFromParcel(Parcel parcel) {
        int i = 0;
        int a2 = zza.a(parcel);
        Uri uri = null;
        int i2 = 0;
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
                    uri = (Uri) zza.a(parcel, readInt, Uri.CREATOR);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new LargeAssetQuery(i2, i, uri);
    }
}
