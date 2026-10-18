package com.google.android.finsky.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.finsky.protos.pw;
import com.google.android.finsky.utils.ParcelableProto;

/* loaded from: classes.dex */
final class n implements Parcelable.Creator<DfeToc> {
    n() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DfeToc[] newArray(int i) {
        return new DfeToc[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DfeToc createFromParcel(Parcel parcel) {
        return new DfeToc((pw) ParcelableProto.a(parcel));
    }
}
