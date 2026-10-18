package android.support.v4.view;

import android.view.View;

/* loaded from: classes.dex */
class ci extends ch {
    ci() {
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final void m(View view) {
        view.setAccessibilityLiveRegion(1);
    }

    @Override // android.support.v4.view.cf, android.support.v4.view.bz, android.support.v4.view.cl
    public final void c(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final boolean I(View view) {
        return view.isLaidOut();
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final boolean K(View view) {
        return view.isAttachedToWindow();
    }
}
