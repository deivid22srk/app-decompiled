package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* loaded from: classes.dex */
public static class GetConnectedNodesResponse implements SafeParcelable {
    public static final Parcelable.Creator<GetConnectedNodesResponse> CREATOR = new s();

    /* renamed from: a, reason: collision with root package name */
    public final int f6536a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6537b;
    public final List<NodeParcelable> c;

    GetConnectedNodesResponse(int i, int i2, List<NodeParcelable> list) {
        this.f6536a = i;
        this.f6537b = i2;
        this.c = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        s.a(this, parcel);
    }
}
