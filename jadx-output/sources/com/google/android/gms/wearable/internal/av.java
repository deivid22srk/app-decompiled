package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class av implements Parcelable.Creator<LargeAssetRemoveRequest> {
    static void a(LargeAssetRemoveRequest largeAssetRemoveRequest, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, largeAssetRemoveRequest.f6556a);
        long[] jArr = largeAssetRemoveRequest.f6557b;
        if (jArr != null) {
            int a3 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2);
            parcel.writeLongArray(jArr);
            com.google.android.gms.common.internal.safeparcel.a.b(parcel, a3);
        }
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LargeAssetRemoveRequest[] newArray(int i) {
        return new LargeAssetRemoveRequest[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LargeAssetRemoveRequest createFromParcel(Parcel parcel) {
        int a2 = zza.a(parcel);
        int i = 0;
        long[] jArr = null;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zza.e(parcel, readInt);
                    break;
                case 2:
                    int a3 = zza.a(parcel, readInt);
                    int dataPosition = parcel.dataPosition();
                    if (a3 != 0) {
                        jArr = parcel.createLongArray();
                        parcel.setDataPosition(a3 + dataPosition);
                        break;
                    } else {
                        jArr = null;
                        break;
                    }
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new LargeAssetRemoveRequest(i, jArr);
    }
}
