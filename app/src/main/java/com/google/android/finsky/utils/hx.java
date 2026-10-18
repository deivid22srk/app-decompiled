package com.google.android.finsky.utils;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.finsky.utils.SetupWizardUtils;

/* loaded from: classes.dex */
final class hx implements Parcelable.Creator<SetupWizardUtils.SetupWizardParams> {
    hx() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SetupWizardUtils.SetupWizardParams[] newArray(int i) {
        return new SetupWizardUtils.SetupWizardParams[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SetupWizardUtils.SetupWizardParams createFromParcel(Parcel parcel) {
        return new SetupWizardUtils.SetupWizardParams(parcel);
    }
}
