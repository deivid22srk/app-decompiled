package com.google.android.finsky.layout;

import android.text.Editable;
import android.text.TextWatcher;

/* loaded from: classes.dex */
final class cz implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ RateReviewEditor f3212a;

    cz(RateReviewEditor rateReviewEditor) {
        this.f3212a = rateReviewEditor;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f3212a.b();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
