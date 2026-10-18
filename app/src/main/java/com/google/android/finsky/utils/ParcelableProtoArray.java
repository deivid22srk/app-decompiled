package com.google.android.finsky.utils;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.nano.c;
import java.lang.reflect.Array;

/* loaded from: classes.dex */
public static class ParcelableProtoArray<T extends com.google.protobuf.nano.c> implements Parcelable {
    public static final Parcelable.Creator<ParcelableProtoArray<com.google.protobuf.nano.c>> CREATOR = new en();

    /* renamed from: a, reason: collision with root package name */
    public final T[] f4713a;

    /* synthetic */ ParcelableProtoArray(Parcel parcel, byte b2) {
        this(parcel);
    }

    private ParcelableProtoArray(T[] tArr) {
        this.f4713a = tArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ParcelableProtoArray(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            this.f4713a = null;
            return;
        }
        T[] tArr = (T[]) ((com.google.protobuf.nano.c[]) Array.newInstance(Class.forName(parcel.readString()), readInt));
        for (int i = 0; i < readInt; i++) {
            tArr[i] = ParcelableProto.a(parcel);
        }
        this.f4713a = tArr;
    }

    public static <T extends com.google.protobuf.nano.c> ParcelableProtoArray<T> a(T[] tArr) {
        return new ParcelableProtoArray<>(tArr);
    }

    public static <T extends com.google.protobuf.nano.c> T[] a(Intent intent, String str) {
        ParcelableProtoArray parcelableProtoArray = (ParcelableProtoArray) intent.getParcelableExtra(str);
        if (parcelableProtoArray != null) {
            return parcelableProtoArray.f4713a;
        }
        return null;
    }

    public static <T extends com.google.protobuf.nano.c> T[] a(Bundle bundle, String str) {
        ParcelableProtoArray parcelableProtoArray = (ParcelableProtoArray) bundle.getParcelable(str);
        if (parcelableProtoArray != null) {
            return parcelableProtoArray.f4713a;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (this.f4713a == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(this.f4713a.length);
        parcel.writeString(this.f4713a.getClass().getComponentType().getName());
        for (int i2 = 0; i2 < this.f4713a.length; i2++) {
            parcel.writeParcelable(ParcelableProto.a(this.f4713a[i2]), i);
        }
    }
}
