package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public final class EventParcel implements SafeParcelable {
    public static final r CREATOR = new r();

    /* renamed from: a, reason: collision with root package name */
    public final int f6283a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6284b;
    public final EventParams c;
    public final String d;
    public final long e;

    EventParcel(int i, String str, EventParams eventParams, String str2, long j) {
        this.f6283a = i;
        this.f6284b = str;
        this.c = eventParams;
        this.d = str2;
        this.e = j;
    }

    public EventParcel(String str, EventParams eventParams, String str2, long j) {
        this.f6283a = 1;
        this.f6284b = str;
        this.c = eventParams;
        this.d = str2;
        this.e = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "origin=" + this.d + ",name=" + this.f6284b + ",params=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        r.a(this, parcel, i);
    }
}
