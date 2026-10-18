package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public static class SafeBrowsingData implements SafeParcelable {
    public static final Parcelable.Creator<SafeBrowsingData> CREATOR = new h();

    /* renamed from: a, reason: collision with root package name */
    public final int f6438a;

    /* renamed from: b, reason: collision with root package name */
    String f6439b;

    SafeBrowsingData(int i, String str) {
        this.f6438a = i;
        this.f6439b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.a(this, parcel);
    }
}
