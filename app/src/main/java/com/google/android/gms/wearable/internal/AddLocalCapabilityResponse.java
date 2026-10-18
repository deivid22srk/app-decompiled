package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public class AddLocalCapabilityResponse implements SafeParcelable {
    public static final Parcelable.Creator<AddLocalCapabilityResponse> CREATOR = new co();

    /* renamed from: a, reason: collision with root package name */
    public final int f6492a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6493b;

    AddLocalCapabilityResponse(int i, int i2) {
        this.f6492a = i;
        this.f6493b = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        co.a(this, parcel);
    }
}
