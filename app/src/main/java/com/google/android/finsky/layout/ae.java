package com.google.android.finsky.layout;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
final class ae implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ad f3125a;

    ae(ad adVar) {
        this.f3125a = adVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        return !ad.a(this.f3125a);
    }
}
