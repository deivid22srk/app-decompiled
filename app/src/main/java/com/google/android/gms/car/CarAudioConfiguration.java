package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public static class CarAudioConfiguration implements SafeParcelable {
    public static final Parcelable.Creator<CarAudioConfiguration> CREATOR = new be();

    /* renamed from: a, reason: collision with root package name */
    final int f5395a;

    /* renamed from: b, reason: collision with root package name */
    public int f5396b;
    public int c;
    public int d;

    public CarAudioConfiguration(int i, int i2, int i3, int i4) {
        this.f5395a = i;
        this.f5396b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return getClass().getName() + "[sampleRate=" + this.f5396b + ",channelConfig=" + this.c + ",audioFormat=" + this.d + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        be.a(this, parcel);
    }
}
