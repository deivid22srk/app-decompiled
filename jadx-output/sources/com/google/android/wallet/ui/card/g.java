package com.google.android.wallet.ui.card;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.wallet.analytics.CreditCardEntryAction;

/* loaded from: classes.dex */
final class g implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f7425a;

    g(a aVar) {
        this.f7425a = aVar;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        CreditCardEntryAction creditCardEntryAction;
        CreditCardEntryAction creditCardEntryAction2;
        creditCardEntryAction = this.f7425a.aR;
        if (creditCardEntryAction.l != 1) {
            creditCardEntryAction2 = this.f7425a.aR;
            creditCardEntryAction2.l = 1;
            this.f7425a.J();
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }
}
