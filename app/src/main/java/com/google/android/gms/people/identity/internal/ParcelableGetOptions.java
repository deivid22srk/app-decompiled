package com.google.android.gms.people.identity.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.at;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public final class ParcelableGetOptions implements SafeParcelable {
    public static final g CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    final int f6400a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f6401b;
    final boolean c;
    final String d;
    final boolean e;
    final Bundle f;

    ParcelableGetOptions(int i, boolean z, boolean z2, boolean z3, String str, Bundle bundle) {
        this.f6400a = i;
        this.f6401b = z;
        this.c = z2;
        this.d = str;
        this.e = z3;
        this.f = bundle == null ? new Bundle() : bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return at.a(this).a("useOfflineDatabase", Boolean.valueOf(this.f6401b)).a("useWebData", Boolean.valueOf(this.c)).a("endpoint", this.d).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        g.a(this, parcel);
    }
}
