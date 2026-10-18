package com.deivid22srk.store.setup;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class c implements Parcelable.Creator<RestoreConfig> {
    c() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RestoreConfig[] newArray(int i) {
        return new RestoreConfig[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RestoreConfig createFromParcel(Parcel parcel) {
        return new RestoreConfig(parcel);
    }
}
