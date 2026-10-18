package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gw;

@gw
/* loaded from: classes.dex */
public final class VersionInfoParcel implements SafeParcelable {
    public static final c CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    public final int f5351a;

    /* renamed from: b, reason: collision with root package name */
    public String f5352b;
    public int c;
    public int d;
    public boolean e;

    VersionInfoParcel(int i, String str, int i2, int i3, boolean z) {
        this.f5351a = i;
        this.f5352b = str;
        this.c = i2;
        this.d = i3;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        com.google.android.gms.ads.internal.util.client.c.a(this, parcel);
    }
}
