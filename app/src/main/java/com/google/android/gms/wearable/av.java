package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class av implements Parcelable.Creator<PutDataRequest> {
    static void a(PutDataRequest putDataRequest, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, putDataRequest.f6460a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, putDataRequest.f6461b, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, putDataRequest.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, putDataRequest.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, putDataRequest.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PutDataRequest[] newArray(int i) {
        return new PutDataRequest[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PutDataRequest createFromParcel(Parcel parcel) {
        byte[] bArr = null;
        int a2 = zza.a(parcel);
        int i = 0;
        long j = 0;
        Bundle bundle = null;
        Uri uri = null;
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
                case 6:
                    j = zza.f(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new PutDataRequest(i, uri, bundle, bArr, j);
    }
}
