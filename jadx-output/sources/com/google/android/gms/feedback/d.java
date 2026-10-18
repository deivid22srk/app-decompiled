package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class d implements Parcelable.Creator<FileTeleporter> {
    static void a(FileTeleporter fileTeleporter, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, fileTeleporter.f5800a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, fileTeleporter.f5801b, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, fileTeleporter.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, fileTeleporter.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FileTeleporter[] newArray(int i) {
        return new FileTeleporter[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FileTeleporter createFromParcel(Parcel parcel) {
        int a2 = zza.a(parcel);
        String str = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zza.e(parcel, readInt);
                    break;
                case 2:
                    parcelFileDescriptor = (ParcelFileDescriptor) zza.a(parcel, readInt, ParcelFileDescriptor.CREATOR);
                    break;
                case 3:
                    str = zza.i(parcel, readInt);
                    break;
                case 4:
                    str2 = zza.i(parcel, readInt);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new FileTeleporter(i, parcelFileDescriptor, str, str2);
    }
}
