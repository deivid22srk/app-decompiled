package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* loaded from: classes.dex */
public static class RadioStationInfo implements SafeParcelable {
    public static final Parcelable.Creator<RadioStationInfo> CREATOR = new el();

    /* renamed from: a, reason: collision with root package name */
    final int f5437a;

    /* renamed from: b, reason: collision with root package name */
    public int f5438b;
    public int c;
    public int d;
    public MetaData e;

    public static class HdData implements SafeParcelable {
        public static final Parcelable.Creator<HdData> CREATOR = new em();

        /* renamed from: a, reason: collision with root package name */
        final int f5439a;

        public HdData() {
            this(1);
        }

        public HdData(int i) {
            this.f5439a = i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            em.a(this, parcel);
        }
    }

    public static class MetaData implements SafeParcelable {
        public static final Parcelable.Creator<MetaData> CREATOR = new en();

        /* renamed from: a, reason: collision with root package name */
        final int f5440a;

        /* renamed from: b, reason: collision with root package name */
        public int f5441b;
        public int c;
        public RdsData d;
        public HdData e;

        public MetaData(int i, int i2, int i3, RdsData rdsData, HdData hdData) {
            this.f5440a = i;
            this.f5441b = i2;
            this.c = i3;
            this.d = rdsData;
            this.e = hdData;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            en.a(this, parcel, i);
        }
    }

    public static class RdsData implements SafeParcelable {
        public static final Parcelable.Creator<RdsData> CREATOR = new eo();

        /* renamed from: a, reason: collision with root package name */
        final int f5442a;

        /* renamed from: b, reason: collision with root package name */
        public List<Integer> f5443b;
        public int c;
        public int d;
        public String e;
        public int f;
        public String g;
        public String h;
        public boolean i;
        public boolean j;

        public RdsData(int i, List<Integer> list, int i2, int i3, String str, int i4, String str2, String str3, boolean z, boolean z2) {
            this.f5442a = i;
            this.f5443b = list;
            this.c = i2;
            this.d = i3;
            this.e = str;
            this.f = i4;
            this.g = str2;
            this.h = str3;
            this.i = z;
            this.j = z2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            eo.a(this, parcel);
        }
    }

    public RadioStationInfo(int i, int i2, int i3, int i4, MetaData metaData) {
        this.f5437a = i;
        this.f5438b = i2;
        this.c = i3;
        this.d = i4;
        this.e = metaData;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        el.a(this, parcel, i);
    }
}
