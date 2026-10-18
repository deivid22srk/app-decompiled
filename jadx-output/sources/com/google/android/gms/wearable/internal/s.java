package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class s implements Parcelable.Creator<GetConnectedNodesResponse> {
    static void a(GetConnectedNodesResponse getConnectedNodesResponse, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, getConnectedNodesResponse.f6536a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, getConnectedNodesResponse.f6537b);
        com.google.android.gms.common.internal.safeparcel.a.c(parcel, 3, getConnectedNodesResponse.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GetConnectedNodesResponse[] newArray(int i) {
        return new GetConnectedNodesResponse[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GetConnectedNodesResponse createFromParcel(Parcel parcel) {
        int i = 0;
        int a2 = zza.a(parcel);
        ArrayList arrayList = null;
        int i2 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i2 = zza.e(parcel, readInt);
                    break;
                case 2:
                    i = zza.e(parcel, readInt);
                    break;
                case 3:
                    arrayList = zza.c(parcel, readInt, NodeParcelable.CREATOR);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new GetConnectedNodesResponse(i2, i, arrayList);
    }
}
