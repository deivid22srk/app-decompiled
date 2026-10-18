package com.google.android.finsky.activities;

import android.accounts.Account;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.gn;

/* loaded from: classes.dex */
public class gn<T extends gn> {

    /* renamed from: a, reason: collision with root package name */
    private Bundle f1777a = new Bundle();

    /* renamed from: b, reason: collision with root package name */
    private Fragment f1778b = null;

    public final T a(int i) {
        this.f1777a.putInt("message_id", i);
        return this;
    }

    public final T a(String str) {
        this.f1777a.putString("message", str);
        return this;
    }

    public final T b(String str) {
        this.f1777a.putString("messageHtml", str);
        return this;
    }

    public final T b(int i) {
        this.f1777a.putInt("layoutId", i);
        return this;
    }

    public final T c(int i) {
        this.f1777a.putInt("title_id", i);
        return this;
    }

    public final T c(String str) {
        this.f1777a.putString("title", str);
        return this;
    }

    public final T d(int i) {
        this.f1777a.putInt("positive_id", i);
        return this;
    }

    public final T e(int i) {
        this.f1777a.putInt("negative_id", i);
        return this;
    }

    public final T a(boolean z) {
        this.f1777a.putBoolean("cancel_on_touch_outside", z);
        return this;
    }

    public final T c() {
        this.f1777a.putBoolean("cancel_does_negative_action", false);
        return this;
    }

    public final T a(Bundle bundle) {
        this.f1777a.putBundle("config_arguments", bundle);
        return this;
    }

    public final T a(int i, byte[] bArr, int i2, int i3, Account account) {
        if (account == null) {
            account = FinskyApp.a().i();
        }
        this.f1777a.putParcelable("log_account", account);
        this.f1777a.putInt("impression_type", i);
        this.f1777a.putByteArray("impression_cookie", bArr);
        this.f1777a.putInt("click_event_type_positive", i2);
        this.f1777a.putInt("click_event_type_negative", i3);
        return this;
    }

    public final T a(Fragment fragment, int i, Bundle bundle) {
        this.f1778b = fragment;
        if (bundle != null || i != 0) {
            this.f1777a.putBundle("extra_arguments", bundle);
            this.f1777a.putInt("target_request_code", i);
        }
        return this;
    }

    public gj b() {
        gj gjVar = new gj();
        a(gjVar);
        return gjVar;
    }

    public final void a(gj gjVar) {
        gjVar.f(this.f1777a);
        if (this.f1778b != null) {
            gjVar.a(this.f1778b, 0);
        }
    }
}
