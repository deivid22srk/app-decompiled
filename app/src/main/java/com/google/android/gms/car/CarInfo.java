package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public class CarInfo implements SafeParcelable {
    public static final Parcelable.Creator<CarInfo> CREATOR = new fc();

    /* renamed from: a, reason: collision with root package name */
    final int f5405a;

    /* renamed from: b, reason: collision with root package name */
    public String f5406b;
    public String c;
    public String d;
    public String e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public String j;
    public String k;
    public String l;
    public String m;
    public boolean n;
    public boolean o;
    public boolean p;
    public String q;

    public CarInfo() {
        this.f5405a = 5;
    }

    public CarInfo(int i, String str, String str2, String str3, String str4, int i2, int i3, boolean z, int i4, String str5, String str6, String str7, String str8, boolean z2, boolean z3, boolean z4, String str9) {
        this.f5405a = i;
        this.f5406b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i2;
        this.g = i3;
        this.h = z;
        this.i = i4;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = str8;
        this.n = z2;
        this.o = z3;
        this.p = z4;
        this.q = str9;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.d + " " + this.f5406b + " " + this.c + " " + this.e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        fc.a(this, parcel);
    }
}
