package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public static class ConnectionConfiguration implements SafeParcelable {
    public static final Parcelable.Creator<ConnectionConfiguration> CREATOR = new au();

    /* renamed from: a, reason: collision with root package name */
    final int f6458a;

    /* renamed from: b, reason: collision with root package name */
    final String f6459b;
    final String c;
    final int d;
    final int e;
    final boolean f;
    boolean g;
    String h;
    boolean i;
    String j;

    ConnectionConfiguration(int i, String str, String str2, int i2, int i3, boolean z, boolean z2, String str3, boolean z3, String str4) {
        this.f6458a = i;
        this.f6459b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = z;
        this.g = z2;
        this.h = str3;
        this.i = z3;
        this.j = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ConnectionConfiguration)) {
            return false;
        }
        ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
        return com.google.android.gms.common.internal.at.a(Integer.valueOf(this.f6458a), Integer.valueOf(connectionConfiguration.f6458a)) && com.google.android.gms.common.internal.at.a(this.f6459b, connectionConfiguration.f6459b) && com.google.android.gms.common.internal.at.a(this.c, connectionConfiguration.c) && com.google.android.gms.common.internal.at.a(Integer.valueOf(this.d), Integer.valueOf(connectionConfiguration.d)) && com.google.android.gms.common.internal.at.a(Integer.valueOf(this.e), Integer.valueOf(connectionConfiguration.e)) && com.google.android.gms.common.internal.at.a(Boolean.valueOf(this.f), Boolean.valueOf(connectionConfiguration.f)) && com.google.android.gms.common.internal.at.a(Boolean.valueOf(this.i), Boolean.valueOf(connectionConfiguration.i));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConnectionConfiguration[ ");
        sb.append("mName=" + this.f6459b);
        sb.append(", mAddress=" + this.c);
        sb.append(", mType=" + this.d);
        sb.append(", mRole=" + this.e);
        sb.append(", mEnabled=" + this.f);
        sb.append(", mIsConnected=" + this.g);
        sb.append(", mPeerNodeId=" + this.h);
        sb.append(", mBtlePriority=" + this.i);
        sb.append(", mNodeId=" + this.j);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        au.a(this, parcel);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6458a), this.f6459b, this.c, Integer.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.i)});
    }
}
