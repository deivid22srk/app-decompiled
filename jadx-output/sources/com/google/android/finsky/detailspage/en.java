package com.google.android.finsky.detailspage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.finsky.detailspage.TextModule;

/* loaded from: classes.dex */
final class en implements Parcelable.Creator<TextModule.DetailsExtraSecondary> {
    en() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TextModule.DetailsExtraSecondary[] newArray(int i) {
        return new TextModule.DetailsExtraSecondary[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TextModule.DetailsExtraSecondary createFromParcel(Parcel parcel) {
        return new TextModule.DetailsExtraSecondary(parcel.readString(), parcel.readString());
    }
}
