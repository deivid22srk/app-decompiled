package android.support.v7.a;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.view.by;
import android.support.v4.view.dy;
import android.support.v4.view.eo;
import android.support.v4.view.eq;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.eu;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class bq extends a implements android.support.v7.widget.i {
    static final /* synthetic */ boolean h;
    private static final Interpolator i;
    private static final Interpolator j;
    private static final boolean k;
    private boolean A;
    private boolean D;
    private boolean E;
    private boolean F;
    private android.support.v7.view.l H;
    private boolean I;

    /* renamed from: a, reason: collision with root package name */
    bu f516a;

    /* renamed from: b, reason: collision with root package name */
    android.support.v7.view.b f517b;
    android.support.v7.view.c c;
    boolean d;
    private Context l;
    private Context m;
    private Activity n;
    private Dialog o;
    private ActionBarOverlayLayout p;
    private ActionBarContainer q;
    private android.support.v7.widget.bs r;
    private ActionBarContextView s;
    private View t;
    private eu u;
    private boolean x;
    private boolean y;
    private ArrayList<Object> v = new ArrayList<>();
    private int w = -1;
    private ArrayList<c> z = new ArrayList<>();
    private int B = 0;
    private boolean C = true;
    private boolean G = true;
    final eo e = new br(this);
    final eo f = new bs(this);
    final eq g = new bt(this);

    static {
        h = !bq.class.desiredAssertionStatus();
        i = new AccelerateInterpolator();
        j = new DecelerateInterpolator();
        k = Build.VERSION.SDK_INT >= 14;
    }

    static /* synthetic */ android.support.v7.view.l d(bq bqVar) {
        bqVar.H = null;
        return null;
    }

    public bq(Activity activity, boolean z) {
        this.n = activity;
        View decorView = activity.getWindow().getDecorView();
        a(decorView);
        if (!z) {
            this.t = decorView.findViewById(R.id.content);
        }
    }

    public bq(Dialog dialog) {
        this.o = dialog;
        a(dialog.getWindow().getDecorView());
    }

    private void a(View view) {
        android.support.v7.widget.bs wrapper;
        this.p = (ActionBarOverlayLayout) view.findViewById(android.support.v7.b.g.decor_content_parent);
        if (this.p != null) {
            this.p.setActionBarVisibilityCallback(this);
        }
        Object findViewById = view.findViewById(android.support.v7.b.g.action_bar);
        if (findViewById instanceof android.support.v7.widget.bs) {
            wrapper = (android.support.v7.widget.bs) findViewById;
        } else if (findViewById instanceof Toolbar) {
            wrapper = ((Toolbar) findViewById).getWrapper();
        } else {
            throw new IllegalStateException(new StringBuilder("Can't make a decor toolbar out of ").append(findViewById).toString() != null ? findViewById.getClass().getSimpleName() : "null");
        }
        this.r = wrapper;
        this.s = (ActionBarContextView) view.findViewById(android.support.v7.b.g.action_context_bar);
        this.q = (ActionBarContainer) view.findViewById(android.support.v7.b.g.action_bar_container);
        if (this.r == null || this.s == null || this.q == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.l = this.r.b();
        if ((this.r.o() & 4) != 0) {
            this.x = true;
        }
        android.support.v7.view.a a2 = android.support.v7.view.a.a(this.l);
        int i2 = a2.f556a.getApplicationInfo().targetSdkVersion;
        g(a2.a());
        TypedArray obtainStyledAttributes = this.l.obtainStyledAttributes(null, android.support.v7.b.l.ActionBar, android.support.v7.b.b.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(android.support.v7.b.l.ActionBar_hideOnContentScroll, false)) {
            if (!this.p.f609a) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.d = true;
            this.p.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(android.support.v7.b.l.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            by.f(this.q, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.support.v7.a.a
    public final void a(Configuration configuration) {
        g(android.support.v7.view.a.a(this.l).a());
    }

    private void g(boolean z) {
        this.A = z;
        if (!this.A) {
            this.r.a((eu) null);
            this.q.setTabContainer(this.u);
        } else {
            this.q.setTabContainer(null);
            this.r.a(this.u);
        }
        boolean z2 = this.r.p() == 2;
        if (this.u != null) {
            if (z2) {
                this.u.setVisibility(0);
                if (this.p != null) {
                    by.x(this.p);
                }
            } else {
                this.u.setVisibility(8);
            }
        }
        this.r.a(!this.A && z2);
        this.p.setHasNonEmbeddedTabs(!this.A && z2);
    }

    @Override // android.support.v7.widget.i
    public final void c(int i2) {
        this.B = i2;
    }

    @Override // android.support.v7.a.a
    public final void c(boolean z) {
        this.I = z;
        if (!z && this.H != null) {
            this.H.b();
        }
    }

    @Override // android.support.v7.a.a
    public final void a(c cVar) {
        this.z.add(cVar);
    }

    @Override // android.support.v7.a.a
    public final void d(boolean z) {
        if (z != this.y) {
            this.y = z;
            int size = this.z.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.z.get(i2).a(z);
            }
        }
    }

    @Override // android.support.v7.a.a
    public final void a(boolean z) {
        a(z ? 4 : 0, 4);
    }

    @Override // android.support.v7.a.a
    public final void a(CharSequence charSequence) {
        this.r.b(charSequence);
    }

    @Override // android.support.v7.a.a
    public final void c(CharSequence charSequence) {
        this.r.a(charSequence);
    }

    @Override // android.support.v7.a.a
    public final boolean i() {
        ViewGroup a2 = this.r.a();
        if (a2 == null || a2.hasFocus()) {
            return false;
        }
        a2.requestFocus();
        return true;
    }

    @Override // android.support.v7.a.a
    public final void b(CharSequence charSequence) {
        this.r.c(charSequence);
    }

    @Override // android.support.v7.a.a
    public final void a(int i2, int i3) {
        int o = this.r.o();
        if ((i3 & 4) != 0) {
            this.x = true;
        }
        this.r.c((o & (i3 ^ (-1))) | (i2 & i3));
    }

    @Override // android.support.v7.a.a
    public final void b(Drawable drawable) {
        this.q.setPrimaryBackground(drawable);
    }

    @Override // android.support.v7.a.a
    public final int a() {
        return this.r.o();
    }

    @Override // android.support.v7.a.a
    public final android.support.v7.view.b a(android.support.v7.view.c cVar) {
        if (this.f516a != null) {
            this.f516a.c();
        }
        this.p.setHideOnContentScrollEnabled(false);
        this.s.b();
        bu buVar = new bu(this, this.s.getContext(), cVar);
        if (!buVar.e()) {
            return null;
        }
        buVar.d();
        this.s.a(buVar);
        f(true);
        this.s.sendAccessibilityEvent(32);
        this.f516a = buVar;
        return buVar;
    }

    @Override // android.support.v7.a.a
    public final int b() {
        return this.q.getHeight();
    }

    @Override // android.support.v7.widget.i
    public final void e(boolean z) {
        this.C = z;
    }

    @Override // android.support.v7.a.a
    public final void c() {
        if (this.D) {
            this.D = false;
            h(false);
        }
    }

    @Override // android.support.v7.widget.i
    public final void k() {
        if (this.E) {
            this.E = false;
            h(true);
        }
    }

    @Override // android.support.v7.a.a
    public final void d() {
        if (!this.D) {
            this.D = true;
            h(false);
        }
    }

    @Override // android.support.v7.widget.i
    public final void l() {
        if (!this.E) {
            this.E = true;
            h(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    private void h(boolean z) {
        if (a(this.D, this.E, this.F)) {
            if (!this.G) {
                this.G = true;
                if (this.H != null) {
                    this.H.b();
                }
                this.q.setVisibility(0);
                if (this.B == 0 && k && (this.I || z)) {
                    by.b((View) this.q, 0.0f);
                    float f = -this.q.getHeight();
                    if (z) {
                        this.q.getLocationInWindow(new int[]{0, 0});
                        f -= r1[1];
                    }
                    by.b(this.q, f);
                    android.support.v7.view.l lVar = new android.support.v7.view.l();
                    dy c = by.t(this.q).c(0.0f);
                    c.a(this.g);
                    lVar.a(c);
                    if (this.C && this.t != null) {
                        by.b(this.t, f);
                        lVar.a(by.t(this.t).c(0.0f));
                    }
                    lVar.a(j);
                    lVar.c();
                    lVar.a(this.f);
                    this.H = lVar;
                    lVar.a();
                } else {
                    by.c((View) this.q, 1.0f);
                    by.b((View) this.q, 0.0f);
                    if (this.C && this.t != null) {
                        by.b(this.t, 0.0f);
                    }
                    this.f.b(null);
                }
                if (this.p != null) {
                    by.x(this.p);
                    return;
                }
                return;
            }
            return;
        }
        if (this.G) {
            this.G = false;
            if (this.H != null) {
                this.H.b();
            }
            if (this.B == 0 && k && (this.I || z)) {
                by.c((View) this.q, 1.0f);
                this.q.setTransitioning(true);
                android.support.v7.view.l lVar2 = new android.support.v7.view.l();
                float f2 = -this.q.getHeight();
                if (z) {
                    this.q.getLocationInWindow(new int[]{0, 0});
                    f2 -= r2[1];
                }
                dy c2 = by.t(this.q).c(f2);
                c2.a(this.g);
                lVar2.a(c2);
                if (this.C && this.t != null) {
                    lVar2.a(by.t(this.t).c(f2));
                }
                lVar2.a(i);
                lVar2.c();
                lVar2.a(this.e);
                this.H = lVar2;
                lVar2.a();
                return;
            }
            this.e.b(null);
        }
    }

    public final void f(boolean z) {
        dy a2;
        dy a3;
        long j2;
        if (z) {
            if (!this.F) {
                this.F = true;
                if (this.p != null) {
                    this.p.setShowingForActionMode(true);
                }
                h(false);
            }
        } else if (this.F) {
            this.F = false;
            if (this.p != null) {
                this.p.setShowingForActionMode(false);
            }
            h(false);
        }
        if (z) {
            a3 = this.r.a(4, 100L);
            a2 = this.s.a(0, 200L);
        } else {
            a2 = this.r.a(0, 200L);
            a3 = this.s.a(8, 100L);
        }
        android.support.v7.view.l lVar = new android.support.v7.view.l();
        lVar.f571a.add(a3);
        View view = a3.f379a.get();
        if (view != null) {
            j2 = dy.f378b.a(view);
        } else {
            j2 = 0;
        }
        a2.b(j2);
        lVar.f571a.add(a2);
        lVar.a();
    }

    @Override // android.support.v7.a.a
    public final Context f() {
        if (this.m == null) {
            TypedValue typedValue = new TypedValue();
            this.l.getTheme().resolveAttribute(android.support.v7.b.b.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.m = new ContextThemeWrapper(this.l, i2);
            } else {
                this.m = this.l;
            }
        }
        return this.m;
    }

    @Override // android.support.v7.a.a
    public final void c(Drawable drawable) {
        this.r.c(drawable);
    }

    @Override // android.support.v7.a.a
    public final void a(int i2) {
        this.r.d(i2);
    }

    @Override // android.support.v7.a.a
    public final void b(int i2) {
        this.r.e(i2);
    }

    @Override // android.support.v7.widget.i
    public final void m() {
        if (this.H != null) {
            this.H.b();
            this.H = null;
        }
    }

    @Override // android.support.v7.a.a
    public final boolean h() {
        if (this.r == null || !this.r.c()) {
            return false;
        }
        this.r.d();
        return true;
    }

    @Override // android.support.v7.a.a
    public final void a(Drawable drawable) {
        this.r.b(drawable);
    }

    @Override // android.support.v7.a.a
    public final void b(boolean z) {
        if (!this.x) {
            a(z);
        }
    }

    @Override // android.support.v7.a.a
    public final boolean e() {
        int height = this.q.getHeight();
        return this.G && (height == 0 || this.p.getActionBarHideOffset() < height);
    }
}
