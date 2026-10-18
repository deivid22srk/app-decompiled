package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.x;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public class AuthAccountResult implements x, SafeParcelable {
    public static final Parcelable.Creator<AuthAccountResult> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final int f6442a;

    /* renamed from: b, reason: collision with root package name */
    int f6443b;
    Intent c;

    public AuthAccountResult() {
        this(0);
    }

    public AuthAccountResult(int i) {
        this(2, i, null);
    }

    AuthAccountResult(int i, int i2, Intent intent) {
        this.f6442a = i;
        this.f6443b = i2;
        this.c = intent;
    }

    @Override // com.google.android.gms.common.api.x
    public final Status b() {
        return this.f6443b == 0 ? Status.f5572a : Status.e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel, i);
    }
}
