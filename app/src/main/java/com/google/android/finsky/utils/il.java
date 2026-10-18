package com.google.android.finsky.utils;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* loaded from: classes.dex */
final class il implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InputMethodManager f4995a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ EditText f4996b;

    il(InputMethodManager inputMethodManager, EditText editText) {
        this.f4995a = inputMethodManager;
        this.f4996b = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4995a.showSoftInput(this.f4996b, 1);
    }
}
