package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public class ChannelReceiveFileResponse implements SafeParcelable {
    public static final Parcelable.Creator<ChannelReceiveFileResponse> CREATOR = new cz();

    /* renamed from: a, reason: collision with root package name */
    public final int f6504a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6505b;

    ChannelReceiveFileResponse(int i, int i2) {
        this.f6504a = i;
        this.f6505b = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        cz.a(this, parcel);
    }
}
