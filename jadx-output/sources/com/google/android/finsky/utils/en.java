package com.google.android.finsky.utils;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class en implements Parcelable.Creator<ParcelableProtoArray<com.google.protobuf.nano.c>> {
    en() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ParcelableProtoArray<com.google.protobuf.nano.c> createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    private static ParcelableProtoArray<com.google.protobuf.nano.c> a(Parcel parcel) {
        try {
            return new ParcelableProtoArray<>(parcel, (byte) 0);
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException("Exception when unmarshalling proto array", e);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ParcelableProtoArray<com.google.protobuf.nano.c>[] newArray(int i) {
        return new ParcelableProtoArray[i];
    }
}
