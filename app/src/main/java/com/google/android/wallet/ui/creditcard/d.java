package com.google.android.wallet.ui.creditcard;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.wallet.common.util.i;
import com.google.b.a.a.a.b.a.apkg.bpkg.apkg.m;
import java.util.ArrayList;

/* loaded from: classes2.dex */
final class d implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CreditCardNumberEditText f7539a;

    d(CreditCardNumberEditText creditCardNumberEditText) {
        this.f7539a = creditCardNumberEditText;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ArrayList unused;
        m cardType = this.f7539a.getCardType();
        CreditCardNumberEditText.a(this.f7539a, this.f7539a.getText().toString());
        m cardType2 = this.f7539a.getCardType();
        boolean z = !i.a(cardType, cardType2);
        if (this.f7539a.f7535b != null) {
            if (z) {
                this.f7539a.f7535b.a(cardType2);
            }
            if (z || cardType2 == null) {
                e eVar = this.f7539a.f7535b;
                unused = this.f7539a.v;
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        String a2;
        CreditCardNumberEditText creditCardNumberEditText = this.f7539a;
        str = this.f7539a.h;
        a2 = creditCardNumberEditText.a(str);
        if (!a2.equals(editable.toString())) {
            editable.replace(0, editable.length(), a2);
        }
    }
}
