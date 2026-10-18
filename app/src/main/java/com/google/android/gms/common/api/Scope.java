package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.av;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public static final class Scope implements SafeParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new ad();

    /* renamed from: a, reason: collision with root package name */
    final int f5570a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5571b;

    Scope(int i, String str) {
        av.a(str, (Object) "scopeUri must not be null or empty");
        this.f5570a = i;
        this.f5571b = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f5571b.equals(((Scope) obj).f5571b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5571b.hashCode();
    }

    public final String toString() {
        return this.f5571b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ad.a(this, parcel);
    }
}
