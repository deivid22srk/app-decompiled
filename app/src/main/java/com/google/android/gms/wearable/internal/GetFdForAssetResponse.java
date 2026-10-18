package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public class GetFdForAssetResponse implements SafeParcelable {
    public static final Parcelable.Creator<GetFdForAssetResponse> CREATOR = new u();

    /* renamed from: a, reason: collision with root package name */
    public final int f6540a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6541b;
    public final ParcelFileDescriptor c;

    GetFdForAssetResponse(int i, int i2, ParcelFileDescriptor parcelFileDescriptor) {
        this.f6540a = i;
        this.f6541b = i2;
        this.c = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        u.a(this, parcel, i | 1);
    }
}
