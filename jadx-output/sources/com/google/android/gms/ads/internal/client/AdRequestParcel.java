package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.at;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gw;
import java.util.Arrays;
import java.util.List;

@gw
/* loaded from: classes.dex */
public final class AdRequestParcel implements SafeParcelable {
    public static final g CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    public final int f5297a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5298b;
    public final Bundle c;
    public final int d;
    public final List<String> e;
    public final boolean f;
    public final int g;
    public final boolean h;
    public final String i;
    public final SearchAdRequestParcel j;
    public final Location k;
    public final String l;
    public final Bundle m;
    public final Bundle n;
    public final List<String> o;
    public final String p;
    public final String q;
    public final boolean r;

    public AdRequestParcel(int i, long j, Bundle bundle, int i2, List<String> list, boolean z, int i3, boolean z2, String str, SearchAdRequestParcel searchAdRequestParcel, Location location, String str2, Bundle bundle2, Bundle bundle3, List<String> list2, String str3, String str4, boolean z3) {
        this.f5297a = i;
        this.f5298b = j;
        this.c = bundle == null ? new Bundle() : bundle;
        this.d = i2;
        this.e = list;
        this.f = z;
        this.g = i3;
        this.h = z2;
        this.i = str;
        this.j = searchAdRequestParcel;
        this.k = location;
        this.l = str2;
        this.m = bundle2;
        this.n = bundle3;
        this.o = list2;
        this.p = str3;
        this.q = str4;
        this.r = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AdRequestParcel)) {
            return false;
        }
        AdRequestParcel adRequestParcel = (AdRequestParcel) obj;
        return this.f5297a == adRequestParcel.f5297a && this.f5298b == adRequestParcel.f5298b && at.a(this.c, adRequestParcel.c) && this.d == adRequestParcel.d && at.a(this.e, adRequestParcel.e) && this.f == adRequestParcel.f && this.g == adRequestParcel.g && this.h == adRequestParcel.h && at.a(this.i, adRequestParcel.i) && at.a(this.j, adRequestParcel.j) && at.a(this.k, adRequestParcel.k) && at.a(this.l, adRequestParcel.l) && at.a(this.m, adRequestParcel.m) && at.a(this.n, adRequestParcel.n) && at.a(this.o, adRequestParcel.o) && at.a(this.p, adRequestParcel.p) && at.a(this.q, adRequestParcel.q) && this.r == adRequestParcel.r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        g.a(this, parcel, i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5297a), Long.valueOf(this.f5298b), this.c, Integer.valueOf(this.d), this.e, Boolean.valueOf(this.f), Integer.valueOf(this.g), Boolean.valueOf(this.h), this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, Boolean.valueOf(this.r)});
    }
}
