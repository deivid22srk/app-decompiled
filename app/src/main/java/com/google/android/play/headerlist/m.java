package com.google.android.play.headerlist;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.headerlist.PlayHeaderListLayout;

/* loaded from: classes.dex */
final class m implements Parcelable.Creator<PlayHeaderListLayout.SavedState> {
    m() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PlayHeaderListLayout.SavedState[] newArray(int i) {
        return new PlayHeaderListLayout.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PlayHeaderListLayout.SavedState createFromParcel(Parcel parcel) {
        return new PlayHeaderListLayout.SavedState(parcel, (byte) 0);
    }
}
