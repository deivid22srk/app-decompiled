package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public class ResolveAccountRequest implements SafeParcelable {
    public static final Parcelable.Creator<ResolveAccountRequest> CREATOR = new aw();

    /* renamed from: a, reason: collision with root package name */
    final int f5688a;

    /* renamed from: b, reason: collision with root package name */
    final Account f5689b;
    final int c;
    final GoogleSignInAccount d;

    ResolveAccountRequest(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f5688a = i;
        this.f5689b = account;
        this.c = i2;
        this.d = googleSignInAccount;
    }

    public ResolveAccountRequest(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        aw.a(this, parcel, i);
    }
}
