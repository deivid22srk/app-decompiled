package com.google.android.wallet.ui.common.bpkg;

import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f7497b;

    public abstract boolean a(TextView textView);

    public a(CharSequence charSequence) {
        this.f7497b = charSequence;
    }

    public a() {
        this(null);
    }

    public CharSequence a() {
        return this.f7497b;
    }
}
