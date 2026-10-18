package com.google.android.finsky.billing.lightpurchase;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class ag implements Parcelable.Creator<PurchaseParams> {
    ag() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PurchaseParams[] newArray(int i) {
        return new PurchaseParams[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PurchaseParams createFromParcel(Parcel parcel) {
        return new PurchaseParams(parcel, (byte) 0);
    }
}
