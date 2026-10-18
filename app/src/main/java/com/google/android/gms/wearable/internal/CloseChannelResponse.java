package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public static class CloseChannelResponse implements SafeParcelable {
    public static final Parcelable.Creator<CloseChannelResponse> CREATOR = new db();

    /* renamed from: a, reason: collision with root package name */
    public final int f6508a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6509b;

    CloseChannelResponse(int i, int i2) {
        this.f6508a = i;
        this.f6509b = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        db.a(this, parcel);
    }
}
