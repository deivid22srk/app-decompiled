package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* loaded from: classes.dex */
public class RadioProperties implements SafeParcelable {
    public static final Parcelable.Creator<RadioProperties> CREATOR = new ej();

    /* renamed from: a, reason: collision with root package name */
    final int f5431a;

    /* renamed from: b, reason: collision with root package name */
    public int f5432b;
    public int c;
    public List<ChannelRange> d;
    public List<Integer> e;
    public int f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;

    public static class ChannelRange implements SafeParcelable {
        public static final Parcelable.Creator<ChannelRange> CREATOR = new fp();

        /* renamed from: a, reason: collision with root package name */
        final int f5433a;

        /* renamed from: b, reason: collision with root package name */
        public int f5434b;
        public int c;

        public ChannelRange(int i, int i2, int i3) {
            this.f5433a = i;
            this.f5434b = i2;
            this.c = i3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            fp.a(this, parcel);
        }
    }

    public RadioProperties(int i, int i2, int i3, List<ChannelRange> list, List<Integer> list2, int i4, boolean z, int i5, int i6, boolean z2, boolean z3, int i7, boolean z4, boolean z5, int i8) {
        this.f5431a = i;
        this.f5432b = i2;
        this.c = i3;
        this.d = list;
        this.e = list2;
        this.f = i4;
        this.g = z;
        this.h = i5;
        this.i = i6;
        this.j = z2;
        this.k = z3;
        this.l = i7;
        this.m = z4;
        this.n = z5;
        this.o = i8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ej.a(this, parcel);
    }
}
