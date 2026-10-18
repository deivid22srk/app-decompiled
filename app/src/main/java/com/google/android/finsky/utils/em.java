package com.google.android.finsky.utils;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class em implements Parcelable.Creator<ParcelableProto<com.google.protobuf.nano.c>> {
    em() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ParcelableProto<com.google.protobuf.nano.c> createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    private static ParcelableProto<com.google.protobuf.nano.c> a(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            return new ParcelableProto<>(null, (byte) 0);
        }
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        String readString = parcel.readString();
        try {
            com.google.protobuf.nano.c cVar = (com.google.protobuf.nano.c) Class.forName(readString).getConstructor(null).newInstance(null);
            cVar.a(com.google.protobuf.nano.a.a(bArr, readInt));
            return new ParcelableProto<>(cVar, (byte) 0);
        } catch (Exception e) {
            throw new IllegalArgumentException("Exception when unmarshalling: " + readString, e);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ParcelableProto<com.google.protobuf.nano.c>[] newArray(int i) {
        return new ParcelableProto[i];
    }
}
