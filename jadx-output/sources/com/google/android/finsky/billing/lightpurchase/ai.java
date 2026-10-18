package com.google.android.finsky.billing.lightpurchase;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class ai implements Parcelable.Creator<VoucherParams> {
    ai() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ VoucherParams[] newArray(int i) {
        return new VoucherParams[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ VoucherParams createFromParcel(Parcel parcel) {
        return new VoucherParams(parcel, (byte) 0);
    }
}
