package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public static class CarPhoneStatus implements SafeParcelable {
    public static final Parcelable.Creator<CarPhoneStatus> CREATOR = new fm();

    /* renamed from: a, reason: collision with root package name */
    final int f5423a;

    /* renamed from: b, reason: collision with root package name */
    public CarCall[] f5424b;
    public int c;

    public static class CarCall implements SafeParcelable {
        public static final Parcelable.Creator<CarCall> CREATOR = new fl();

        /* renamed from: a, reason: collision with root package name */
        final int f5425a;

        /* renamed from: b, reason: collision with root package name */
        public int f5426b;
        public int c;
        public String d;
        public String e;
        public String f;
        public byte[] g;

        public CarCall() {
            this.f5425a = 1;
        }

        public CarCall(int i, int i2, int i3, String str, String str2, String str3, byte[] bArr) {
            this.f5425a = i;
            this.f5426b = i2;
            this.d = str;
            this.c = i3;
            this.e = str2;
            this.f = str3;
            this.g = bArr;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            fl.a(this, parcel);
        }
    }

    public CarPhoneStatus() {
        this.f5423a = 1;
    }

    public CarPhoneStatus(int i, CarCall[] carCallArr, int i2) {
        this.f5423a = i;
        this.f5424b = carCallArr;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        fm.a(this, parcel, i);
    }
}
