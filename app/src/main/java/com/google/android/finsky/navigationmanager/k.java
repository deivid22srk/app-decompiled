package com.google.android.finsky.navigationmanager;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class k implements Parcelable.Creator<NavigationState> {
    k() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ NavigationState[] newArray(int i) {
        return new NavigationState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ NavigationState createFromParcel(Parcel parcel) {
        NavigationState navigationState = new NavigationState(parcel.readInt(), parcel.readString(), parcel.readString());
        navigationState.d = parcel.readByte() > 0;
        navigationState.e = parcel.readByte() > 0;
        navigationState.f = parcel.readByte() > 0;
        navigationState.g = parcel.readInt();
        return navigationState;
    }
}
