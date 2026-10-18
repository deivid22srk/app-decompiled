package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public class RecoveryWriteResponse implements SafeParcelable {
    public static final i CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    final int f5370a;

    /* renamed from: b, reason: collision with root package name */
    public String f5371b;

    public RecoveryWriteResponse() {
        this.f5370a = 1;
    }

    RecoveryWriteResponse(int i, String str) {
        this.f5370a = i;
        this.f5371b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        com.google.android.gms.auth.i.a(this, parcel);
    }
}
