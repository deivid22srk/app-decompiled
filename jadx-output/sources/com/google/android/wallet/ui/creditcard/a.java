package com.google.android.wallet.ui.creditcard;

import android.widget.TextView;
import com.google.b.a.a.a.b.a.a.b.a.l;

/* loaded from: classes2.dex */
final class a extends com.google.android.wallet.ui.common.b.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CreditCardNumberEditText f7536a;

    a(CreditCardNumberEditText creditCardNumberEditText) {
        this.f7536a = creditCardNumberEditText;
    }

    @Override // com.google.android.wallet.ui.common.b.a
    public final boolean a(TextView textView) {
        l lVar;
        lVar = this.f7536a.x;
        return lVar == null;
    }

    @Override // com.google.android.wallet.ui.common.b.a
    public final /* bridge */ /* synthetic */ CharSequence a() {
        l lVar;
        lVar = this.f7536a.x;
        return lVar.e;
    }
}
