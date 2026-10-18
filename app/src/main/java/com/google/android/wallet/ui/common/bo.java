package com.google.android.wallet.ui.common;

import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

/* loaded from: classes2.dex */
final class bo implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InputMethodManager f7518a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ TextView f7519b;

    bo(InputMethodManager inputMethodManager, TextView textView) {
        this.f7518a = inputMethodManager;
        this.f7519b = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7518a.showSoftInput(this.f7519b, 1);
    }
}
