package com.google.android.finsky.billing.lightpurchase;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class p implements Parcelable.Creator<GiftEmailParams> {
    p() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GiftEmailParams[] newArray(int i) {
        return new GiftEmailParams[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GiftEmailParams createFromParcel(Parcel parcel) {
        return new GiftEmailParams(parcel, (byte) 0);
    }
}
