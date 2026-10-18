package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public static class DataItemParcelable implements SafeParcelable, com.google.android.gms.wearable.l {
    public static final Parcelable.Creator<DataItemParcelable> CREATOR = new f();

    /* renamed from: a, reason: collision with root package name */
    final int f6512a;

    /* renamed from: b, reason: collision with root package name */
    final Uri f6513b;
    final Map<String, com.google.android.gms.wearable.m> c;
    byte[] d;

    DataItemParcelable(int i, Uri uri, Bundle bundle, byte[] bArr) {
        this.f6512a = i;
        this.f6513b = uri;
        HashMap hashMap = new HashMap();
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        for (String str : bundle.keySet()) {
            hashMap.put(str, (DataItemAssetParcelable) bundle.getParcelable(str));
        }
        this.c = hashMap;
        this.d = bArr;
    }

    @Override // com.google.android.gms.common.data.f
    public final /* synthetic */ com.google.android.gms.wearable.l a() {
        return this;
    }

    @Override // com.google.android.gms.wearable.l
    public final Uri b() {
        return this.f6513b;
    }

    @Override // com.google.android.gms.wearable.l
    public final byte[] c() {
        return this.d;
    }

    @Override // com.google.android.gms.wearable.l
    public final Map<String, com.google.android.gms.wearable.m> d() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        f.a(this, parcel, i);
    }

    public String toString() {
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb = new StringBuilder("DataItemParcelable[");
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(",dataSz=" + (this.d == null ? "null" : Integer.valueOf(this.d.length)));
        sb.append(", numAssets=" + this.c.size());
        sb.append(", uri=" + this.f6513b);
        if (!isLoggable) {
            sb.append("]");
            return sb.toString();
        }
        sb.append("]\n  assets: ");
        for (String str : this.c.keySet()) {
            sb.append("\n    " + str + ": " + this.c.get(str));
        }
        sb.append("\n  ]");
        return sb.toString();
    }
}
