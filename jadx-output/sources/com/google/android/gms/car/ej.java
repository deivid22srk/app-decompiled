package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.RadioProperties;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ej implements Parcelable.Creator<RadioProperties> {
    static void a(RadioProperties radioProperties, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, radioProperties.f5432b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, radioProperties.f5431a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, radioProperties.c);
        com.google.android.gms.common.internal.safeparcel.a.c(parcel, 3, radioProperties.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, radioProperties.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 5, radioProperties.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, radioProperties.g);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 7, radioProperties.h);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 8, radioProperties.i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 9, radioProperties.j);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 10, radioProperties.k);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 11, radioProperties.l);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 12, radioProperties.m);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 13, radioProperties.n);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 14, radioProperties.o);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RadioProperties[] newArray(int i) {
        return new RadioProperties[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RadioProperties createFromParcel(Parcel parcel) {
        int a2 = zza.a(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        ArrayList arrayList = null;
        ArrayList<Integer> arrayList2 = null;
        int i4 = 0;
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i7 = 0;
        boolean z4 = false;
        boolean z5 = false;
        int i8 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i2 = zza.e(parcel, readInt);
                    break;
                case 2:
                    i3 = zza.e(parcel, readInt);
                    break;
                case 3:
                    arrayList = zza.c(parcel, readInt, RadioProperties.ChannelRange.CREATOR);
                    break;
                case 4:
                    arrayList2 = zza.n(parcel, readInt);
                    break;
                case 5:
                    i4 = zza.e(parcel, readInt);
                    break;
                case 6:
                    z = zza.c(parcel, readInt);
                    break;
                case 7:
                    i5 = zza.e(parcel, readInt);
                    break;
                case 8:
                    i6 = zza.e(parcel, readInt);
                    break;
                case 9:
                    z2 = zza.c(parcel, readInt);
                    break;
                case 10:
                    z3 = zza.c(parcel, readInt);
                    break;
                case 11:
                    i7 = zza.e(parcel, readInt);
                    break;
                case 12:
                    z4 = zza.c(parcel, readInt);
                    break;
                case 13:
                    z5 = zza.c(parcel, readInt);
                    break;
                case 14:
                    i8 = zza.e(parcel, readInt);
                    break;
                case 1000:
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
        return new RadioProperties(i, i2, i3, arrayList, arrayList2, i4, z, i5, i6, z2, z3, i7, z4, z5, i8);
    }
}
