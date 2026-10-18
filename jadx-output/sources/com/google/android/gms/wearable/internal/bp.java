package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class bp implements Parcelable.Creator<AddListenerRequest> {
    static void a(AddListenerRequest addListenerRequest, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, addListenerRequest.f6490a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, addListenerRequest.f6491b == null ? null : addListenerRequest.f6491b.asBinder());
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, addListenerRequest.c, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, addListenerRequest.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, addListenerRequest.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AddListenerRequest[] newArray(int i) {
        return new AddListenerRequest[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AddListenerRequest createFromParcel(Parcel parcel) {
        String str = null;
        int a2 = zza.a(parcel);
        int i = 0;
        String str2 = null;
        IntentFilter[] intentFilterArr = null;
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
                case 3:
                    intentFilterArr = (IntentFilter[]) zza.b(parcel, readInt, IntentFilter.CREATOR);
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
        return new AddListenerRequest(i, iBinder, intentFilterArr, str2, str);
    }
}
