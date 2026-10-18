package com.google.android.wallet.ui.card;

import android.widget.TextView;

/* loaded from: classes.dex */
final class m extends com.google.android.wallet.ui.common.bpkg.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CardNumberEditText f7431a;

    m(CardNumberEditText cardNumberEditText) {
        this.f7431a = cardNumberEditText;
    }

    @Override // com.google.android.wallet.ui.common.bpkg.a
    public final boolean a(TextView textView) {
        boolean z;
        com.google.b.a.a.a.b.a.apkg.bpkg.apkg.i iVar;
        z = this.f7431a.y;
        if (!z) {
            iVar = this.f7431a.z;
            if (iVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.wallet.ui.common.bpkg.a
    public final /* bridge */ /* synthetic */ CharSequence a() {
        return this.f7431a.c;
    }
}
