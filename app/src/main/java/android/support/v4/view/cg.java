package android.support.v4.view;

import android.view.View;

/* loaded from: classes.dex */
class cg extends cf {
    cg() {
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final int h(View view) {
        return view.getLayoutDirection();
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final int n(View view) {
        return view.getPaddingStart();
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final int o(View view) {
        return view.getPaddingEnd();
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final void a(View view, int i, int i2, int i3, int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final int w(View view) {
        return view.getWindowSystemUiVisibility();
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final boolean D(View view) {
        return view.isPaddingRelative();
    }
}
