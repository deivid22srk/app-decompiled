package com.google.android.wallet.ui.creditcard;

import android.util.Pair;
import android.widget.TextView;
import com.google.android.wallet.common.util.i;

/* loaded from: classes2.dex */
final class c extends com.google.android.wallet.ui.common.b.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CreditCardNumberEditText f7538a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(CreditCardNumberEditText creditCardNumberEditText, CharSequence charSequence) {
        super(charSequence);
        this.f7538a = creditCardNumberEditText;
    }

    @Override // com.google.android.wallet.ui.common.b.a
    public final boolean a(TextView textView) {
        Pair pair;
        String str;
        pair = this.f7538a.w;
        if (pair != null && this.f7538a.ah_()) {
            str = this.f7538a.h;
            if (i.a(str, 2)) {
                return true;
            }
        }
        return false;
    }
}
