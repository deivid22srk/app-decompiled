package com.google.android.finsky.navigationmanager;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public static class NavigationState implements Parcelable {
    public static final Parcelable.Creator<NavigationState> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    public final int f3536a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3537b;
    public final String c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;

    NavigationState(int i, String str, String str2) {
        this.f3536a = i;
        this.f3537b = str == null ? Integer.toString((int) (Math.random() * 2.147483646E9d)) : str;
        this.c = str2;
    }

    public String toString() {
        return "[type: " + this.f3536a + ", name: " + this.f3537b + "]";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3536a);
        parcel.writeString(this.f3537b);
        parcel.writeString(this.c);
        parcel.writeByte((byte) (this.d ? 1 : 0));
        parcel.writeByte((byte) (this.e ? 1 : 0));
        parcel.writeByte((byte) (this.f ? 1 : 0));
        parcel.writeInt(this.g);
    }
}
