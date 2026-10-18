package com.google.android.gms.wearable.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Map;

/* loaded from: classes.dex */
public final class au implements Parcelable.Creator<LargeAssetQueueStateParcelable> {
    static void a(LargeAssetQueueStateParcelable largeAssetQueueStateParcelable, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, largeAssetQueueStateParcelable.f6554a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, largeAssetQueueStateParcelable.f6555b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, largeAssetQueueStateParcelable.c);
        Bundle bundle = new Bundle();
        for (Map.Entry<String, Integer> entry : largeAssetQueueStateParcelable.d.entrySet()) {
            bundle.putInt(entry.getKey(), entry.getValue().intValue());
        }
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, bundle);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 5, largeAssetQueueStateParcelable.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 6, largeAssetQueueStateParcelable.f);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LargeAssetQueueStateParcelable[] newArray(int i) {
        return new LargeAssetQueueStateParcelable[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LargeAssetQueueStateParcelable createFromParcel(Parcel parcel) {
        Bundle bundle = null;
        int i = 0;
        int a2 = zza.a(parcel);
        int i2 = 0;
        String str = null;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i4 = zza.e(parcel, readInt);
                    break;
                case 2:
                    i3 = zza.e(parcel, readInt);
                    break;
                case 3:
                    str = zza.i(parcel, readInt);
                    break;
                case 4:
                    bundle = zza.k(parcel, readInt);
                    break;
                case 5:
                    i2 = zza.e(parcel, readInt);
                    break;
                case 6:
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
        return new LargeAssetQueueStateParcelable(i4, i3, str, bundle, i2, i);
    }
}
