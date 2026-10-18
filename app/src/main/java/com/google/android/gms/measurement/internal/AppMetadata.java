package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public class AppMetadata implements SafeParcelable {
    public static final h CREATOR = new h();

    /* renamed from: a, reason: collision with root package name */
    public final int f6279a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6280b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final String h;
    public final boolean i;

    AppMetadata(int i, String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z) {
        this.f6279a = i;
        this.f6280b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = j;
        this.g = j2;
        this.h = str5;
        if (i >= 3) {
            this.i = z;
        } else {
            this.i = true;
        }
    }

    AppMetadata(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z) {
        com.google.android.gms.common.internal.av.a(str);
        this.f6279a = 3;
        this.f6280b = str;
        this.c = TextUtils.isEmpty(str2) ? null : str2;
        this.d = str3;
        this.e = str4;
        this.f = j;
        this.g = j2;
        this.h = str5;
        this.i = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.a(this, parcel);
    }
}
