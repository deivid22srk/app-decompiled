package com.google.android.wallet.analytics;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class g implements Parcelable.Creator<WebViewPageLoadEvent> {
    g() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ WebViewPageLoadEvent[] newArray(int i) {
        return new WebViewPageLoadEvent[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ WebViewPageLoadEvent createFromParcel(Parcel parcel) {
        return new WebViewPageLoadEvent(parcel, (byte) 0);
    }
}
