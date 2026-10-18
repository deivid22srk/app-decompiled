package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class at implements Parcelable.Creator<LargeAssetQueueStateChangeParcelable> {
    static void a(LargeAssetQueueStateChangeParcelable largeAssetQueueStateChangeParcelable, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, largeAssetQueueStateChangeParcelable.f6552a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, largeAssetQueueStateChangeParcelable.c, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, largeAssetQueueStateChangeParcelable.d, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LargeAssetQueueStateChangeParcelable[] newArray(int i) {
        return new LargeAssetQueueStateChangeParcelable[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LargeAssetQueueStateChangeParcelable createFromParcel(Parcel parcel) {
        int a2 = zza.a(parcel);
        DataHolder dataHolder = null;
        int i = 0;
        LargeAssetQueueStateParcelable largeAssetQueueStateParcelable = null;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zza.e(parcel, readInt);
                    break;
                case 2:
                case 3:
                default:
                    zza.b(parcel, readInt);
                    break;
                case 4:
                    dataHolder = (DataHolder) zza.a(parcel, readInt, DataHolder.CREATOR);
                    break;
                case 5:
                    largeAssetQueueStateParcelable = (LargeAssetQueueStateParcelable) zza.a(parcel, readInt, LargeAssetQueueStateParcelable.CREATOR);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new LargeAssetQueueStateChangeParcelable(i, dataHolder, largeAssetQueueStateParcelable);
    }
}
