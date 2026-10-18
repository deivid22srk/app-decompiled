package com.google.android.finsky.activities;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.Button;

/* loaded from: classes.dex */
final class dg implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Button f1682a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ de f1683b;

    dg(de deVar, Button button) {
        this.f1683b = deVar;
        this.f1682a = button;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        this.f1683b.ai = editable == null ? null : editable.toString();
        Button button = this.f1682a;
        str = this.f1683b.ai;
        button.setEnabled(!TextUtils.isEmpty(str));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
