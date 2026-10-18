package com.google.android.finsky.billing.lightpurchase.a;

import android.text.Editable;
import android.text.TextWatcher;

/* loaded from: classes.dex */
final class p implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o f2303a;

    p(o oVar) {
        this.f2303a = oVar;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f2303a.v();
    }
}
