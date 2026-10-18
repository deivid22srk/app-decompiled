package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public class OpenChannelResponse implements SafeParcelable {
    public static final Parcelable.Creator<OpenChannelResponse> CREATOR = new bf();

    /* renamed from: a, reason: collision with root package name */
    public final int f6564a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6565b;
    public final ChannelImpl c;

    OpenChannelResponse(int i, int i2, ChannelImpl channelImpl) {
        this.f6564a = i;
        this.f6565b = i2;
        this.c = channelImpl;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        bf.a(this, parcel, i);
    }
}
