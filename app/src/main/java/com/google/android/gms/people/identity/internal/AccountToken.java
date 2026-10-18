package com.google.android.gms.people.identity.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public final class AccountToken implements SafeParcelable {
    public static final a CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final int f6398a;

    /* renamed from: b, reason: collision with root package name */
    final String f6399b;
    final String c;

    AccountToken(int i, String str, String str2) {
        this.f6398a = i;
        this.f6399b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel);
    }
}
