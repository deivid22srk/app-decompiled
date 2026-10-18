package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public static class TrafficIncident implements SafeParcelable {
    public static final Parcelable.Creator<TrafficIncident> CREATOR = new er();

    /* renamed from: a, reason: collision with root package name */
    final int f5448a;

    /* renamed from: b, reason: collision with root package name */
    public int f5449b;
    public int c;
    public double d;
    public double e;

    public TrafficIncident(int i, int i2, int i3, double d, double d2) {
        this.f5448a = i;
        this.f5449b = i2;
        this.c = i3;
        this.e = d2;
        this.d = d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        er.a(this, parcel);
    }
}
