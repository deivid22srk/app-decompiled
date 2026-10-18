package com.google.android.gms.ads.internal.purchase;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator<GInAppPurchaseManagerInfoParcel> {
    static void a(GInAppPurchaseManagerInfoParcel gInAppPurchaseManagerInfoParcel, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, gInAppPurchaseManagerInfoParcel.f5335a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, com.google.android.gms.dynamic.d.a(gInAppPurchaseManagerInfoParcel.f5336b).asBinder());
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, com.google.android.gms.dynamic.d.a(gInAppPurchaseManagerInfoParcel.c).asBinder());
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, com.google.android.gms.dynamic.d.a(gInAppPurchaseManagerInfoParcel.d).asBinder());
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, com.google.android.gms.dynamic.d.a(gInAppPurchaseManagerInfoParcel.e).asBinder());
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GInAppPurchaseManagerInfoParcel[] newArray(int i) {
        return new GInAppPurchaseManagerInfoParcel[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GInAppPurchaseManagerInfoParcel createFromParcel(Parcel parcel) {
        IBinder iBinder = null;
        int a2 = zza.a(parcel);
        int i = 0;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zza.e(parcel, readInt);
                    break;
                case 2:
                default:
                    zza.b(parcel, readInt);
                    break;
                case 3:
                    iBinder4 = zza.j(parcel, readInt);
                    break;
                case 4:
                    iBinder3 = zza.j(parcel, readInt);
                    break;
                case 5:
                    iBinder2 = zza.j(parcel, readInt);
                    break;
                case 6:
                    iBinder = zza.j(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new GInAppPurchaseManagerInfoParcel(i, iBinder4, iBinder3, iBinder2, iBinder);
    }
}
