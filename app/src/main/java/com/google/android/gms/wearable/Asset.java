package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public static class Asset implements SafeParcelable {
    public static final Parcelable.Creator<Asset> CREATOR = new at();

    /* renamed from: a, reason: collision with root package name */
    final int f6456a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f6457b;
    public String c;
    public ParcelFileDescriptor d;
    public Uri e;

    Asset(int i, byte[] bArr, String str, ParcelFileDescriptor parcelFileDescriptor, Uri uri) {
        this.f6456a = i;
        this.f6457b = bArr;
        this.c = str;
        this.d = parcelFileDescriptor;
        this.e = uri;
    }

    public static Asset a(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor == null) {
            throw new IllegalArgumentException("Asset fd cannot be null");
        }
        return new Asset(1, null, null, parcelFileDescriptor, null);
    }

    public static Asset a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Asset digest cannot be null");
        }
        return new Asset(1, null, str, null, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Asset)) {
            return false;
        }
        Asset asset = (Asset) obj;
        return com.google.android.gms.common.internal.at.a(this.f6457b, asset.f6457b) && com.google.android.gms.common.internal.at.a(this.c, asset.c) && com.google.android.gms.common.internal.at.a(this.d, asset.d) && com.google.android.gms.common.internal.at.a(this.e, asset.e);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Asset[@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.c == null) {
            sb.append(", nodigest");
        } else {
            sb.append(", ");
            sb.append(this.c);
        }
        if (this.f6457b != null) {
            sb.append(", size=");
            sb.append(this.f6457b.length);
        }
        if (this.d != null) {
            sb.append(", fd=");
            sb.append(this.d);
        }
        if (this.e != null) {
            sb.append(", uri=");
            sb.append(this.e);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        at.a(this, parcel, i | 1);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6457b, this.c, this.d, this.e});
    }
}
