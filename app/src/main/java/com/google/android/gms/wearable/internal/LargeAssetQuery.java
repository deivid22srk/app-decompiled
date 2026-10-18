package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public final class LargeAssetQuery implements SafeParcelable {
    public static final Parcelable.Creator<LargeAssetQuery> CREATOR = new ar();

    /* renamed from: a, reason: collision with root package name */
    final int f6548a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6549b;
    public final Uri c;

    LargeAssetQuery(int i, int i2, Uri uri) {
        this.f6548a = i;
        this.f6549b = i2;
        this.c = uri;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "LargeAssetQuery{stateFlags=" + this.f6549b + ", destinationUri=" + this.c + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ar.a(this, parcel, i);
    }
}
