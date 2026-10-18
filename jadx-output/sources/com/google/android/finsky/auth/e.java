package com.google.android.finsky.auth;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class e implements Parcelable.Creator<AuthState> {
    e() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AuthState[] newArray(int i) {
        return new AuthState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AuthState createFromParcel(Parcel parcel) {
        return new AuthState(parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
    }
}
