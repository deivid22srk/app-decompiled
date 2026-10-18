package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.CarMediaBrowserSourceNode;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public static class CarMediaBrowserListNode implements SafeParcelable {
    public static final Parcelable.Creator<CarMediaBrowserListNode> CREATOR = new fe();

    /* renamed from: a, reason: collision with root package name */
    final int f5409a;

    /* renamed from: b, reason: collision with root package name */
    public CarMediaBrowserSourceNode.CarMediaList f5410b;
    public int c;
    public int d;
    public CarMediaSong[] e;

    public static class CarMediaSong implements SafeParcelable {
        public static final Parcelable.Creator<CarMediaSong> CREATOR = new fj();

        /* renamed from: a, reason: collision with root package name */
        final int f5411a;

        /* renamed from: b, reason: collision with root package name */
        public String f5412b;
        public String c;
        public String d;
        public String e;

        public CarMediaSong() {
            this.f5411a = 1;
        }

        public CarMediaSong(int i, String str, String str2, String str3, String str4) {
            this.f5411a = i;
            this.f5412b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            fj.a(this, parcel);
        }
    }

    public CarMediaBrowserListNode() {
        this.f5410b = new CarMediaBrowserSourceNode.CarMediaList();
        this.f5409a = 1;
    }

    public CarMediaBrowserListNode(int i, CarMediaBrowserSourceNode.CarMediaList carMediaList, int i2, int i3, CarMediaSong[] carMediaSongArr) {
        this.f5410b = new CarMediaBrowserSourceNode.CarMediaList();
        this.f5409a = i;
        this.f5410b = carMediaList;
        this.c = i2;
        this.d = i3;
        this.e = carMediaSongArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        fe.a(this, parcel, i);
    }
}
