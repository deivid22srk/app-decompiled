package com.google.android.finsky.utils;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
final class hu implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f4975a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f4976b;

    hu(View view, int i) {
        this.f4975a = view;
        this.f4976b = i;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f4975a.setSystemUiVisibility(this.f4976b);
        return true;
    }
}
