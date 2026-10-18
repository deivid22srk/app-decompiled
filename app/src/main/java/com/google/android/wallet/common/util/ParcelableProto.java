package com.google.android.wallet.common.util;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.nano.c;
import java.util.ArrayList;

/* loaded from: classes.dex */
public static class ParcelableProto<T extends com.google.protobuf.nano.c> implements Parcelable {
    public static final Parcelable.Creator<ParcelableProto<com.google.protobuf.nano.c>> CREATOR = new h();

    /* renamed from: a, reason: collision with root package name */
    private final T f7293a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f7294b;

    /* synthetic */ ParcelableProto(com.google.protobuf.nano.c cVar, byte b2) {
        this(cVar);
    }

    private ParcelableProto(T t) {
        this.f7294b = null;
        this.f7293a = t;
    }

    public static <T extends com.google.protobuf.nano.c> ParcelableProto<T> a(T t) {
        return new ParcelableProto<>(t);
    }

    public static <T extends com.google.protobuf.nano.c> ArrayList<ParcelableProto<T>> a(T[] tArr) {
        if (tArr == null) {
            return null;
        }
        ArrayList<ParcelableProto<T>> arrayList = new ArrayList<>(tArr.length);
        for (T t : tArr) {
            arrayList.add(a(t));
        }
        return arrayList;
    }

    public static <T extends com.google.protobuf.nano.c> T a(Intent intent, String str) {
        ParcelableProto parcelableProto = (ParcelableProto) intent.getParcelableExtra(str);
        if (parcelableProto != null) {
            return parcelableProto.f7293a;
        }
        return null;
    }

    public static <T extends com.google.protobuf.nano.c> T a(Bundle bundle, String str) {
        ParcelableProto parcelableProto = (ParcelableProto) bundle.getParcelable(str);
        if (parcelableProto != null) {
            return parcelableProto.f7293a;
        }
        return null;
    }

    public static <T extends com.google.protobuf.nano.c> ArrayList<T> b(Bundle bundle, String str) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
        if (parcelableArrayList == null) {
            return null;
        }
        int size = parcelableArrayList.size();
        ArrayList<T> arrayList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(((ParcelableProto) parcelableArrayList.get(i)).f7293a);
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (this.f7293a == null) {
            parcel.writeInt(-1);
            return;
        }
        if (this.f7294b == null) {
            this.f7294b = com.google.protobuf.nano.c.a(this.f7293a);
        }
        parcel.writeInt(this.f7294b.length);
        parcel.writeByteArray(this.f7294b);
        parcel.writeString(this.f7293a.getClass().getName());
    }
}
