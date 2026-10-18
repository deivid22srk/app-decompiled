package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public class RecoveryWriteRequest implements SafeParcelable {
    public static final h CREATOR = new h();

    /* renamed from: a, reason: collision with root package name */
    final int f5368a;

    /* renamed from: b, reason: collision with root package name */
    public String f5369b;
    public String c;
    public String d;
    public String e;
    public boolean f;

    public RecoveryWriteRequest() {
        this.f5368a = 1;
    }

    RecoveryWriteRequest(int i, String str, String str2, String str3, String str4, boolean z) {
        this.f5368a = i;
        this.f5369b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
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
