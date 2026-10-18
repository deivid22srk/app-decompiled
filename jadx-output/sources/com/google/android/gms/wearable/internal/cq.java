package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class cq implements Parcelable.Creator<AmsEntityUpdateParcelable> {
    static void a(AmsEntityUpdateParcelable amsEntityUpdateParcelable, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, amsEntityUpdateParcelable.f6494a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, amsEntityUpdateParcelable.f6495b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, amsEntityUpdateParcelable.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, amsEntityUpdateParcelable.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AmsEntityUpdateParcelable[] newArray(int i) {
        return new AmsEntityUpdateParcelable[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AmsEntityUpdateParcelable createFromParcel(Parcel parcel) {
        byte b2 = 0;
        int a2 = zza.a(parcel);
        String str = null;
        byte b3 = 0;
        int i = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zza.e(parcel, readInt);
                    break;
                case 2:
                    b3 = zza.d(parcel, readInt);
                    break;
                case 3:
                    b2 = zza.d(parcel, readInt);
                    break;
                case 4:
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
        return new AmsEntityUpdateParcelable(i, b3, b2, str);
    }
}
