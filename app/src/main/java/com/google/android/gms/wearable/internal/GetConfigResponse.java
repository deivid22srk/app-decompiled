package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

@Deprecated
/* loaded from: classes.dex */
public class GetConfigResponse implements SafeParcelable {
    public static final Parcelable.Creator<GetConfigResponse> CREATOR = new q();

    /* renamed from: a, reason: collision with root package name */
    public final int f6532a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6533b;
    public final ConnectionConfiguration c;

    GetConfigResponse(int i, int i2, ConnectionConfiguration connectionConfiguration) {
        this.f6532a = i;
        this.f6533b = i2;
        this.c = connectionConfiguration;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        q.a(this, parcel, i);
    }
}
