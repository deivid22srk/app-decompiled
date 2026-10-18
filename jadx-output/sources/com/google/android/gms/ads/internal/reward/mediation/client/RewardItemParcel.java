package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gw;

@gw
/* loaded from: classes.dex */
public final class RewardItemParcel implements SafeParcelable {
    public static final d CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    public final int f5348a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5349b;
    public final int c;

    public RewardItemParcel(int i, String str, int i2) {
        this.f5348a = i;
        this.f5349b = str;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        d.a(this, parcel);
    }
}
