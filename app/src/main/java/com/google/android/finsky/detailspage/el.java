package com.google.android.finsky.detailspage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.finsky.detailspage.TextModule;

/* loaded from: classes.dex */
final class el implements Parcelable.Creator<TextModule.DetailsExtraCredits> {
    el() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TextModule.DetailsExtraCredits[] newArray(int i) {
        return new TextModule.DetailsExtraCredits[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TextModule.DetailsExtraCredits createFromParcel(Parcel parcel) {
        return new TextModule.DetailsExtraCredits(parcel.readString(), parcel.readString());
    }
}
