package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public static class CapabilityInfoParcelable implements SafeParcelable {
    public static final Parcelable.Creator<CapabilityInfoParcelable> CREATOR = new cv();

    /* renamed from: a, reason: collision with root package name */
    final int f6498a;

    /* renamed from: b, reason: collision with root package name */
    final String f6499b;
    final List<NodeParcelable> c;
    private final Object d = new Object();
    private Set<Object> e = null;

    CapabilityInfoParcelable(int i, String str, List<NodeParcelable> list) {
        this.f6498a = i;
        this.f6499b = str;
        this.c = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CapabilityInfoParcelable capabilityInfoParcelable = (CapabilityInfoParcelable) obj;
        if (this.f6498a != capabilityInfoParcelable.f6498a) {
            return false;
        }
        if (this.f6499b == null ? capabilityInfoParcelable.f6499b != null : !this.f6499b.equals(capabilityInfoParcelable.f6499b)) {
            return false;
        }
        if (this.c != null) {
            if (this.c.equals(capabilityInfoParcelable.c)) {
                return true;
            }
        } else if (capabilityInfoParcelable.c == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f6499b != null ? this.f6499b.hashCode() : 0) + (this.f6498a * 31)) * 31) + (this.c != null ? this.c.hashCode() : 0);
    }

    public String toString() {
        return "CapabilityInfo{" + this.f6499b + ", " + this.c + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        cv.a(this, parcel);
    }
}
