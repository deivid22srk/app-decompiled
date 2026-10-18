package com.google.android.libraries.bind.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* loaded from: classes.dex */
final class h implements Parcelable.Creator<Data> {
    h() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Data[] newArray(int i) {
        return new Data[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Data createFromParcel(Parcel parcel) {
        return new Data((SparseArray<Object>) parcel.readSparseArray(null));
    }
}
