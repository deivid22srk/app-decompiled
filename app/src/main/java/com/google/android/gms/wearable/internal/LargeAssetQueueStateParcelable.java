package com.google.android.gms.wearable.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.LargeAssetApi;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class LargeAssetQueueStateParcelable implements SafeParcelable, LargeAssetApi.QueueState {
    public static final Parcelable.Creator<LargeAssetQueueStateParcelable> CREATOR = new au();

    /* renamed from: a, reason: collision with root package name */
    final int f6554a;

    /* renamed from: b, reason: collision with root package name */
    final int f6555b;
    final String c;
    final Map<String, Integer> d;
    final int e;
    final int f;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LargeAssetQueueStateParcelable)) {
            return false;
        }
        LargeAssetQueueStateParcelable largeAssetQueueStateParcelable = (LargeAssetQueueStateParcelable) obj;
        return this.f6554a == largeAssetQueueStateParcelable.f6554a && this.f6555b == largeAssetQueueStateParcelable.f6555b && this.e == largeAssetQueueStateParcelable.e && this.f == largeAssetQueueStateParcelable.f && this.c.equals(largeAssetQueueStateParcelable.c) && this.d.equals(largeAssetQueueStateParcelable.d);
    }

    public final int hashCode() {
        return (((((((((this.f6554a * 31) + this.f6555b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e) * 31) + this.f;
    }

    public final String toString() {
        return "QueueState{localNodeFlags=" + this.f6555b + ", localNodeId='" + this.c + "', remoteNodeFlags=" + this.d + ", pausedCount=" + this.e + ", runningCount=" + this.f + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        au.a(this, parcel);
    }

    LargeAssetQueueStateParcelable(int i, int i2, String str, Bundle bundle, int i3, int i4) {
        this.f6554a = i;
        this.f6555b = i2 & 15;
        this.c = (String) com.google.android.gms.common.internal.av.a(str);
        this.d = a(bundle);
        this.e = i3;
        this.f = i4;
    }

    private static Map<String, Integer> a(Bundle bundle) {
        Set<String> keySet = bundle.keySet();
        android.support.v4.h.a aVar = new android.support.v4.h.a(keySet.size());
        for (String str : keySet) {
            aVar.put(str, Integer.valueOf(bundle.getInt(str) & 15));
        }
        return aVar;
    }
}
