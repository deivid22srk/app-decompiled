package com.google.android.finsky.billing.giftcard.a;

import android.content.res.ColorStateList;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* loaded from: classes.dex */
final class j implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ColorStateList f2221a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f2222b;

    j(i iVar, ColorStateList colorStateList) {
        this.f2222b = iVar;
        this.f2221a = colorStateList;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        EditText editText;
        editText = this.f2222b.f2219a;
        editText.setTextColor(this.f2221a);
        this.f2222b.y();
    }
}
