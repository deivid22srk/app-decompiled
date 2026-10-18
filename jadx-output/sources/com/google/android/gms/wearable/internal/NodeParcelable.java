package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public class NodeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<NodeParcelable> CREATOR = new be();

    /* renamed from: a, reason: collision with root package name */
    final int f6562a;

    /* renamed from: b, reason: collision with root package name */
    final String f6563b;
    final String c;
    final int d;
    final boolean e;

    NodeParcelable(int i, String str, String str2, int i2, boolean z) {
        this.f6562a = i;
        this.f6563b = str;
        this.c = str2;
        this.d = i2;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof NodeParcelable) {
            return ((NodeParcelable) obj).f6563b.equals(this.f6563b);
        }
        return false;
    }

    public int hashCode() {
        return this.f6563b.hashCode();
    }

    public String toString() {
        return "Node{" + this.c + ", id=" + this.f6563b + ", hops=" + this.d + ", isNearby=" + this.e + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        be.a(this, parcel);
    }
}
