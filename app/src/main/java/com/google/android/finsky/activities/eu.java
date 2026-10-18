package com.google.android.finsky.activities;

import android.text.Editable;
import android.text.TextWatcher;

/* loaded from: classes.dex */
final class eu implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PinEntryDialog f1729a;

    eu(PinEntryDialog pinEntryDialog) {
        this.f1729a = pinEntryDialog;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f1729a.h();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
