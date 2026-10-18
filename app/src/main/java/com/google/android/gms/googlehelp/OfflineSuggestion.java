package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public static final class OfflineSuggestion implements SafeParcelable {
    public static final Parcelable.Creator<OfflineSuggestion> CREATOR = new m();

    /* renamed from: a, reason: collision with root package name */
    final int f5810a;

    /* renamed from: b, reason: collision with root package name */
    final String f5811b;
    final String c;
    final String d;
    final String e;

    OfflineSuggestion(int i, String str, String str2, String str3, String str4) {
        this.f5810a = i;
        this.f5811b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        m.a(this, parcel);
    }
}
