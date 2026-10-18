package com.google.android.finsky.activities;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.finsky.activities.MultiInstallActivity;

/* loaded from: classes.dex */
final class eo implements Parcelable.Creator<MultiInstallActivity.InstallDetails> {
    eo() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MultiInstallActivity.InstallDetails[] newArray(int i) {
        return new MultiInstallActivity.InstallDetails[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MultiInstallActivity.InstallDetails createFromParcel(Parcel parcel) {
        return new MultiInstallActivity.InstallDetails(parcel);
    }
}
