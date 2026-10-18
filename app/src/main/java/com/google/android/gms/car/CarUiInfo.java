package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public static class CarUiInfo implements SafeParcelable {
    public static final Parcelable.Creator<CarUiInfo> CREATOR = new fo();

    /* renamed from: a, reason: collision with root package name */
    final int f5429a;

    /* renamed from: b, reason: collision with root package name */
    boolean f5430b;
    boolean c;
    boolean d;
    boolean e;

    CarUiInfo(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f5429a = i;
        this.f5430b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return String.format("CarUiInfo (hasRotaryController: %b, hasTouchscreen: %b, hasSearchButton: %b, hasTouchpadForUiNavigation: %b)", Boolean.valueOf(this.f5430b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        fo.a(this, parcel);
    }
}
