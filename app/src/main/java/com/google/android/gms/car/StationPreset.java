package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public static class StationPreset implements SafeParcelable {
    public static final Parcelable.Creator<StationPreset> CREATOR = new ep();

    /* renamed from: a, reason: collision with root package name */
    final int f5444a;

    /* renamed from: b, reason: collision with root package name */
    public int f5445b;
    public int c;
    public int d;

    public StationPreset(int i, int i2, int i3, int i4) {
        this.f5444a = i;
        this.f5445b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ep.a(this, parcel);
    }
}
