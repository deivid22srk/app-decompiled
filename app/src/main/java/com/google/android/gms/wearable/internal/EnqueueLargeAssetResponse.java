package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public static final class EnqueueLargeAssetResponse implements SafeParcelable {
    public static final Parcelable.Creator<EnqueueLargeAssetResponse> CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    final int f6516a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6517b;
    public final LargeAssetQueueEntryParcelable c;

    EnqueueLargeAssetResponse(int i, int i2, LargeAssetQueueEntryParcelable largeAssetQueueEntryParcelable) {
        this.f6516a = i;
        this.f6517b = i2;
        if (i2 == 0) {
            com.google.android.gms.common.internal.av.b(largeAssetQueueEntryParcelable != null, "Expecting non-null queueEntry");
        } else {
            com.google.android.gms.common.internal.av.a(largeAssetQueueEntryParcelable == null, "Expecting null queueEntry: %s", largeAssetQueueEntryParcelable);
        }
        this.c = largeAssetQueueEntryParcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        i.a(this, parcel, i);
    }
}
