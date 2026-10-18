package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public static class GetChannelOutputStreamResponse implements SafeParcelable {
    public static final Parcelable.Creator<GetChannelOutputStreamResponse> CREATOR = new m();

    /* renamed from: a, reason: collision with root package name */
    public final int f6524a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6525b;
    public final ParcelFileDescriptor c;

    GetChannelOutputStreamResponse(int i, int i2, ParcelFileDescriptor parcelFileDescriptor) {
        this.f6524a = i;
        this.f6525b = i2;
        this.c = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        m.a(this, parcel, i);
    }
}
