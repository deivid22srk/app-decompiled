package com.google.android.wallet.ui.creditcard;

import android.widget.TextView;
import java.util.ArrayList;

/* loaded from: classes2.dex */
final class b extends com.google.android.wallet.ui.common.b.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CreditCardNumberEditText f7537a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(CreditCardNumberEditText creditCardNumberEditText, CharSequence charSequence) {
        super(charSequence);
        this.f7537a = creditCardNumberEditText;
    }

    @Override // com.google.android.wallet.ui.common.b.a
    public final boolean a(TextView textView) {
        ArrayList arrayList;
        arrayList = this.f7537a.v;
        return !arrayList.isEmpty();
    }
}
