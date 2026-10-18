package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public static final class ConnectionEvent extends g implements SafeParcelable {
    public static final Parcelable.Creator<ConnectionEvent> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final int f5773a;

    /* renamed from: b, reason: collision with root package name */
    final long f5774b;
    int c;
    final String d;
    final String e;
    final String f;
    final String g;
    final String h;
    final String i;
    final long j;
    final long k;
    private long l;

    ConnectionEvent(int i, long j, int i2, String str, String str2, String str3, String str4, String str5, String str6, long j2, long j3) {
        this.f5773a = i;
        this.f5774b = j;
        this.c = i2;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.l = -1L;
        this.h = str5;
        this.i = str6;
        this.j = j2;
        this.k = j3;
    }

    public ConnectionEvent(long j, int i, String str, String str2, String str3, String str4, String str5, String str6, long j2, long j3) {
        this(1, j, i, str, str2, str3, str4, str5, str6, j2, j3);
    }

    @Override // com.google.android.gms.common.stats.g
    public final long a() {
        return this.f5774b;
    }

    @Override // com.google.android.gms.common.stats.g
    public final int b() {
        return this.c;
    }

    @Override // com.google.android.gms.common.stats.g
    public final long c() {
        return this.l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel);
    }

    @Override // com.google.android.gms.common.stats.g
    public final String d() {
        return "\t" + this.d + "/" + this.e + "\t" + this.f + "/" + this.g + "\t" + (this.h == null ? "" : this.h) + "\t" + this.k;
    }
}
