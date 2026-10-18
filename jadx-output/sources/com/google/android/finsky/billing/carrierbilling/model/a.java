package com.google.android.finsky.billing.carrierbilling.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class a implements Parcelable.Creator<SubscriberInfo> {
    a() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SubscriberInfo[] newArray(int i) {
        return new SubscriberInfo[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SubscriberInfo createFromParcel(Parcel parcel) {
        return new SubscriberInfo(parcel, (byte) 0);
    }
}
