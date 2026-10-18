package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public class LargeAssetSyncRequestPayload implements SafeParcelable {
    public static final Parcelable.Creator<LargeAssetSyncRequestPayload> CREATOR = new ax();

    /* renamed from: a, reason: collision with root package name */
    final int f6558a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6559b;
    public final long c;

    public LargeAssetSyncRequestPayload(int i, String str, long j) {
        this.f6558a = i;
        this.f6559b = (String) com.google.android.gms.common.internal.av.a(str, (Object) "path");
        this.c = j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "LargeAssetSyncRequestPayload{path='" + this.f6559b + "', offset=" + this.c + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ax.a(this, parcel);
    }
}
