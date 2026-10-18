package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public class GetCloudSyncSettingResponse implements SafeParcelable {
    public static final Parcelable.Creator<GetCloudSyncSettingResponse> CREATOR = new p();

    /* renamed from: a, reason: collision with root package name */
    public final int f6530a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6531b;
    public final boolean c;

    GetCloudSyncSettingResponse(int i, int i2, boolean z) {
        this.f6530a = i;
        this.f6531b = i2;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        p.a(this, parcel);
    }
}
