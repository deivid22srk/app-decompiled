package com.google.android.gms.herrevad;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public static class PredictedNetworkQuality implements SafeParcelable {
    public static final Parcelable.Creator<PredictedNetworkQuality> CREATOR = new e();

    /* renamed from: a, reason: collision with root package name */
    final int f5854a;

    /* renamed from: b, reason: collision with root package name */
    public int f5855b;
    public int c;
    public long d;
    public long e;

    public PredictedNetworkQuality() {
        this.f5854a = 1;
        this.c = -1;
        this.d = -1L;
        this.e = -1L;
    }

    PredictedNetworkQuality(int i, int i2, int i3, long j, long j2) {
        this.f5854a = i;
        this.f5855b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName()).append("[\n");
        sb.append("networkType: ").append(this.f5855b).append("\n");
        sb.append("predictedLatencyMicros: ").append(this.c).append("\n");
        sb.append("predictedDownThroughputBps: ").append(this.d).append("\n");
        sb.append("predictedUpThroughputBps: ").append(this.e).append("\n");
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        e.a(this, parcel);
    }
}
