package android.support.design.widget;

import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
final class bf extends android.support.v4.widget.cb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ be f109a;

    /* renamed from: b, reason: collision with root package name */
    private int f110b;

    bf(be beVar) {
        this.f109a = beVar;
    }

    @Override // android.support.v4.widget.cb
    public final boolean a(View view) {
        return this.f109a.b(view);
    }

    @Override // android.support.v4.widget.cb
    public final void b(View view) {
        this.f110b = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // android.support.v4.widget.cb
    public final void a(int i) {
        if (this.f109a.c != null) {
            this.f109a.c.a(i);
        }
    }

    @Override // android.support.v4.widget.cb
    public final void a(View view, float f) {
        boolean z;
        int i;
        boolean z2 = true;
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        int width = view.getWidth();
        if (f != 0.0f) {
            boolean z3 = android.support.v4.view.by.h(view) == 1;
            if (this.f109a.d == 2) {
                z = true;
            } else if (this.f109a.d == 0) {
                z = z3 ? f < 0.0f : f > 0.0f;
            } else if (this.f109a.d == 1) {
                z = z3 ? f > 0.0f : f < 0.0f;
            } else {
                z = false;
            }
        } else {
            z = Math.abs(view.getLeft() - this.f110b) >= Math.round(((float) view.getWidth()) * this.f109a.e);
        }
        if (z) {
            i = view.getLeft() < this.f110b ? this.f110b - width : this.f110b + width;
        } else {
            i = this.f110b;
            z2 = false;
        }
        if (this.f109a.f108b.a(i, view.getTop())) {
            android.support.v4.view.by.a(view, new bh(this.f109a, view, z2));
        } else if (z2 && this.f109a.c != null) {
            this.f109a.c.a();
        }
    }

    @Override // android.support.v4.widget.cb
    public final int c(View view) {
        return view.getWidth();
    }

    @Override // android.support.v4.widget.cb
    public final int a(View view, int i) {
        int width;
        int width2;
        boolean z = android.support.v4.view.by.h(view) == 1;
        if (this.f109a.d == 0) {
            if (z) {
                width = this.f110b - view.getWidth();
                width2 = this.f110b;
            } else {
                width = this.f110b;
                width2 = this.f110b + view.getWidth();
            }
        } else if (this.f109a.d == 1) {
            if (z) {
                width = this.f110b;
                width2 = this.f110b + view.getWidth();
            } else {
                width = this.f110b - view.getWidth();
                width2 = this.f110b;
            }
        } else {
            width = this.f110b - view.getWidth();
            width2 = this.f110b + view.getWidth();
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // android.support.v4.widget.cb
    public final int d(View view) {
        return view.getTop();
    }

    @Override // android.support.v4.widget.cb
    public final void b(View view, int i) {
        float width = this.f110b + (view.getWidth() * this.f109a.f);
        float width2 = this.f110b + (view.getWidth() * this.f109a.g);
        if (i <= width) {
            android.support.v4.view.by.c(view, 1.0f);
        } else if (i >= width2) {
            android.support.v4.view.by.c(view, 0.0f);
        } else {
            android.support.v4.view.by.c(view, be.a(1.0f - ((i - width) / (width2 - width))));
        }
    }
}
