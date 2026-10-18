package com.google.android.finsky.detailspage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.finsky.detailspage.TextModule;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class eo implements Parcelable.Creator<TextModule.ExpandedData> {
    eo() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TextModule.ExpandedData[] newArray(int i) {
        return new TextModule.ExpandedData[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TextModule.ExpandedData createFromParcel(Parcel parcel) {
        TextModule.ExpandedData expandedData = new TextModule.ExpandedData();
        expandedData.f2522a = parcel.readInt();
        expandedData.f2523b = parcel.readString();
        expandedData.c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        expandedData.d = parcel.readInt();
        expandedData.e = parcel.readString();
        expandedData.f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        expandedData.g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        expandedData.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        expandedData.i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        expandedData.j = parcel.readInt() == 1;
        expandedData.k = parcel.readString();
        expandedData.l = new ArrayList();
        parcel.readTypedList(expandedData.l, TextModule.DetailsExtraCredits.CREATOR);
        expandedData.m = new ArrayList();
        parcel.readTypedList(expandedData.m, TextModule.DetailsExtraPrimary.CREATOR);
        expandedData.n = new ArrayList();
        parcel.readTypedList(expandedData.n, TextModule.DetailsExtraSecondary.CREATOR);
        expandedData.o = parcel.readString();
        return expandedData;
    }
}
