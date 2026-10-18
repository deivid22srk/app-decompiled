package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* loaded from: classes.dex */
public class GetAllCapabilitiesResponse implements SafeParcelable {
    public static final Parcelable.Creator<GetAllCapabilitiesResponse> CREATOR = new j();

    /* renamed from: a, reason: collision with root package name */
    public final int f6518a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6519b;
    final List<CapabilityInfoParcelable> c;

    GetAllCapabilitiesResponse(int i, int i2, List<CapabilityInfoParcelable> list) {
        this.f6518a = i;
        this.f6519b = i2;
        this.c = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        j.a(this, parcel);
    }
}
