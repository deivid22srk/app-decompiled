package com.google.android.finsky.e;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
final class o implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n f2763a;

    o(n nVar) {
        this.f2763a = nVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f2763a.at.z().getViewTreeObserver().removeGlobalOnLayoutListener(this);
        this.f2763a.at.q();
    }
}
