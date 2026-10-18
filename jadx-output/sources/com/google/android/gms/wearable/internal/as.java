package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class as implements Parcelable.Creator<LargeAssetQueueEntryParcelable> {
    static void a(LargeAssetQueueEntryParcelable largeAssetQueueEntryParcelable, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, largeAssetQueueEntryParcelable.f6550a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, largeAssetQueueEntryParcelable.f6551b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 3, largeAssetQueueEntryParcelable.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, largeAssetQueueEntryParcelable.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, largeAssetQueueEntryParcelable.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, largeAssetQueueEntryParcelable.f, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 8, largeAssetQueueEntryParcelable.g);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 9, largeAssetQueueEntryParcelable.h);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 10, largeAssetQueueEntryParcelable.i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 11, largeAssetQueueEntryParcelable.j);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LargeAssetQueueEntryParcelable[] newArray(int i) {
        return new LargeAssetQueueEntryParcelable[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LargeAssetQueueEntryParcelable createFromParcel(Parcel parcel) {
        Uri uri = null;
        boolean z = false;
        int a2 = zza.a(parcel);
        long j = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        String str = null;
        String str2 = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i3 = zza.e(parcel, readInt);
                    break;
                case 2:
                    j = zza.f(parcel, readInt);
                    break;
                case 3:
                    i2 = zza.e(parcel, readInt);
                    break;
                case 4:
                    str2 = zza.i(parcel, readInt);
                    break;
                case 5:
                    str = zza.i(parcel, readInt);
                    break;
                case 6:
                    uri = (Uri) zza.a(parcel, readInt, Uri.CREATOR);
                    break;
                case 7:
                default:
                    zza.b(parcel, readInt);
                    break;
                case 8:
                    i = zza.e(parcel, readInt);
                    break;
                case 9:
                    z3 = zza.c(parcel, readInt);
                    break;
                case 10:
                    z2 = zza.c(parcel, readInt);
                    break;
                case 11:
                    z = zza.c(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new LargeAssetQueueEntryParcelable(i3, j, i2, str2, str, uri, i, z3, z2, z);
    }
}
