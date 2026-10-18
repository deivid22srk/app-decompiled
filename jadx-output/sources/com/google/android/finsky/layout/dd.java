package com.google.android.finsky.layout;

import android.view.inputmethod.InputMethodManager;

/* loaded from: classes.dex */
final class dd implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ dc f3216a;

    dd(dc dcVar) {
        this.f3216a = dcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InputMethodManager) this.f3216a.f3215a.getContext().getSystemService("input_method")).showSoftInput(this.f3216a.f3215a.c, 1);
    }
}
