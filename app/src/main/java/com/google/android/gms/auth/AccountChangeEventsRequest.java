package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public static class AccountChangeEventsRequest implements SafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsRequest> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    final int f5357a;

    /* renamed from: b, reason: collision with root package name */
    int f5358b;

    @Deprecated
    String c;
    Account d;

    public AccountChangeEventsRequest() {
        this.f5357a = 1;
    }

    AccountChangeEventsRequest(int i, int i2, String str, Account account) {
        this.f5357a = i;
        this.f5358b = i2;
        this.c = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.d = account;
        } else {
            this.d = new Account(str, "com.google");
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        k.a(this, parcel, i);
    }
}
