package com.google.android.gms.ads.internal.formats;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gw;

@gw
/* loaded from: classes.dex */
public class NativeAdOptionsParcel implements SafeParcelable {
    public static final a CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f5314a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5315b;
    public final int c;
    public final boolean d;

    public NativeAdOptionsParcel(int i, boolean z, int i2, boolean z2) {
        this.f5314a = i;
        this.f5315b = z;
        this.c = i2;
        this.d = z2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel);
    }
}
