package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public static final class LargeAssetRemoveRequest implements SafeParcelable {
    public static final Parcelable.Creator<LargeAssetRemoveRequest> CREATOR = new av();
    private static final LargeAssetRemoveRequest c = new LargeAssetRemoveRequest(1, null);

    /* renamed from: a, reason: collision with root package name */
    final int f6556a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f6557b;

    LargeAssetRemoveRequest(int i, long[] jArr) {
        this.f6556a = i;
        this.f6557b = jArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "LargeAssetRemoveRequest{transferIdsToRemove=" + Arrays.toString(this.f6557b) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        av.a(this, parcel);
    }
}
