package com.google.android.gms.people.identity.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.at;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public final class ParcelableListOptions implements SafeParcelable {
    public static final h CREATOR = new h();

    /* renamed from: a, reason: collision with root package name */
    final int f6402a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f6403b;
    final boolean c;
    final String d;
    final boolean e;
    final Bundle f;

    ParcelableListOptions(int i, boolean z, boolean z2, boolean z3, String str, Bundle bundle) {
        this.f6402a = i;
        this.f6403b = z;
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
        return at.a(this).a("useOfflineDatabase", Boolean.valueOf(this.f6403b)).a("useWebData", Boolean.valueOf(this.c)).a("useCP2", Boolean.valueOf(this.e)).a("endpoint", this.d).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        h.a(this, parcel);
    }
}
