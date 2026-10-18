package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public static class DataItemAssetParcelable implements SafeParcelable, com.google.android.gms.wearable.m {
    public static final Parcelable.Creator<DataItemAssetParcelable> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    final int f6510a;

    /* renamed from: b, reason: collision with root package name */
    final String f6511b;
    final String c;

    DataItemAssetParcelable(int i, String str, String str2) {
        this.f6510a = i;
        this.f6511b = str;
        this.c = str2;
    }

    public DataItemAssetParcelable(com.google.android.gms.wearable.m mVar) {
        this.f6510a = 1;
        this.f6511b = (String) com.google.android.gms.common.internal.av.a(mVar.b());
        this.c = (String) com.google.android.gms.common.internal.av.a(mVar.c());
    }

    @Override // com.google.android.gms.common.data.f
    public final /* synthetic */ com.google.android.gms.wearable.m a() {
        return this;
    }

    @Override // com.google.android.gms.wearable.m
    public final String b() {
        return this.f6511b;
    }

    @Override // com.google.android.gms.wearable.m
    public final String c() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DataItemAssetParcelable[");
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.f6511b == null) {
            sb.append(",noid");
        } else {
            sb.append(",");
            sb.append(this.f6511b);
        }
        sb.append(", key=");
        sb.append(this.c);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        c.a(this, parcel);
    }
}
