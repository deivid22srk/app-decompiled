package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public class GetLocalNodeResponse implements SafeParcelable {
    public static final Parcelable.Creator<GetLocalNodeResponse> CREATOR = new w();

    /* renamed from: a, reason: collision with root package name */
    public final int f6544a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6545b;
    public final NodeParcelable c;

    GetLocalNodeResponse(int i, int i2, NodeParcelable nodeParcelable) {
        this.f6544a = i;
        this.f6545b = i2;
        this.c = nodeParcelable;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        w.a(this, parcel, i);
    }
}
