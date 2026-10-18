package com.google.android.finsky.utils;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.nano.c;

/* loaded from: classes.dex */
public static class ParcelableProto<T extends com.google.protobuf.nano.c> implements Parcelable {
    public static final Parcelable.Creator<ParcelableProto<com.google.protobuf.nano.c>> CREATOR = new em();

    /* renamed from: a, reason: collision with root package name */
    private final T f4711a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f4712b;

    /* synthetic */ ParcelableProto(com.google.protobuf.nano.c cVar, byte b2) {
        this(cVar);
    }

    private ParcelableProto(T t) {
        this.f4712b = null;
        this.f4711a = t;
    }

    public static <T extends com.google.protobuf.nano.c> ParcelableProto<T> a(T t) {
        return new ParcelableProto<>(t);
    }

    public static <T extends com.google.protobuf.nano.c> T a(Intent intent, String str) {
        ParcelableProto parcelableProto = (ParcelableProto) intent.getParcelableExtra(str);
        if (parcelableProto != null) {
            return parcelableProto.f4711a;
        }
        return null;
    }

    public static <T extends com.google.protobuf.nano.c> T a(Parcel parcel) {
        ParcelableProto parcelableProto = (ParcelableProto) parcel.readParcelable(ParcelableProto.class.getClassLoader());
        if (parcelableProto != null) {
            return parcelableProto.f4711a;
        }
        return null;
    }

    public static <T extends com.google.protobuf.nano.c> T a(Bundle bundle, String str) {
        ParcelableProto parcelableProto = (ParcelableProto) bundle.getParcelable(str);
        if (parcelableProto != null) {
            return parcelableProto.f4711a;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (this.f4711a == null) {
            parcel.writeInt(-1);
            return;
        }
        if (this.f4712b == null) {
            this.f4712b = com.google.protobuf.nano.c.a(this.f4711a);
        }
        parcel.writeInt(this.f4712b.length);
        parcel.writeByteArray(this.f4712b);
        parcel.writeString(this.f4711a.getClass().getName());
    }
}
