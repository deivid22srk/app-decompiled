package com.google.android.gms.people.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.at;
import com.google.android.gms.common.internal.av;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public final class AvatarReference implements SafeParcelable {
    public static final d CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    final int f6429a;

    /* renamed from: b, reason: collision with root package name */
    final int f6430b;
    final String c;

    AvatarReference(int i, int i2, String str) {
        av.a(i2 != 0);
        this.f6429a = i;
        this.f6430b = i2;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return at.a(this).a("source", Integer.valueOf(this.f6430b)).a("location", this.c).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        d.a(this, parcel);
    }
}
