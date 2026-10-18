package com.google.android.libraries.bind.card;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.bind.card.CardListView;

/* loaded from: classes.dex */
final class f implements Parcelable.Creator<CardListView.SavedState> {
    f() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CardListView.SavedState[] newArray(int i) {
        return new CardListView.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CardListView.SavedState createFromParcel(Parcel parcel) {
        return new CardListView.SavedState(parcel, (byte) 0);
    }
}
