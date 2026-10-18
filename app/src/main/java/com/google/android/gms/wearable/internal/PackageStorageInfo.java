package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public static class PackageStorageInfo implements SafeParcelable {
    public static final Parcelable.Creator<PackageStorageInfo> CREATOR = new bg();

    /* renamed from: a, reason: collision with root package name */
    public final int f6566a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6567b;
    public final String c;
    public final long d;

    PackageStorageInfo(int i, String str, String str2, long j) {
        this.f6566a = i;
        this.f6567b = str;
        this.c = str2;
        this.d = j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        bg.a(this, parcel);
    }
}
