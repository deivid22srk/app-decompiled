package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public class CarFrxEvent implements SafeParcelable {
    public static final Parcelable.Creator<CarFrxEvent> CREATOR = new fb();

    /* renamed from: a, reason: collision with root package name */
    final int f5403a;

    /* renamed from: b, reason: collision with root package name */
    public int f5404b;
    public int c;
    public int d;

    public CarFrxEvent(int i, int i2, int i3, int i4) {
        this.f5403a = i;
        this.f5404b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        fb.a(this, parcel);
    }
}
