package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
class cj extends ci {
    cj() {
    }

    @Override // android.support.v4.view.cf, android.support.v4.view.bz, android.support.v4.view.cl
    public final void x(View view) {
        view.requestApplyInsets();
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final void f(View view, float f) {
        view.setElevation(f);
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final float y(View view) {
        return view.getElevation();
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final void g(View view, float f) {
        view.setTranslationZ(f);
    }

    @Override // android.support.v4.view.bz
    public final float z(View view) {
        return view.getTranslationZ();
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final void a(View view, bm bmVar) {
        if (bmVar == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new cp(bmVar));
        }
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final boolean E(View view) {
        return view.isNestedScrollingEnabled();
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final void H(View view) {
        view.stopNestedScroll();
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final ColorStateList F(View view) {
        return view.getBackgroundTintList();
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final void a(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final void a(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final PorterDuff.Mode G(View view) {
        return view.getBackgroundTintMode();
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final er a(View view, er erVar) {
        WindowInsets windowInsets;
        WindowInsets onApplyWindowInsets;
        if (!(erVar instanceof es) || (onApplyWindowInsets = view.onApplyWindowInsets((windowInsets = ((es) erVar).f392a))) == windowInsets) {
            return erVar;
        }
        return new es(onApplyWindowInsets);
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final er b(View view, er erVar) {
        WindowInsets windowInsets;
        WindowInsets dispatchApplyWindowInsets;
        if (!(erVar instanceof es) || (dispatchApplyWindowInsets = view.dispatchApplyWindowInsets((windowInsets = ((es) erVar).f392a))) == windowInsets) {
            return erVar;
        }
        return new es(dispatchApplyWindowInsets);
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final float J(View view) {
        return view.getZ();
    }
}
