package com.google.android.wallet.ui.card;

import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.wallet.ui.common.FormEditText;
import com.google.android.wallet.ui.creditcard.CreditCardNumberEditText;

/* loaded from: classes.dex */
public final class q extends com.google.android.wallet.ui.common.b.a implements com.google.android.wallet.ui.common.f {

    /* renamed from: a, reason: collision with root package name */
    private final FormEditText f7434a;
    private final CreditCardNumberEditText c;
    private final int d;
    private final int e;

    public q(FormEditText formEditText, CreditCardNumberEditText creditCardNumberEditText) {
        this.f7434a = formEditText;
        this.c = creditCardNumberEditText;
        this.d = -1;
        this.e = 4;
    }

    public q(FormEditText formEditText, int i) {
        this.f7434a = formEditText;
        this.c = null;
        this.d = i;
        this.e = i;
    }

    private boolean c() {
        if (TextUtils.isEmpty(this.f7434a.getText())) {
            return false;
        }
        if (this.d != -1) {
            return this.f7434a.getText().length() == this.d;
        }
        com.google.b.a.a.a.b.a.a.b.a.m cardType = this.c.getCardType();
        return cardType != null && this.f7434a.getText().length() == cardType.c;
    }

    @Override // com.google.android.wallet.ui.common.b.a
    public final boolean a(TextView textView) {
        if (TextUtils.isEmpty(textView.getText())) {
            this.f7497b = null;
            return true;
        }
        if (!c()) {
            this.f7497b = textView.getContext().getString(com.google.android.wallet.e.j.wallet_uic_error_cvc_invalid);
            return false;
        }
        this.f7497b = null;
        return true;
    }

    @Override // com.google.android.wallet.ui.common.f
    public final boolean ah_() {
        return c() || this.f7434a.getText().length() == this.e;
    }
}
