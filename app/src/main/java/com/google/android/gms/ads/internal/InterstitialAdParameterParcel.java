package com.google.android.gms.ads.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gw;

@gw
/* loaded from: classes.dex */
public final class InterstitialAdParameterParcel implements SafeParcelable {
    public static final c CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    public final int f5280a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5281b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final float f;

    InterstitialAdParameterParcel(int i, boolean z, boolean z2, String str, boolean z3, float f) {
        this.f5280a = i;
        this.f5281b = z;
        this.c = z2;
        this.d = str;
        this.e = z3;
        this.f = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        c.a(this, parcel);
    }
}
