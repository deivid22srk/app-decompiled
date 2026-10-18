package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public class DeleteDataItemsResponse implements SafeParcelable {
    public static final Parcelable.Creator<DeleteDataItemsResponse> CREATOR = new h();

    /* renamed from: a, reason: collision with root package name */
    public final int f6514a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6515b;
    public final int c;

    DeleteDataItemsResponse(int i, int i2, int i3) {
        this.f6514a = i;
        this.f6515b = i2;
        this.c = i3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.a(this, parcel);
    }
}
