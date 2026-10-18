package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public static final class GetLargeAssetQueueStateResponse implements SafeParcelable {
    public static final Parcelable.Creator<GetLargeAssetQueueStateResponse> CREATOR = new v();

    /* renamed from: a, reason: collision with root package name */
    final int f6542a;

    /* renamed from: b, reason: collision with root package name */
    public final Status f6543b;
    public final LargeAssetQueueStateParcelable c;

    GetLargeAssetQueueStateResponse(int i, Status status, LargeAssetQueueStateParcelable largeAssetQueueStateParcelable) {
        this.f6542a = i;
        this.f6543b = status;
        if (status.a()) {
            com.google.android.gms.common.internal.av.a(largeAssetQueueStateParcelable);
        }
        this.c = largeAssetQueueStateParcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        v.a(this, parcel, i);
    }
}
