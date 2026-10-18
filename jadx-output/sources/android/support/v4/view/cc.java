package android.support.v4.view;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;

/* loaded from: classes.dex */
class cc extends cb {
    cc() {
    }

    @Override // android.support.v4.view.bz
    final long a() {
        return ValueAnimator.getFrameDelay();
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final float f(View view) {
        return view.getAlpha();
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final void a(View view, int i, Paint paint) {
        view.setLayerType(i, paint);
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final int g(View view) {
        return view.getLayerType();
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final int a(int i, int i2, int i3) {
        return View.resolveSizeAndState(i, i2, i3);
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final int j(View view) {
        return view.getMeasuredWidthAndState();
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final int k(View view) {
        return view.getMeasuredHeightAndState();
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final int l(View view) {
        return view.getMeasuredState();
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final float q(View view) {
        return view.getTranslationX();
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final float r(View view) {
        return view.getTranslationY();
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final void a(View view, float f) {
        view.setTranslationX(f);
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final void b(View view, float f) {
        view.setTranslationY(f);
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final void c(View view, float f) {
        view.setAlpha(f);
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final void d(View view, float f) {
        view.setScaleX(f);
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final void e(View view, float f) {
        view.setScaleY(f);
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final float s(View view) {
        return view.getScaleX();
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final void B(View view) {
        view.jumpDrawablesToCurrentState();
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final void C(View view) {
        view.setSaveFromParentEnabled(false);
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final void a(View view, boolean z) {
        view.setActivated(z);
    }

    @Override // android.support.v4.view.bz, android.support.v4.view.cl
    public final int a(int i, int i2) {
        return View.combineMeasuredStates(i, i2);
    }
}
