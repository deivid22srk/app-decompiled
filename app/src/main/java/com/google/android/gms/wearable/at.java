package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class at implements Parcelable.Creator<Asset> {
    static void a(Asset asset, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, asset.f6456a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, asset.f6457b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, asset.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, asset.d, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, asset.e, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Asset[] newArray(int i) {
        return new Asset[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Asset createFromParcel(Parcel parcel) {
        Uri uri = null;
        int a2 = zza.a(parcel);
        int i = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        String str = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zza.e(parcel, readInt);
                    break;
                case 2:
                    bArr = zza.l(parcel, readInt);
                    break;
                case 3:
                    str = zza.i(parcel, readInt);
                    break;
                case 4:
                    parcelFileDescriptor = (ParcelFileDescriptor) zza.a(parcel, readInt, ParcelFileDescriptor.CREATOR);
                    break;
                case 5:
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
        return new Asset(i, bArr, str, parcelFileDescriptor, uri);
    }
}
