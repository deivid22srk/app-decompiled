package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public static class LogOptions implements SafeParcelable {
    public static final Parcelable.Creator<LogOptions> CREATOR = new e();

    /* renamed from: a, reason: collision with root package name */
    public final int f5802a;

    /* renamed from: b, reason: collision with root package name */
    public String f5803b;
    public boolean c;

    LogOptions(int i, String str, boolean z) {
        this.f5802a = i;
        this.f5803b = str;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        e.a(this, parcel);
    }
}
