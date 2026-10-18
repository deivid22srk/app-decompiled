package com.google.android.wallet.common.util;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class h implements Parcelable.Creator<ParcelableProto<com.google.protobuf.nano.c>> {
    h() {
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
            String valueOf = String.valueOf(readString);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Exception when unmarshalling: ".concat(valueOf) : new String("Exception when unmarshalling: "), e);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ParcelableProto<com.google.protobuf.nano.c>[] newArray(int i) {
        return new ParcelableProto[i];
    }
}
