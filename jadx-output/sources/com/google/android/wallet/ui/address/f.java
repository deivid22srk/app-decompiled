package com.google.android.wallet.ui.address;

import android.text.Editable;
import android.text.TextWatcher;

/* loaded from: classes.dex */
final class f implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f7382a;

    f(b bVar) {
        this.f7382a = bVar;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        q qVar;
        q qVar2;
        qVar = this.f7382a.at;
        if (qVar != null) {
            qVar2 = this.f7382a.at;
            editable.toString();
            qVar2.x();
        }
    }
}
