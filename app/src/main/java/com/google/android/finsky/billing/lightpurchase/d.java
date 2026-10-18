package com.google.android.finsky.billing.lightpurchase;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.finsky.protos.mo;
import com.google.android.finsky.utils.ParcelableProto;

/* loaded from: classes.dex */
final class d implements Parcelable.Creator<CheckoutPurchaseError> {
    d() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CheckoutPurchaseError[] newArray(int i) {
        return new CheckoutPurchaseError[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CheckoutPurchaseError createFromParcel(Parcel parcel) {
        return new CheckoutPurchaseError(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (mo) ParcelableProto.a(parcel));
    }
}
