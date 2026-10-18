package com.google.android.libraries.bind.data;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class Data implements Parcelable {
    public static final Parcelable.Creator<Data> CREATOR = new h();

    /* renamed from: a, reason: collision with root package name */
    SparseArray<Object> f6678a;

    /* renamed from: b, reason: collision with root package name */
    boolean f6679b;

    public Data() {
        this((byte) 0);
    }

    private Data(byte b2) {
        this.f6678a = new SparseArray<>(8);
    }

    public Data(SparseArray<Object> sparseArray) {
        if (Build.VERSION.SDK_INT >= 14) {
            this.f6678a = sparseArray.clone();
        } else {
            this.f6678a = new SparseArray<>(sparseArray.size());
            a(sparseArray);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Data) {
            return this.f6678a.equals(((Data) obj).f6678a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6678a.hashCode();
    }

    private void a(SparseArray<Object> sparseArray) {
        for (int i = 0; i < sparseArray.size(); i++) {
            this.f6678a.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
        }
    }

    public final boolean a(int i) {
        return this.f6678a.get(i) != null;
    }

    public final <T> T b(int i) {
        T t = (T) this.f6678a.get(i);
        if (t instanceof n) {
            return (T) ((n) t).a();
        }
        return t;
    }

    public final Integer c(int i) {
        Object b2 = b(i);
        if (b2 != null) {
            return Integer.valueOf(((Number) b2).intValue());
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSparseArray(this.f6678a);
    }

    public static String d(int i) {
        return com.google.android.libraries.bind.dpkg.a.a(i);
    }

    public final String toString() {
        if (this.f6678a.size() == 0) {
            return "Data is empty";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.f6678a.size(); i++) {
            int keyAt = this.f6678a.keyAt(i);
            Object valueAt = this.f6678a.valueAt(i);
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(com.google.android.libraries.bind.dpkg.a.a(keyAt) + "=" + valueAt);
        }
        return sb.toString();
    }
}
