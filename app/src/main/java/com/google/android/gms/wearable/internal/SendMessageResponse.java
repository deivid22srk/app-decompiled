package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public static class SendMessageResponse implements SafeParcelable {
    public static final Parcelable.Creator<SendMessageResponse> CREATOR = new bn();

    /* renamed from: a, reason: collision with root package name */
    public final int f6576a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6577b;
    public final int c;

    SendMessageResponse(int i, int i2, int i3) {
        this.f6576a = i;
        this.f6577b = i2;
        this.c = i3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        bn.a(this, parcel);
    }
}
