package android.support.design.widget;

import android.animation.ValueAnimator;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
final class br extends bn {

    /* renamed from: a, reason: collision with root package name */
    final ValueAnimator f120a = new ValueAnimator();

    br() {
    }

    @Override // android.support.design.widget.bn
    public final void a() {
        this.f120a.start();
    }

    @Override // android.support.design.widget.bn
    public final boolean b() {
        return this.f120a.isRunning();
    }

    @Override // android.support.design.widget.bn
    public final void a(Interpolator interpolator) {
        this.f120a.setInterpolator(interpolator);
    }

    @Override // android.support.design.widget.bn
    public final void a(bo boVar) {
        this.f120a.addUpdateListener(new bs(this, boVar));
    }

    @Override // android.support.design.widget.bn
    public final void a(float f, float f2) {
        this.f120a.setFloatValues(f, f2);
    }

    @Override // android.support.design.widget.bn
    public final float c() {
        return ((Float) this.f120a.getAnimatedValue()).floatValue();
    }

    @Override // android.support.design.widget.bn
    public final void d() {
        this.f120a.cancel();
    }
}
