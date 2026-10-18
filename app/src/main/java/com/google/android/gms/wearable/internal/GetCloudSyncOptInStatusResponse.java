package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public static class GetCloudSyncOptInStatusResponse implements SafeParcelable {
    public static final Parcelable.Creator<GetCloudSyncOptInStatusResponse> CREATOR = new o();

    /* renamed from: a, reason: collision with root package name */
    public final int f6528a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6529b;
    public final boolean c;
    public final boolean d;

    GetCloudSyncOptInStatusResponse(int i, int i2, boolean z, boolean z2) {
        this.f6528a = i;
        this.f6529b = i2;
        this.c = z;
        this.d = z2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.a(this, parcel);
    }
}
