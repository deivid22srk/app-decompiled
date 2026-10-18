package com.google.android.finsky.billing.giftcard;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class d implements Parcelable.Creator<RedeemCodeResult> {
    d() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RedeemCodeResult[] newArray(int i) {
        return new RedeemCodeResult[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RedeemCodeResult createFromParcel(Parcel parcel) {
        return new RedeemCodeResult(parcel);
    }
}
