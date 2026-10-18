package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public static class GetServiceRequest implements SafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    final int f5686a;

    /* renamed from: b, reason: collision with root package name */
    final int f5687b;
    int c;
    String d;
    IBinder e;
    Scope[] f;
    Bundle g;
    Account h;

    public GetServiceRequest(int i) {
        this.f5686a = 2;
        this.c = com.google.android.gms.common.b.f5588a;
        this.f5687b = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        k.a(this, parcel, i);
    }

    GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account) {
        this.f5686a = i;
        this.f5687b = i2;
        this.c = i3;
        this.d = str;
        if (i < 2) {
            this.h = iBinder != null ? b.a(ae.a(iBinder)) : null;
        } else {
            this.e = iBinder;
            this.h = account;
        }
        this.f = scopeArr;
        this.g = bundle;
    }
}
