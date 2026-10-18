package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* loaded from: classes.dex */
class bf implements bd {
    bf() {
    }

    @Override // android.support.v4.widget.bd
    public float d(Object obj) {
        return 0.0f;
    }

    @Override // android.support.v4.widget.bd
    public final void a(Object obj, int i, int i2, int i3, int i4, int i5) {
        ((OverScroller) obj).startScroll(i, i2, i3, i4, i5);
    }

    @Override // android.support.v4.widget.bd
    public final void a(Object obj, int i, int i2, int i3, int i4) {
        ((OverScroller) obj).fling(0, 0, i, i2, i3, i4, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    @Override // android.support.v4.widget.bd
    public final void b(Object obj, int i, int i2, int i3, int i4, int i5) {
        ((OverScroller) obj).fling(i, i2, 0, i3, 0, 0, 0, i4, 0, i5);
    }

    @Override // android.support.v4.widget.bd
    public final boolean b(Object obj, int i, int i2, int i3) {
        return ((OverScroller) obj).springBack(i, i2, 0, 0, 0, i3);
    }

    @Override // android.support.v4.widget.bd
    public final Object a(Context context, Interpolator interpolator) {
        return interpolator != null ? new OverScroller(context, interpolator) : new OverScroller(context);
    }

    @Override // android.support.v4.widget.bd
    public final boolean a(Object obj) {
        return ((OverScroller) obj).isFinished();
    }

    @Override // android.support.v4.widget.bd
    public final int b(Object obj) {
        return ((OverScroller) obj).getCurrX();
    }

    @Override // android.support.v4.widget.bd
    public final int c(Object obj) {
        return ((OverScroller) obj).getCurrY();
    }

    @Override // android.support.v4.widget.bd
    public final boolean e(Object obj) {
        return ((OverScroller) obj).computeScrollOffset();
    }

    @Override // android.support.v4.widget.bd
    public final void a(Object obj, int i, int i2, int i3) {
        ((OverScroller) obj).startScroll(i, i2, 0, i3);
    }

    @Override // android.support.v4.widget.bd
    public final void f(Object obj) {
        ((OverScroller) obj).abortAnimation();
    }

    @Override // android.support.v4.widget.bd
    public final int g(Object obj) {
        return ((OverScroller) obj).getFinalX();
    }

    @Override // android.support.v4.widget.bd
    public final int h(Object obj) {
        return ((OverScroller) obj).getFinalY();
    }
}
