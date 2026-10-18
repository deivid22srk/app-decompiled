package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public static class PutDataRequest implements SafeParcelable {
    public static final Parcelable.Creator<PutDataRequest> CREATOR = new av();
    private static final long f = TimeUnit.MINUTES.toMillis(30);
    private static final Random g = new SecureRandom();

    /* renamed from: a, reason: collision with root package name */
    final int f6460a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f6461b;
    final Bundle c;
    public byte[] d;
    public long e;

    PutDataRequest(int i, Uri uri, Bundle bundle, byte[] bArr, long j) {
        this.f6460a = i;
        this.f6461b = uri;
        this.c = bundle;
        this.c.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        this.d = bArr;
        this.e = j;
    }

    private PutDataRequest(Uri uri) {
        this(2, uri, new Bundle(), null, f);
    }

    public static PutDataRequest a(Uri uri) {
        return new PutDataRequest(uri);
    }

    public final PutDataRequest a(String str, Asset asset) {
        com.google.android.gms.common.internal.av.a(str);
        com.google.android.gms.common.internal.av.a(asset);
        this.c.putParcelable(str, asset);
        return this;
    }

    public final Map<String, Asset> a() {
        HashMap hashMap = new HashMap();
        for (String str : this.c.keySet()) {
            hashMap.put(str, (Asset) this.c.getParcelable(str));
        }
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        av.a(this, parcel, i);
    }

    public static PutDataRequest a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("An empty path was supplied.");
        }
        if (!str.startsWith("/")) {
            throw new IllegalArgumentException("A path must start with a single / .");
        }
        if (str.startsWith("//")) {
            throw new IllegalArgumentException("A path must start with a single / .");
        }
        return a(new Uri.Builder().scheme("wear").path(str).build());
    }

    public String toString() {
        boolean isLoggable = Log.isLoggable("DataMap", 3);
        StringBuilder sb = new StringBuilder("PutDataRequest[");
        sb.append("dataSz=" + (this.d == null ? "null" : Integer.valueOf(this.d.length)));
        sb.append(", numAssets=" + this.c.size());
        sb.append(", uri=" + this.f6461b);
        sb.append(", syncDeadline=" + this.e);
        if (!isLoggable) {
            sb.append("]");
            return sb.toString();
        }
        sb.append("]\n  assets: ");
        for (String str : this.c.keySet()) {
            sb.append("\n    " + str + ": " + this.c.getParcelable(str));
        }
        sb.append("\n  ]");
        return sb.toString();
    }
}
