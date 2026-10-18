package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public class CarFacet implements SafeParcelable {
    public static final Parcelable.Creator<CarFacet> CREATOR = new fa();

    /* renamed from: a, reason: collision with root package name */
    final int f5401a;

    /* renamed from: b, reason: collision with root package name */
    public int f5402b;
    public String c;

    public CarFacet(int i, int i2, String str) {
        this.f5401a = i;
        this.f5402b = i2;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        fa.a(this, parcel);
    }
}
