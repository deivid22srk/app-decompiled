package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public static class ChannelSendFileResponse implements SafeParcelable {
    public static final Parcelable.Creator<ChannelSendFileResponse> CREATOR = new da();

    /* renamed from: a, reason: collision with root package name */
    public final int f6506a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6507b;

    ChannelSendFileResponse(int i, int i2) {
        this.f6506a = i;
        this.f6507b = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        da.a(this, parcel);
    }
}
