package com.google.android.finsky.activities;

import android.content.DialogInterface;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* loaded from: classes.dex */
final class ak implements DialogInterface.OnShowListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ EditText f1544a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ab f1545b;

    ak(ab abVar, EditText editText) {
        this.f1545b = abVar;
        this.f1544a = editText;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        if (this.f1544a.requestFocus()) {
            ((InputMethodManager) this.f1545b.getSystemService("input_method")).showSoftInput(this.f1544a, 0);
        }
    }
}
