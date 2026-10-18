package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public static final class LargeAssetQueueEntryParcelable implements SafeParcelable {
    public static final Parcelable.Creator<LargeAssetQueueEntryParcelable> CREATOR = new as();

    /* renamed from: a, reason: collision with root package name */
    final int f6550a;

    /* renamed from: b, reason: collision with root package name */
    final long f6551b;
    final int c;
    final String d;
    final String e;
    final Uri f;
    final int g;
    final boolean h;
    final boolean i;
    final boolean j;

    LargeAssetQueueEntryParcelable(int i, long j, int i2, String str, String str2, Uri uri, int i3, boolean z, boolean z2, boolean z3) {
        this.f6550a = i;
        this.f6551b = j;
        this.c = i2;
        this.d = (String) com.google.android.gms.common.internal.av.a(str, (Object) "path");
        this.e = (String) com.google.android.gms.common.internal.av.a(str2, (Object) "nodeId");
        this.f = (Uri) com.google.android.gms.common.internal.av.a(uri, "destinationUri");
        this.g = i3;
        this.h = z;
        this.i = z2;
        this.j = z3;
    }

    public LargeAssetQueueEntryParcelable(long j, int i, String str, String str2, Uri uri, int i2, boolean z, boolean z2, boolean z3) {
        this(1, j, i, str, str2, uri, i2, z, z2, z3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LargeAssetQueueEntryParcelable)) {
            return false;
        }
        LargeAssetQueueEntryParcelable largeAssetQueueEntryParcelable = (LargeAssetQueueEntryParcelable) obj;
        return this.f6550a == largeAssetQueueEntryParcelable.f6550a && this.f6551b == largeAssetQueueEntryParcelable.f6551b && this.c == largeAssetQueueEntryParcelable.c && this.d.equals(largeAssetQueueEntryParcelable.d) && this.e.equals(largeAssetQueueEntryParcelable.e) && this.f.equals(largeAssetQueueEntryParcelable.f) && this.h == largeAssetQueueEntryParcelable.h && this.i == largeAssetQueueEntryParcelable.i && this.j == largeAssetQueueEntryParcelable.j && this.g == largeAssetQueueEntryParcelable.g;
    }

    public final int hashCode() {
        return (((((this.i ? 1 : 0) + (((this.h ? 1 : 0) + (((((((((((this.f6550a * 31) + ((int) (this.f6551b ^ (this.f6551b >>> 32)))) * 31) + this.c) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31)) * 31)) * 31) + (this.j ? 1 : 0)) * 31) + this.g;
    }

    public final String toString() {
        return "QueueEntry{versionCode=" + this.f6550a + ", transferId=" + this.f6551b + ", state=" + this.c + ", path='" + this.d + "', nodeId='" + this.e + "', destinationUri='" + this.f + "'" + (this.h ? ", append=true" : "") + (this.i ? ", allowedOverMetered=true" : "") + (this.j ? ", allowedWithLowBattery=true" : "") + ", refuseErrorCode=" + this.g + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        as.a(this, parcel, i);
    }
}
