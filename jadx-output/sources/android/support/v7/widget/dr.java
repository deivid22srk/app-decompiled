package android.support.v7.widget;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
final class dr implements bp {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ RecyclerView f772a;

    dr(RecyclerView recyclerView) {
        this.f772a = recyclerView;
    }

    @Override // android.support.v7.widget.bp
    public final int a() {
        return this.f772a.getChildCount();
    }

    @Override // android.support.v7.widget.bp
    public final void a(View view, int i) {
        this.f772a.addView(view, i);
        RecyclerView.a(this.f772a, view);
    }

    @Override // android.support.v7.widget.bp
    public final int a(View view) {
        return this.f772a.indexOfChild(view);
    }

    @Override // android.support.v7.widget.bp
    public final void a(int i) {
        View childAt = this.f772a.getChildAt(i);
        if (childAt != null) {
            this.f772a.f(childAt);
        }
        this.f772a.removeViewAt(i);
    }

    @Override // android.support.v7.widget.bp
    public final View b(int i) {
        return this.f772a.getChildAt(i);
    }

    @Override // android.support.v7.widget.bp
    public final eq b(View view) {
        return RecyclerView.b(view);
    }

    @Override // android.support.v7.widget.bp
    public final void a(View view, int i, ViewGroup.LayoutParams layoutParams) {
        eq b2 = RecyclerView.b(view);
        if (b2 != null) {
            if (!b2.n() && !b2.b()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + b2);
            }
            b2.i();
        }
        this.f772a.attachViewToParent(view, i, layoutParams);
    }

    @Override // android.support.v7.widget.bp
    public final void c(int i) {
        eq b2;
        View b3 = b(i);
        if (b3 != null && (b2 = RecyclerView.b(b3)) != null) {
            if (b2.n() && !b2.b()) {
                throw new IllegalArgumentException("called detach on an already detached child " + b2);
            }
            b2.b(256);
        }
        this.f772a.detachViewFromParent(i);
    }

    @Override // android.support.v7.widget.bp
    public final void c(View view) {
        eq b2 = RecyclerView.b(view);
        if (b2 != null) {
            eq.a(b2);
        }
    }

    @Override // android.support.v7.widget.bp
    public final void d(View view) {
        eq b2 = RecyclerView.b(view);
        if (b2 != null) {
            eq.b(b2);
        }
    }

    @Override // android.support.v7.widget.bp
    public final void b() {
        int childCount = this.f772a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            this.f772a.f(b(i));
        }
        this.f772a.removeAllViews();
    }
}
