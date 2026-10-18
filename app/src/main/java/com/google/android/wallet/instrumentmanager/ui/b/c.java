package com.google.android.wallet.instrumentmanager.ui.b;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.wallet.analytics.CreditCardEntryAction;

/* loaded from: classes.dex */
final class c implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f7332a;

    c(a aVar) {
        this.f7332a = aVar;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        CreditCardEntryAction creditCardEntryAction;
        CreditCardEntryAction creditCardEntryAction2;
        creditCardEntryAction = this.f7332a.aD;
        if (creditCardEntryAction.f7233b != 1) {
            creditCardEntryAction2 = this.f7332a.aD;
            creditCardEntryAction2.f7233b = 1;
            this.f7332a.J();
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }
}
