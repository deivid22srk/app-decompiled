package com.google.android.wallet.ui.card;

import android.widget.TextView;

/* loaded from: classes.dex */
final class l extends com.google.android.wallet.ui.common.b.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CardNumberEditText f7430a;

    l(CardNumberEditText cardNumberEditText) {
        this.f7430a = cardNumberEditText;
    }

    @Override // com.google.android.wallet.ui.common.b.a
    public final boolean a(TextView textView) {
        com.google.b.a.a.a.b.a.a.b.a.h hVar;
        hVar = this.f7430a.B;
        return hVar == null;
    }

    @Override // com.google.android.wallet.ui.common.b.a
    public final /* bridge */ /* synthetic */ CharSequence a() {
        com.google.b.a.a.a.b.a.a.b.a.h hVar;
        hVar = this.f7430a.B;
        return hVar.f7574b;
    }
}
