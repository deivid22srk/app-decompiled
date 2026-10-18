package com.google.android.wallet.ui.common;

import android.text.Editable;
import android.text.TextWatcher;

/* loaded from: classes.dex */
final class ac implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FormEditText f7476a;

    ac(FormEditText formEditText) {
        this.f7476a = formEditText;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        com.google.android.wallet.ui.common.bpkg.c cVar;
        com.google.android.wallet.ui.common.bpkg.c cVar2;
        com.google.android.wallet.ui.common.bpkg.c cVar3;
        cVar = this.f7476a.c;
        if (!cVar.a(this.f7476a)) {
            cVar2 = this.f7476a.c;
            if (cVar2.a() != null) {
                FormEditText formEditText = this.f7476a;
                cVar3 = this.f7476a.c;
                formEditText.setError(cVar3.a());
                return;
            }
        }
        if (this.f7476a.isFocused() && editable != null && this.f7476a.getError() != null) {
            this.f7476a.setError(null);
            this.f7476a.A = null;
        }
    }
}
