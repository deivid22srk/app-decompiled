package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

/* loaded from: classes.dex */
public final class cx implements Parcelable.Creator<ChannelEventParcelable> {
    static void a(ChannelEventParcelable channelEventParcelable, Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, channelEventParcelable.f6500a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, channelEventParcelable.f6501b, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 3, channelEventParcelable.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 4, channelEventParcelable.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 5, channelEventParcelable.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ChannelEventParcelable[] newArray(int i) {
        return new ChannelEventParcelable[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ChannelEventParcelable createFromParcel(Parcel parcel) {
        int i = 0;
        int a2 = zza.a(parcel);
        ChannelImpl channelImpl = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i4 = zza.e(parcel, readInt);
                    break;
                case 2:
                    channelImpl = (ChannelImpl) zza.a(parcel, readInt, ChannelImpl.CREATOR);
                    break;
                case 3:
                    i3 = zza.e(parcel, readInt);
                    break;
                case 4:
                    i2 = zza.e(parcel, readInt);
                    break;
                case 5:
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
        return new ChannelEventParcelable(i4, channelImpl, i3, i2, i);
    }
}
