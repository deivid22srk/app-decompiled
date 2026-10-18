package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public static class AttestationData implements SafeParcelable {
    public static final Parcelable.Creator<AttestationData> CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    public final int f6436a;

    /* renamed from: b, reason: collision with root package name */
    String f6437b;

    AttestationData(int i, String str) {
        this.f6436a = i;
        this.f6437b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        g.a(this, parcel);
    }
}
