package com.google.android.finsky.activities;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.finsky.activities.SettingsListPreference;

/* loaded from: classes.dex */
final class gh implements Parcelable.Creator<SettingsListPreference.SavedState> {
    gh() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SettingsListPreference.SavedState[] newArray(int i) {
        return new SettingsListPreference.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SettingsListPreference.SavedState createFromParcel(Parcel parcel) {
        return new SettingsListPreference.SavedState(parcel);
    }
}
