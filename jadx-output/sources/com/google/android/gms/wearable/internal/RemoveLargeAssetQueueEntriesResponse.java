package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public final class RemoveLargeAssetQueueEntriesResponse implements SafeParcelable {
    public static final Parcelable.Creator<RemoveLargeAssetQueueEntriesResponse> CREATOR = new bk();

    /* renamed from: a, reason: collision with root package name */
    public final int f6570a;

    /* renamed from: b, reason: collision with root package name */
    public final Status f6571b;
    public final int c;

    RemoveLargeAssetQueueEntriesResponse(int i, Status status, int i2) {
        this.f6570a = i;
        this.f6571b = (Status) com.google.android.gms.common.internal.av.a(status, "status");
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        bk.a(this, parcel, i);
    }
}
