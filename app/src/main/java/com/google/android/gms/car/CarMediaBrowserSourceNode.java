package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.CarMediaBrowserRootNode;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public class CarMediaBrowserSourceNode implements SafeParcelable {
    public static final Parcelable.Creator<CarMediaBrowserSourceNode> CREATOR = new fh();

    /* renamed from: a, reason: collision with root package name */
    final int f5419a;

    /* renamed from: b, reason: collision with root package name */
    public CarMediaBrowserRootNode.CarMediaSource f5420b;
    public int c;
    public int d;
    public CarMediaList[] e;

    public static class CarMediaList implements SafeParcelable {
        public static final Parcelable.Creator<CarMediaList> CREATOR = new fi();

        /* renamed from: a, reason: collision with root package name */
        final int f5421a;

        /* renamed from: b, reason: collision with root package name */
        public String f5422b;
        public String c;
        public byte[] d;
        public int e;

        public CarMediaList() {
            this.f5421a = 1;
        }

        public CarMediaList(int i, String str, String str2, byte[] bArr, int i2) {
            this.f5421a = i;
            this.f5422b = str;
            this.c = str2;
            this.d = bArr;
            this.e = i2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            fi.a(this, parcel);
        }
    }

    public CarMediaBrowserSourceNode() {
        this.f5419a = 1;
        this.f5420b = new CarMediaBrowserRootNode.CarMediaSource();
    }

    public CarMediaBrowserSourceNode(int i, CarMediaBrowserRootNode.CarMediaSource carMediaSource, int i2, int i3, CarMediaList[] carMediaListArr) {
        this.f5419a = i;
        this.f5420b = carMediaSource;
        this.c = i2;
        this.d = i3;
        this.e = carMediaListArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        fh.a(this, parcel, i);
    }
}
