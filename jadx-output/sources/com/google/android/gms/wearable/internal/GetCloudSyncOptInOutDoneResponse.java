package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public class GetCloudSyncOptInOutDoneResponse implements SafeParcelable {
    public static final Parcelable.Creator<GetCloudSyncOptInOutDoneResponse> CREATOR = new n();

    /* renamed from: a, reason: collision with root package name */
    public final int f6526a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6527b;
    public final boolean c;

    GetCloudSyncOptInOutDoneResponse(int i, int i2, boolean z) {
        this.f6526a = i;
        this.f6527b = i2;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        n.a(this, parcel);
    }
}
