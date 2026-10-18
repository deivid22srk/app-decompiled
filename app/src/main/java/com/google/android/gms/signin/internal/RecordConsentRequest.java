package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public class RecordConsentRequest implements SafeParcelable {
    public static final Parcelable.Creator<RecordConsentRequest> CREATOR = new l();

    /* renamed from: a, reason: collision with root package name */
    final int f6446a;

    /* renamed from: b, reason: collision with root package name */
    final Account f6447b;
    final Scope[] c;
    final String d;

    RecordConsentRequest(int i, Account account, Scope[] scopeArr, String str) {
        this.f6446a = i;
        this.f6447b = account;
        this.c = scopeArr;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        l.a(this, parcel, i);
    }
}
