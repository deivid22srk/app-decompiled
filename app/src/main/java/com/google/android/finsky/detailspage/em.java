package com.google.android.finsky.detailspage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.finsky.detailspage.TextModule;
import com.google.android.finsky.utils.ParcelableProto;

/* loaded from: classes.dex */
final class em implements Parcelable.Creator<TextModule.DetailsExtraPrimary> {
    em() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TextModule.DetailsExtraPrimary[] newArray(int i) {
        return new TextModule.DetailsExtraPrimary[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TextModule.DetailsExtraPrimary createFromParcel(Parcel parcel) {
        return new TextModule.DetailsExtraPrimary(parcel.readString(), parcel.readString(), parcel.readString(), (com.google.android.finsky.protos.ds) ParcelableProto.a(parcel), parcel.readInt() == 1);
    }
}
