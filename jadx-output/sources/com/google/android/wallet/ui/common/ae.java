package com.google.android.wallet.ui.common;

import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* loaded from: classes.dex */
final class ae extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FormEditText f7479a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(FormEditText formEditText, InputConnection inputConnection) {
        super(inputConnection, true);
        this.f7479a = formEditText;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        CharSequence charSequence2;
        CharSequence charSequence3;
        this.f7479a.A = this.f7479a.getError();
        boolean commitText = super.commitText(charSequence, i);
        charSequence2 = this.f7479a.A;
        if (charSequence2 != null) {
            FormEditText formEditText = this.f7479a;
            charSequence3 = this.f7479a.A;
            formEditText.setError(charSequence3);
        }
        return commitText;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r0.af_() != false) goto L12;
     */
    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean deleteSurroundingText(int r4, int r5) {
        /*
            r3 = this;
            r2 = 1
            com.google.android.wallet.ui.common.FormEditText r0 = r3.f7479a
            boolean r0 = com.google.android.wallet.ui.common.FormEditText.e(r0)
            if (r0 == 0) goto L3e
            if (r4 != r2) goto L3e
            if (r5 != 0) goto L3e
            com.google.android.wallet.ui.common.FormEditText r0 = r3.f7479a
            int r0 = r0.getValueLength()
            if (r0 != 0) goto L3e
            com.google.android.wallet.ui.common.FormEditText r0 = r3.f7479a
            android.content.Context r0 = r0.getContext()
            boolean r0 = com.google.android.wallet.common.util.a.a(r0)
            if (r0 == 0) goto L2d
            com.google.android.wallet.ui.common.FormEditText r0 = r3.f7479a
            com.google.android.wallet.ui.common.t r0 = com.google.android.wallet.ui.common.FormEditText.f(r0)
            boolean r0 = r0.af_()
            if (r0 == 0) goto L3e
        L2d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 14
            if (r0 < r1) goto L43
            com.google.android.wallet.ui.common.FormEditText r0 = r3.f7479a
            android.view.View r0 = r0.focusSearch(r2)
        L39:
            if (r0 == 0) goto L3e
            r0.requestFocus()
        L3e:
            boolean r0 = super.deleteSurroundingText(r4, r5)
            return r0
        L43:
            com.google.android.wallet.ui.common.FormEditText r0 = r3.f7479a
            r1 = 33
            android.view.View r0 = r0.focusSearch(r1)
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.wallet.ui.common.ae.deleteSurroundingText(int, int):boolean");
    }
}
