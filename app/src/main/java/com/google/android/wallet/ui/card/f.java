package com.google.android.wallet.ui.card;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.wallet.analytics.CreditCardEntryAction;

/* loaded from: classes.dex */
final class f implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f7424a;

    f(a aVar) {
        this.f7424a = aVar;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        CreditCardEntryAction creditCardEntryAction;
        CreditCardEntryAction creditCardEntryAction2;
        creditCardEntryAction = this.f7424a.aR;
        if (creditCardEntryAction.g != 1) {
            creditCardEntryAction2 = this.f7424a.aR;
            creditCardEntryAction2.g = 1;
            this.f7424a.J();
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }
}
