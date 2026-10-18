package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* loaded from: classes.dex */
final class be implements bd {
    be() {
    }

    @Override // android.support.v4.widget.bd
    public final Object a(Context context, Interpolator interpolator) {
        return interpolator != null ? new Scroller(context, interpolator) : new Scroller(context);
    }

    @Override // android.support.v4.widget.bd
    public final boolean a(Object obj) {
        return ((Scroller) obj).isFinished();
    }

    @Override // android.support.v4.widget.bd
    public final int b(Object obj) {
        return ((Scroller) obj).getCurrX();
    }

    @Override // android.support.v4.widget.bd
    public final int c(Object obj) {
        return ((Scroller) obj).getCurrY();
    }

    @Override // android.support.v4.widget.bd
    public final float d(Object obj) {
        return 0.0f;
    }

    @Override // android.support.v4.widget.bd
    public final boolean e(Object obj) {
        return ((Scroller) obj).computeScrollOffset();
    }

    @Override // android.support.v4.widget.bd
    public final void a(Object obj, int i, int i2, int i3) {
        ((Scroller) obj).startScroll(i, i2, 0, i3);
    }

    @Override // android.support.v4.widget.bd
    public final void a(Object obj, int i, int i2, int i3, int i4, int i5) {
        ((Scroller) obj).startScroll(i, i2, i3, i4, i5);
    }

    @Override // android.support.v4.widget.bd
    public final void a(Object obj, int i, int i2, int i3, int i4) {
        ((Scroller) obj).fling(0, 0, i, i2, i3, i4, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    @Override // android.support.v4.widget.bd
    public final void b(Object obj, int i, int i2, int i3, int i4, int i5) {
        ((Scroller) obj).fling(i, i2, 0, i3, 0, 0, 0, i4);
    }

    @Override // android.support.v4.widget.bd
    public final void f(Object obj) {
        ((Scroller) obj).abortAnimation();
    }

    @Override // android.support.v4.widget.bd
    public final int g(Object obj) {
        return ((Scroller) obj).getFinalX();
    }

    @Override // android.support.v4.widget.bd
    public final int h(Object obj) {
        return ((Scroller) obj).getFinalY();
    }

    @Override // android.support.v4.widget.bd
    public final boolean b(Object obj, int i, int i2, int i3) {
        return false;
    }
}
