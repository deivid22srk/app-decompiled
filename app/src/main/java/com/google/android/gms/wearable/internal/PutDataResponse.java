package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public class PutDataResponse implements SafeParcelable {
    public static final Parcelable.Creator<PutDataResponse> CREATOR = new bh();

    /* renamed from: a, reason: collision with root package name */
    public final int f6568a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6569b;
    public final DataItemParcelable c;

    public PutDataResponse() {
        this(1, 4005, null);
    }

    PutDataResponse(int i, int i2, DataItemParcelable dataItemParcelable) {
        this.f6568a = i;
        this.f6569b = i2;
        this.c = dataItemParcelable;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        bh.a(this, parcel, i);
    }
}
