package com.google.android.wallet.ui.creditcard;

import android.widget.TextView;
import com.google.b.a.a.a.b.a.apkg.bpkg.apkg.l;

/* loaded from: classes2.dex */
final class a extends com.google.android.wallet.ui.common.bpkg.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CreditCardNumberEditText f7536a;

    a(CreditCardNumberEditText creditCardNumberEditText) {
        this.f7536a = creditCardNumberEditText;
    }

    @Override // com.google.android.wallet.ui.common.bpkg.a
    public final boolean a(TextView textView) {
        l lVar;
        lVar = this.f7536a.x;
        return lVar == null;
    }

    @Override // com.google.android.wallet.ui.common.bpkg.a
    public final /* bridge */ /* synthetic */ CharSequence a() {
        l lVar;
        lVar = this.f7536a.x;
        return lVar.e;
    }
}
