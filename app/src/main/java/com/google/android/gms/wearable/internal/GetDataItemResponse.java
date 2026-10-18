package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public class GetDataItemResponse implements SafeParcelable {
    public static final Parcelable.Creator<GetDataItemResponse> CREATOR = new t();

    /* renamed from: a, reason: collision with root package name */
    public final int f6538a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6539b;
    public final DataItemParcelable c;

    GetDataItemResponse(int i, int i2, DataItemParcelable dataItemParcelable) {
        this.f6538a = i;
        this.f6539b = i2;
        this.c = dataItemParcelable;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        t.a(this, parcel, i);
    }
}
