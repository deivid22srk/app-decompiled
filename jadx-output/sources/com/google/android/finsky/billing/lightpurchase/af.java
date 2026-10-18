package com.google.android.finsky.billing.lightpurchase;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.finsky.billing.lightpurchase.PurchaseFragment;

/* loaded from: classes.dex */
final class af implements Parcelable.Creator<PurchaseFragment.PurchaseError> {
    af() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PurchaseFragment.PurchaseError[] newArray(int i) {
        return new PurchaseFragment.PurchaseError[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PurchaseFragment.PurchaseError createFromParcel(Parcel parcel) {
        return new PurchaseFragment.PurchaseError(parcel.readInt(), parcel.readInt());
    }
}
