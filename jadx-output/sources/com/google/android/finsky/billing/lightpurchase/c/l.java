package com.google.android.finsky.billing.lightpurchase.c;

import android.text.Editable;
import android.text.TextWatcher;

/* loaded from: classes.dex */
final class l implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f2362a;

    l(k kVar) {
        this.f2362a = kVar;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f2362a.y();
    }
}
