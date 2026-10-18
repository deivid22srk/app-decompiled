package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
class cf extends cd {
    cf() {
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public void c(View view, int i) {
        if (i == 4) {
            i = 2;
        }
        view.setImportantForAccessibility(i);
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final boolean c(View view) {
        return view.hasTransientState();
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final void d(View view) {
        view.postInvalidateOnAnimation();
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final void a(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final void a(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final int e(View view) {
        return view.getImportantForAccessibility();
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final ViewParent i(View view) {
        return view.getParentForAccessibility();
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final int t(View view) {
        return view.getMinimumWidth();
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final int u(View view) {
        return view.getMinimumHeight();
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public void x(View view) {
        view.requestFitSystemWindows();
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final boolean A(View view) {
        return view.getFitsSystemWindows();
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final boolean p(View view) {
        return view.hasOverlappingRendering();
    }
}
