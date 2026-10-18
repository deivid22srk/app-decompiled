package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* loaded from: classes.dex */
public class StationPresetList implements SafeParcelable {
    public static final Parcelable.Creator<StationPresetList> CREATOR = new eq();

    /* renamed from: a, reason: collision with root package name */
    final int f5446a;

    /* renamed from: b, reason: collision with root package name */
    public String f5447b;
    public List<Integer> c;
    public List<StationPreset> d;

    public StationPresetList(int i, String str, List<Integer> list, List<StationPreset> list2) {
        this.f5446a = i;
        this.f5447b = str;
        this.c = list;
        this.d = list2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        eq.a(this, parcel);
    }
}
