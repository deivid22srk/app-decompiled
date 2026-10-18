package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public class CarInstrumentClusterInfo implements SafeParcelable {
    public static final Parcelable.Creator<CarInstrumentClusterInfo> CREATOR = new fd();

    /* renamed from: a, reason: collision with root package name */
    final int f5407a;

    /* renamed from: b, reason: collision with root package name */
    public int f5408b;
    public int c;
    public int d;
    public int e;
    public int f;

    public CarInstrumentClusterInfo() {
        this.f5407a = 1;
    }

    public CarInstrumentClusterInfo(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f5407a = i;
        this.f5408b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        fd.a(this, parcel);
    }
}
