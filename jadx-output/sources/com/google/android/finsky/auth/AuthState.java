package com.google.android.finsky.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.vending.R;
import com.google.android.finsky.a.o;

/* loaded from: classes.dex */
public class AuthState implements Parcelable {
    public static final Parcelable.Creator<AuthState> CREATOR = new e();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2013a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2014b;
    private final String c;
    private final boolean d;
    private final String e;

    public AuthState(boolean z, String str, boolean z2, boolean z3, String str2) {
        this.f2013a = z;
        this.c = str;
        this.f2014b = z2 && a.a(str2);
        this.d = z3;
        this.e = str2;
    }

    public final int a() {
        if (this.f2014b) {
            return 3;
        }
        if (this.f2013a) {
            return 2;
        }
        return 1;
    }

    public final o b() {
        int i;
        if (this.f2014b) {
            i = 3;
        } else {
            i = this.f2013a ? 2 : 1;
        }
        o oVar = new o();
        oVar.f1492a = i;
        oVar.f1493b = true;
        if (this.d) {
            oVar.c = 1;
        }
        return oVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2013a ? 1 : 0);
        parcel.writeString(this.c);
        parcel.writeInt(this.f2014b ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.e);
    }

    public final int c() {
        if (this.f2014b) {
            return R.string.fingerprint_title;
        }
        if (this.f2013a) {
            return R.string.pin_dialog_title;
        }
        return R.string.password_dialog_title;
    }

    public final String a(String str) {
        if (this.f2014b) {
            throw new IllegalStateException("Call for fingerprint is not supported");
        }
        return this.f2013a ? this.c : com.google.android.finsky.c.d.cQ.b().replace("%email%", str);
    }

    public final int d() {
        if (this.f2014b) {
            throw new IllegalStateException("Call for fingerprint is not supported");
        }
        return this.f2013a ? R.string.recover_pin_help_text : R.string.password_help_text;
    }

    public final int e() {
        if (this.f2014b) {
            throw new IllegalStateException("Call for fingerprint is not supported");
        }
        return this.f2013a ? R.string.invalid_account_pin_max_attempts_exceeded : R.string.invalid_account_password_max_attempts_exceeded;
    }
}
