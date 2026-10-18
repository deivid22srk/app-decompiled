package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* loaded from: classes.dex */
public static class RadioState implements SafeParcelable {
    public static final Parcelable.Creator<RadioState> CREATOR = new ek();

    /* renamed from: a, reason: collision with root package name */
    final int f5435a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5436b;
    public boolean c;
    public int d;
    public RadioStationInfo e;
    public List<RadioStationInfo> f;
    public List<StationPresetList> g;

    public RadioState(int i, boolean z, boolean z2, int i2, RadioStationInfo radioStationInfo, List<RadioStationInfo> list, List<StationPresetList> list2) {
        this.f5435a = i;
        this.f5436b = z;
        this.c = z2;
        this.d = i2;
        this.e = radioStationInfo;
        this.f = list;
        this.g = list2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ek.a(this, parcel, i);
    }
}
