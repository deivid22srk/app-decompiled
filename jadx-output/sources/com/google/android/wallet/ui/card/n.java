package com.google.android.wallet.ui.card;

import android.widget.TextView;

/* loaded from: classes.dex */
final class n extends com.google.android.wallet.ui.common.b.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CardNumberEditText f7432a;

    n(CardNumberEditText cardNumberEditText) {
        this.f7432a = cardNumberEditText;
    }

    @Override // com.google.android.wallet.ui.common.b.a
    public final boolean a(TextView textView) {
        com.google.b.a.a.a.b.a.a.b.a.i iVar;
        String str;
        com.google.b.a.a.a.b.a.a.b.a.i iVar2;
        iVar = this.f7432a.z;
        if (iVar != null) {
            str = this.f7432a.v;
            iVar2 = this.f7432a.z;
            if (com.google.android.wallet.common.util.i.a(str, iVar2.f)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.wallet.ui.common.b.a
    public final /* bridge */ /* synthetic */ CharSequence a() {
        return this.f7432a.d;
    }
}
