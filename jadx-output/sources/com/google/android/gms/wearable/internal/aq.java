package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class aq implements Parcelable.Creator<LargeAssetEnqueueRequest> {
    static void a(LargeAssetEnqueueRequest largeAssetEnqueueRequest, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, largeAssetEnqueueRequest.f6546a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, largeAssetEnqueueRequest.f6547b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, largeAssetEnqueueRequest.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, largeAssetEnqueueRequest.d, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, largeAssetEnqueueRequest.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, largeAssetEnqueueRequest.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, largeAssetEnqueueRequest.g);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 8, largeAssetEnqueueRequest.h);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LargeAssetEnqueueRequest[] newArray(int i) {
        return new LargeAssetEnqueueRequest[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LargeAssetEnqueueRequest createFromParcel(Parcel parcel) {
        String str = null;
        boolean z = false;
        int a2 = zza.a(parcel);
        boolean z2 = false;
        boolean z3 = false;
        Uri uri = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zza.e(parcel, readInt);
                    break;
                case 2:
                    str3 = zza.i(parcel, readInt);
                    break;
                case 3:
                    str2 = zza.i(parcel, readInt);
                    break;
                case 4:
                    uri = (Uri) zza.a(parcel, readInt, Uri.CREATOR);
                    break;
                case 5:
                    str = zza.i(parcel, readInt);
                    break;
                case 6:
                    z3 = zza.c(parcel, readInt);
                    break;
                case 7:
                    z2 = zza.c(parcel, readInt);
                    break;
                case 8:
                    z = zza.c(parcel, readInt);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new LargeAssetEnqueueRequest(i, str3, str2, uri, str, z3, z2, z);
    }
}
