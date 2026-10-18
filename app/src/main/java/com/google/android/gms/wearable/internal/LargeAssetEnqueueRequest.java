package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public static final class LargeAssetEnqueueRequest implements SafeParcelable {
    public static final Parcelable.Creator<LargeAssetEnqueueRequest> CREATOR = new aq();

    /* renamed from: a, reason: collision with root package name */
    final int f6546a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6547b;
    public final String c;
    public final Uri d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    LargeAssetEnqueueRequest(int i, String str, String str2, Uri uri, String str3, boolean z, boolean z2, boolean z3) {
        this.f6546a = i;
        this.f6547b = (String) com.google.android.gms.common.internal.av.a(str);
        this.c = (String) com.google.android.gms.common.internal.av.a(str2);
        this.d = (Uri) com.google.android.gms.common.internal.av.a(uri);
        this.e = (String) com.google.android.gms.common.internal.av.a(str3);
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LargeAssetEnqueueRequest)) {
            return false;
        }
        LargeAssetEnqueueRequest largeAssetEnqueueRequest = (LargeAssetEnqueueRequest) obj;
        return this.f6546a == largeAssetEnqueueRequest.f6546a && this.f6547b.equals(largeAssetEnqueueRequest.f6547b) && this.c.equals(largeAssetEnqueueRequest.c) && this.d.equals(largeAssetEnqueueRequest.d) && this.e.equals(largeAssetEnqueueRequest.e) && this.f == largeAssetEnqueueRequest.f && this.g == largeAssetEnqueueRequest.g && this.h == largeAssetEnqueueRequest.h;
    }

    public final int hashCode() {
        return (((this.g ? 1 : 0) + (((this.f ? 1 : 0) + (((((((((this.f6546a * 31) + this.f6547b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31)) * 31)) * 31) + (this.h ? 1 : 0);
    }

    public final String toString() {
        return "LargeAssetEnqueueRequest{, nodeId='" + this.f6547b + "', path='" + this.c + "', destinationUri='" + this.d + "', destinationCanonicalPath='" + this.e + "', append=" + this.f + (this.g ? ", allowedOverMetered=true" : "") + (this.h ? ", allowedWithLowBattery=true" : "") + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        aq.a(this, parcel, i);
    }
}
