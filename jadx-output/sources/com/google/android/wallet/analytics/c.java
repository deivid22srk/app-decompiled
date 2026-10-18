package com.google.android.wallet.analytics;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class c implements Parcelable.Creator<CreditCardEntryAction> {
    c() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CreditCardEntryAction[] newArray(int i) {
        return new CreditCardEntryAction[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CreditCardEntryAction createFromParcel(Parcel parcel) {
        return new CreditCardEntryAction(parcel, (byte) 0);
    }
}
