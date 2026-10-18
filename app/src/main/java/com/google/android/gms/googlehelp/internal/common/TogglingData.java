package com.google.android.gms.googlehelp.internal.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public static class TogglingData implements SafeParcelable {
    public static final Parcelable.Creator<TogglingData> CREATOR = new ag();

    /* renamed from: a, reason: collision with root package name */
    final int f5824a;

    /* renamed from: b, reason: collision with root package name */
    String f5825b;
    String c;
    String d;

    private TogglingData() {
        this.f5824a = 1;
    }

    TogglingData(int i, String str, String str2, String str3) {
        this.f5824a = i;
        this.f5825b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ag.a(this, parcel);
    }
}
