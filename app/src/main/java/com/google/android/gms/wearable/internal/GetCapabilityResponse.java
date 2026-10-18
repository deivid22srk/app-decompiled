package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public class GetCapabilityResponse implements SafeParcelable {
    public static final Parcelable.Creator<GetCapabilityResponse> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    public final int f6520a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6521b;
    public final CapabilityInfoParcelable c;

    GetCapabilityResponse(int i, int i2, CapabilityInfoParcelable capabilityInfoParcelable) {
        this.f6520a = i;
        this.f6521b = i2;
        this.c = capabilityInfoParcelable;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        k.a(this, parcel, i);
    }
}
