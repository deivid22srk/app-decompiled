package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public static class RemoveLocalCapabilityResponse implements SafeParcelable {
    public static final Parcelable.Creator<RemoveLocalCapabilityResponse> CREATOR = new bm();

    /* renamed from: a, reason: collision with root package name */
    public final int f6574a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6575b;

    RemoveLocalCapabilityResponse(int i, int i2) {
        this.f6574a = i;
        this.f6575b = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        bm.a(this, parcel);
    }
}
