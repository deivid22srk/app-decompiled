package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* loaded from: classes.dex */
public static class StorageInfoResponse implements SafeParcelable {
    public static final Parcelable.Creator<StorageInfoResponse> CREATOR = new bq();

    /* renamed from: a, reason: collision with root package name */
    public final int f6578a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6579b;
    public final long c;
    public final List<PackageStorageInfo> d;

    StorageInfoResponse(int i, int i2, long j, List<PackageStorageInfo> list) {
        this.f6578a = i;
        this.f6579b = i2;
        this.c = j;
        this.d = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        bq.a(this, parcel);
    }
}
