package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class bl implements Parcelable.Creator<RemoveListenerRequest> {
    static void a(RemoveListenerRequest removeListenerRequest, Parcel parcel) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, removeListenerRequest.f6572a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, removeListenerRequest.f6573b == null ? null : removeListenerRequest.f6573b.asBinder());
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RemoveListenerRequest[] newArray(int i) {
        return new RemoveListenerRequest[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RemoveListenerRequest createFromParcel(Parcel parcel) {
        int a2 = zza.a(parcel);
        int i = 0;
        IBinder iBinder = null;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zza.e(parcel, readInt);
                    break;
                case 2:
                    iBinder = zza.j(parcel, readInt);
                    break;
                default:
                    zza.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a2) {
            throw new zza.C0000zza("Overread allowed size end=" + a2, parcel);
        }
        return new RemoveListenerRequest(i, iBinder);
    }
}
