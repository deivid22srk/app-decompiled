package com.google.android.gms.common.server;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public class FavaDiagnosticsEntity implements SafeParcelable {
    public static final a CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final int f5771a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5772b;
    public final int c;

    public FavaDiagnosticsEntity(int i, String str, int i2) {
        this.f5771a = i;
        this.f5772b = str;
        this.c = i2;
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
