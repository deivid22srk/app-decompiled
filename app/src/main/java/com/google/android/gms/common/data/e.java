package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class e implements Parcelable.Creator<DataHolder> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DataHolder createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public static DataHolder a(Parcel parcel) {
        int i = 0;
        Bundle bundle = null;
        int a2 = zza.a(parcel);
        CursorWindow[] cursorWindowArr = null;
        String[] strArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    strArr = zza.m(parcel, readInt);
                    break;
                case 2:
                    cursorWindowArr = (CursorWindow[]) zza.b(parcel, readInt, CursorWindow.CREATOR);
                    break;
                case 3:
                    i = zza.e(parcel, readInt);
                    break;
                case 4:
                    bundle = zza.k(parcel, readInt);
                    break;
                case 1000:
                    i2 = zza.e(parcel, readInt);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        DataHolder dataHolder = new DataHolder(i2, strArr, cursorWindowArr, i, bundle);
        dataHolder.a();
        return dataHolder;
    }

    static void a(DataHolder dataHolder, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 1, dataHolder.f5618b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, dataHolder.f5617a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, dataHolder.d, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 3, dataHolder.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, dataHolder.f);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DataHolder[] newArray(int i) {
        return new DataHolder[i];
    }
}
