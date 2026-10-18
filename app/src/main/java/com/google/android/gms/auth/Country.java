package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public class Country implements SafeParcelable {
    public static final a CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final int f5361a;

    /* renamed from: b, reason: collision with root package name */
    public String f5362b;
    public String c;

    public Country() {
        this.f5361a = 1;
    }

    Country(int i, String str, String str2) {
        this.f5361a = i;
        this.f5362b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel);
    }
}
