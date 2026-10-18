package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class m implements Parcelable.Creator<OfflineSuggestion> {
    static void a(OfflineSuggestion offlineSuggestion, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, offlineSuggestion.f5810a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, offlineSuggestion.f5811b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, offlineSuggestion.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, offlineSuggestion.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, offlineSuggestion.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ OfflineSuggestion[] newArray(int i) {
        return new OfflineSuggestion[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ OfflineSuggestion createFromParcel(Parcel parcel) {
        String str = null;
        int a2 = zza.a(parcel);
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zza.e(parcel, readInt);
                    break;
                case 2:
                    str4 = zza.i(parcel, readInt);
                    break;
                case 3:
                    str3 = zza.i(parcel, readInt);
                    break;
                case 4:
                    str2 = zza.i(parcel, readInt);
                    break;
                case 5:
                    str = zza.i(parcel, readInt);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new OfflineSuggestion(i, str4, str3, str2, str);
    }
}
