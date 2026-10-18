package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public final class LargeAssetQueueStateChangeParcelable implements SafeParcelable, com.google.android.gms.wearable.r {
    public static final Parcelable.Creator<LargeAssetQueueStateChangeParcelable> CREATOR = new at();

    /* renamed from: a, reason: collision with root package name */
    final int f6552a;

    /* renamed from: b, reason: collision with root package name */
    public final bi f6553b;
    final DataHolder c;
    final LargeAssetQueueStateParcelable d;

    LargeAssetQueueStateChangeParcelable(int i, DataHolder dataHolder, LargeAssetQueueStateParcelable largeAssetQueueStateParcelable) {
        this.f6552a = i;
        this.c = (DataHolder) com.google.android.gms.common.internal.av.a(dataHolder);
        this.f6553b = new bi(dataHolder);
        this.d = (LargeAssetQueueStateParcelable) com.google.android.gms.common.internal.av.a(largeAssetQueueStateParcelable);
    }

    @Override // com.google.android.gms.common.api.w
    public final void a() {
        this.f6553b.a();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "LargeAssetQueueStateChangeParcelable{queueEntryBuffer=" + this.f6553b + ", queueState=" + this.d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        at.a(this, parcel, i);
    }
}
