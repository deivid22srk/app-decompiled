package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* loaded from: classes.dex */
public class GetConfigsResponse implements SafeParcelable {
    public static final Parcelable.Creator<GetConfigsResponse> CREATOR = new r();

    /* renamed from: a, reason: collision with root package name */
    public final int f6534a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6535b;
    public final ConnectionConfiguration[] c;

    GetConfigsResponse(int i, int i2, ConnectionConfiguration[] connectionConfigurationArr) {
        this.f6534a = i;
        this.f6535b = i2;
        this.c = connectionConfigurationArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        r.a(this, parcel, i);
    }
}
