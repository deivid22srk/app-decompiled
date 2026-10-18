package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public static class ValidateAccountRequest implements SafeParcelable {
    public static final Parcelable.Creator<ValidateAccountRequest> CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    final int f5692a;

    /* renamed from: b, reason: collision with root package name */
    final int f5693b;
    final IBinder c;
    final Scope[] d;
    final Bundle e;
    final String f;

    ValidateAccountRequest(int i, int i2, IBinder iBinder, Scope[] scopeArr, Bundle bundle, String str) {
        this.f5692a = i;
        this.f5693b = i2;
        this.c = iBinder;
        this.d = scopeArr;
        this.e = bundle;
        this.f = str;
    }

    public ValidateAccountRequest(ad adVar, Scope[] scopeArr, String str) {
        this(1, com.google.android.gms.common.b.f5588a, adVar == null ? null : adVar.asBinder(), scopeArr, null, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        d.a(this, parcel, i);
    }
}
