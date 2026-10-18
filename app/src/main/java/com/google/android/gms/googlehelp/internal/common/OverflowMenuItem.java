package com.google.android.gms.googlehelp.internal.common;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public final class OverflowMenuItem implements SafeParcelable {
    public static final Parcelable.Creator<OverflowMenuItem> CREATOR = new aa();

    /* renamed from: a, reason: collision with root package name */
    final int f5822a;

    /* renamed from: b, reason: collision with root package name */
    final int f5823b;
    final String c;
    final Intent d;

    OverflowMenuItem(int i, int i2, String str, Intent intent) {
        this.f5822a = i;
        this.f5823b = i2;
        this.c = str;
        this.d = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        aa.a(this, parcel, i);
    }
}
