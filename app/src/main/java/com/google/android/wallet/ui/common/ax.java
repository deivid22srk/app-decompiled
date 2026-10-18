package com.google.android.wallet.ui.common;

import android.text.Editable;
import android.text.TextWatcher;

/* loaded from: classes.dex */
final class ax implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SummaryTextLayout f7496a;

    ax(SummaryTextLayout summaryTextLayout) {
        this.f7496a = summaryTextLayout;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f7496a.a();
    }
}
