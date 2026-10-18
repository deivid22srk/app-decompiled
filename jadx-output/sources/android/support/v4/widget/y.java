package android.support.v4.widget;

import android.view.View;

/* loaded from: classes.dex */
final class y extends cb {

    /* renamed from: a, reason: collision with root package name */
    final int f468a;

    /* renamed from: b, reason: collision with root package name */
    by f469b;
    final /* synthetic */ DrawerLayout c;
    private final Runnable d = new z(this);

    public y(DrawerLayout drawerLayout, int i) {
        this.c = drawerLayout;
        this.f468a = i;
    }

    public final void a() {
        this.c.removeCallbacks(this.d);
    }

    @Override // android.support.v4.widget.cb
    public final boolean a(View view) {
        return DrawerLayout.d(view) && this.c.a(view, this.f468a) && this.c.a(view) == 0;
    }

    @Override // android.support.v4.widget.cb
    public final void a(int i) {
        int i2;
        View rootView;
        DrawerLayout drawerLayout = this.c;
        View view = this.f469b.k;
        int i3 = drawerLayout.f407b.f448a;
        int i4 = drawerLayout.c.f448a;
        if (i3 == 1 || i4 == 1) {
            i2 = 1;
        } else {
            i2 = (i3 == 2 || i4 == 2) ? 2 : 0;
        }
        if (view != null && i == 0) {
            w wVar = (w) view.getLayoutParams();
            if (wVar.f467b == 0.0f) {
                w wVar2 = (w) view.getLayoutParams();
                if ((wVar2.d & 1) == 1) {
                    wVar2.d = 0;
                    if (drawerLayout.f != null) {
                        drawerLayout.f.b_(view);
                    }
                    drawerLayout.a(view, false);
                    if (drawerLayout.hasWindowFocus() && (rootView = drawerLayout.getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (wVar.f467b == 1.0f) {
                w wVar3 = (w) view.getLayoutParams();
                if ((wVar3.d & 1) == 0) {
                    wVar3.d = 1;
                    if (drawerLayout.f != null) {
                        drawerLayout.f.c_(view);
                    }
                    drawerLayout.a(view, true);
                    if (drawerLayout.hasWindowFocus()) {
                        drawerLayout.sendAccessibilityEvent(32);
                    }
                    view.requestFocus();
                }
            }
        }
        if (i2 == drawerLayout.d) {
            return;
        }
        drawerLayout.d = i2;
        if (drawerLayout.f == null) {
            return;
        }
        drawerLayout.f.d_(i2);
    }

    @Override // android.support.v4.widget.cb
    public final void b(View view, int i) {
        float width;
        int width2 = view.getWidth();
        if (this.c.a(view, 3)) {
            width = (width2 + i) / width2;
        } else {
            width = (this.c.getWidth() - i) / width2;
        }
        this.c.a_(view, width);
        view.setVisibility(width == 0.0f ? 4 : 0);
        this.c.invalidate();
    }

    @Override // android.support.v4.widget.cb
    public final void b(View view) {
        ((w) view.getLayoutParams()).c = false;
        b();
    }

    final void b() {
        View a2 = this.c.a(this.f468a == 3 ? 5 : 3);
        if (a2 != null) {
            this.c.f(a2);
        }
    }

    @Override // android.support.v4.widget.cb
    public final void a(View view, float f) {
        int width;
        float b2 = DrawerLayout.b(view);
        int width2 = view.getWidth();
        if (this.c.a(view, 3)) {
            width = (f > 0.0f || (f == 0.0f && b2 > 0.5f)) ? 0 : -width2;
        } else {
            width = this.c.getWidth();
            if (f < 0.0f || (f == 0.0f && b2 > 0.5f)) {
                width -= width2;
            }
        }
        this.f469b.a(width, view.getTop());
        this.c.invalidate();
    }

    @Override // android.support.v4.widget.cb
    public final void c() {
        this.c.postDelayed(this.d, 160L);
    }

    @Override // android.support.v4.widget.cb
    public final void a(int i, int i2) {
        View a2;
        if ((i & 1) == 1) {
            a2 = this.c.a(3);
        } else {
            a2 = this.c.a(5);
        }
        if (a2 != null && this.c.a(a2) == 0) {
            this.f469b.a(a2, i2);
        }
    }

    @Override // android.support.v4.widget.cb
    public final int c(View view) {
        if (DrawerLayout.d(view)) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // android.support.v4.widget.cb
    public final int a(View view, int i) {
        if (this.c.a(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = this.c.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    @Override // android.support.v4.widget.cb
    public final int d(View view) {
        return view.getTop();
    }
}
