package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Map;

/* loaded from: classes.dex */
public final class f implements Parcelable.Creator<DataItemParcelable> {
    static void a(DataItemParcelable dataItemParcelable, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, dataItemParcelable.f6512a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, dataItemParcelable.f6513b, i);
        Bundle bundle = new Bundle();
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        for (Map.Entry<String, com.google.android.gms.wearable.m> entry : dataItemParcelable.c.entrySet()) {
            bundle.putParcelable(entry.getKey(), new DataItemAssetParcelable(entry.getValue()));
        }
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, bundle);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, dataItemParcelable.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DataItemParcelable[] newArray(int i) {
        return new DataItemParcelable[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DataItemParcelable createFromParcel(Parcel parcel) {
        int a2 = zza.a(parcel);
        Bundle bundle = null;
        Uri uri = null;
        int i = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zza.e(parcel, readInt);
                    break;
                case 2:
                    uri = (Uri) zza.a(parcel, readInt, Uri.CREATOR);
                    break;
                case 3:
                default:
                    zza.b(parcel, readInt);
                    break;
                case 4:
                    bundle = zza.k(parcel, readInt);
                    break;
                case 5:
                    bArr = zza.l(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new DataItemParcelable(i, uri, bundle, bArr);
    }
}
