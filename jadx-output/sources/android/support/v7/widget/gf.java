package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* loaded from: classes.dex */
public final class gf implements bs {

    /* renamed from: a, reason: collision with root package name */
    Toolbar f845a;

    /* renamed from: b, reason: collision with root package name */
    CharSequence f846b;
    Window.Callback c;
    boolean d;
    private int e;
    private View f;
    private View g;
    private Drawable h;
    private Drawable i;
    private Drawable j;
    private boolean k;
    private CharSequence l;
    private CharSequence m;
    private k n;
    private int o;
    private final ao p;
    private int q;
    private Drawable r;

    public gf(Toolbar toolbar, boolean z) {
        this(toolbar, z, android.support.v7.b.j.abc_action_bar_up_description, android.support.v7.b.f.abc_ic_ab_back_material);
    }

    private gf(Toolbar toolbar, boolean z, int i, int i2) {
        this.o = 0;
        this.q = 0;
        this.f845a = toolbar;
        this.f846b = toolbar.getTitle();
        this.l = toolbar.getSubtitle();
        this.k = this.f846b != null;
        this.j = toolbar.getNavigationIcon();
        if (z) {
            fx a2 = fx.a(toolbar.getContext(), null, android.support.v7.b.l.ActionBar, android.support.v7.b.b.actionBarStyle);
            CharSequence c = a2.c(android.support.v7.b.l.ActionBar_title);
            if (!TextUtils.isEmpty(c)) {
                b(c);
            }
            CharSequence c2 = a2.c(android.support.v7.b.l.ActionBar_subtitle);
            if (!TextUtils.isEmpty(c2)) {
                c(c2);
            }
            Drawable a3 = a2.a(android.support.v7.b.l.ActionBar_logo);
            if (a3 != null) {
                b(a3);
            }
            Drawable a4 = a2.a(android.support.v7.b.l.ActionBar_icon);
            if (this.j == null && a4 != null) {
                a(a4);
            }
            Drawable a5 = a2.a(android.support.v7.b.l.ActionBar_homeAsUpIndicator);
            if (a5 != null) {
                c(a5);
            }
            c(a2.a(android.support.v7.b.l.ActionBar_displayOptions, 0));
            int e = a2.e(android.support.v7.b.l.ActionBar_customNavigationLayout, 0);
            if (e != 0) {
                View inflate = LayoutInflater.from(this.f845a.getContext()).inflate(e, (ViewGroup) this.f845a, false);
                if (this.g != null && (this.e & 16) != 0) {
                    this.f845a.removeView(this.g);
                }
                this.g = inflate;
                if (inflate != null && (this.e & 16) != 0) {
                    this.f845a.addView(this.g);
                }
                c(this.e | 16);
            }
            int d = a2.d(android.support.v7.b.l.ActionBar_height, 0);
            if (d > 0) {
                ViewGroup.LayoutParams layoutParams = this.f845a.getLayoutParams();
                layoutParams.height = d;
                this.f845a.setLayoutParams(layoutParams);
            }
            int b2 = a2.b(android.support.v7.b.l.ActionBar_contentInsetStart, -1);
            int b3 = a2.b(android.support.v7.b.l.ActionBar_contentInsetEnd, -1);
            if (b2 >= 0 || b3 >= 0) {
                this.f845a.i.a(Math.max(b2, 0), Math.max(b3, 0));
            }
            int e2 = a2.e(android.support.v7.b.l.ActionBar_titleTextStyle, 0);
            if (e2 != 0) {
                Toolbar toolbar2 = this.f845a;
                Context context = this.f845a.getContext();
                toolbar2.g = e2;
                if (toolbar2.f635b != null) {
                    toolbar2.f635b.setTextAppearance(context, e2);
                }
            }
            int e3 = a2.e(android.support.v7.b.l.ActionBar_subtitleTextStyle, 0);
            if (e3 != 0) {
                Toolbar toolbar3 = this.f845a;
                Context context2 = this.f845a.getContext();
                toolbar3.h = e3;
                if (toolbar3.c != null) {
                    toolbar3.c.setTextAppearance(context2, e3);
                }
            }
            int e4 = a2.e(android.support.v7.b.l.ActionBar_popupTheme, 0);
            if (e4 != 0) {
                this.f845a.setPopupTheme(e4);
            }
            a2.f836a.recycle();
        } else {
            this.e = this.f845a.getNavigationIcon() != null ? 15 : 11;
        }
        this.p = ao.a();
        if (i != this.q) {
            this.q = i;
            if (TextUtils.isEmpty(this.f845a.getNavigationContentDescription())) {
                e(this.q);
            }
        }
        this.m = this.f845a.getNavigationContentDescription();
        Drawable a6 = this.p.a(this.f845a.getContext(), i2, false);
        if (this.r != a6) {
            this.r = a6;
            v();
        }
        this.f845a.setNavigationOnClickListener(new gg(this));
    }

    @Override // android.support.v7.widget.bs
    public final ViewGroup a() {
        return this.f845a;
    }

    @Override // android.support.v7.widget.bs
    public final Context b() {
        return this.f845a.getContext();
    }

    @Override // android.support.v7.widget.bs
    public final boolean c() {
        return this.f845a.c();
    }

    @Override // android.support.v7.widget.bs
    public final void d() {
        this.f845a.d();
    }

    @Override // android.support.v7.widget.bs
    public final void a(Window.Callback callback) {
        this.c = callback;
    }

    @Override // android.support.v7.widget.bs
    public final void a(CharSequence charSequence) {
        if (!this.k) {
            d(charSequence);
        }
    }

    @Override // android.support.v7.widget.bs
    public final CharSequence e() {
        return this.f845a.getTitle();
    }

    @Override // android.support.v7.widget.bs
    public final void b(CharSequence charSequence) {
        this.k = true;
        d(charSequence);
    }

    private void d(CharSequence charSequence) {
        this.f846b = charSequence;
        if ((this.e & 8) != 0) {
            this.f845a.setTitle(charSequence);
        }
    }

    @Override // android.support.v7.widget.bs
    public final void c(CharSequence charSequence) {
        this.l = charSequence;
        if ((this.e & 8) != 0) {
            this.f845a.setSubtitle(charSequence);
        }
    }

    @Override // android.support.v7.widget.bs
    public final void f() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // android.support.v7.widget.bs
    public final void g() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // android.support.v7.widget.bs
    public final void a(int i) {
        Drawable drawable;
        if (i == 0) {
            drawable = null;
        } else {
            drawable = this.p.a(this.f845a.getContext(), i, false);
        }
        a(drawable);
    }

    @Override // android.support.v7.widget.bs
    public final void a(Drawable drawable) {
        this.h = drawable;
        t();
    }

    @Override // android.support.v7.widget.bs
    public final void b(int i) {
        Drawable drawable;
        if (i == 0) {
            drawable = null;
        } else {
            drawable = this.p.a(this.f845a.getContext(), i, false);
        }
        b(drawable);
    }

    @Override // android.support.v7.widget.bs
    public final void b(Drawable drawable) {
        this.i = drawable;
        t();
    }

    private void t() {
        Drawable drawable = null;
        if ((this.e & 2) != 0) {
            if ((this.e & 1) != 0) {
                drawable = this.i != null ? this.i : this.h;
            } else {
                drawable = this.h;
            }
        }
        this.f845a.setLogo(drawable);
    }

    @Override // android.support.v7.widget.bs
    public final boolean h() {
        Toolbar toolbar = this.f845a;
        return toolbar.getVisibility() == 0 && toolbar.f634a != null && toolbar.f634a.f611b;
    }

    @Override // android.support.v7.widget.bs
    public final boolean i() {
        return this.f845a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020 A[ORIG_RETURN, RETURN] */
    @Override // android.support.v7.widget.bs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j() {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            android.support.v7.widget.Toolbar r2 = r4.f845a
            android.support.v7.widget.ActionMenuView r3 = r2.f634a
            if (r3 == 0) goto L25
            android.support.v7.widget.ActionMenuView r2 = r2.f634a
            android.support.v7.widget.k r3 = r2.c
            if (r3 == 0) goto L23
            android.support.v7.widget.k r2 = r2.c
            android.support.v7.widget.n r3 = r2.q
            if (r3 != 0) goto L1a
            boolean r2 = r2.g()
            if (r2 == 0) goto L21
        L1a:
            r2 = r0
        L1b:
            if (r2 == 0) goto L23
            r2 = r0
        L1e:
            if (r2 == 0) goto L25
        L20:
            return r0
        L21:
            r2 = r1
            goto L1b
        L23:
            r2 = r1
            goto L1e
        L25:
            r0 = r1
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.gf.j():boolean");
    }

    @Override // android.support.v7.widget.bs
    public final boolean k() {
        return this.f845a.b();
    }

    @Override // android.support.v7.widget.bs
    public final boolean l() {
        Toolbar toolbar = this.f845a;
        if (toolbar.f634a != null) {
            ActionMenuView actionMenuView = toolbar.f634a;
            if (actionMenuView.c != null && actionMenuView.c.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.support.v7.widget.bs
    public final void m() {
        this.d = true;
    }

    @Override // android.support.v7.widget.bs
    public final void a(Menu menu, android.support.v7.view.menu.y yVar) {
        if (this.n == null) {
            this.n = new k(this.f845a.getContext());
            this.n.h = android.support.v7.b.g.action_menu_presenter;
        }
        this.n.f = yVar;
        Toolbar toolbar = this.f845a;
        android.support.v7.view.menu.i iVar = (android.support.v7.view.menu.i) menu;
        k kVar = this.n;
        if (iVar == null && toolbar.f634a == null) {
            return;
        }
        toolbar.e();
        android.support.v7.view.menu.i iVar2 = toolbar.f634a.f610a;
        if (iVar2 == iVar) {
            return;
        }
        if (iVar2 != null) {
            iVar2.b(toolbar.k);
            iVar2.b(toolbar.l);
        }
        if (toolbar.l == null) {
            toolbar.l = new gb(toolbar, (byte) 0);
        }
        kVar.n = true;
        if (iVar != null) {
            iVar.a(kVar, toolbar.e);
            iVar.a(toolbar.l, toolbar.e);
        } else {
            kVar.a(toolbar.e, (android.support.v7.view.menu.i) null);
            toolbar.l.a(toolbar.e, (android.support.v7.view.menu.i) null);
            kVar.b(true);
            toolbar.l.b(true);
        }
        toolbar.f634a.setPopupTheme(toolbar.f);
        toolbar.f634a.setPresenter(kVar);
        toolbar.k = kVar;
    }

    @Override // android.support.v7.widget.bs
    public final void n() {
        Toolbar toolbar = this.f845a;
        if (toolbar.f634a == null) {
            return;
        }
        toolbar.f634a.b();
    }

    @Override // android.support.v7.widget.bs
    public final int o() {
        return this.e;
    }

    @Override // android.support.v7.widget.bs
    public final void c(int i) {
        int i2 = this.e ^ i;
        this.e = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    v();
                    u();
                } else {
                    this.f845a.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                t();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f845a.setTitle(this.f846b);
                    this.f845a.setSubtitle(this.l);
                } else {
                    this.f845a.setTitle((CharSequence) null);
                    this.f845a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && this.g != null) {
                if ((i & 16) != 0) {
                    this.f845a.addView(this.g);
                } else {
                    this.f845a.removeView(this.g);
                }
            }
        }
    }

    @Override // android.support.v7.widget.bs
    public final void a(eu euVar) {
        if (this.f != null && this.f.getParent() == this.f845a) {
            this.f845a.removeView(this.f);
        }
        this.f = euVar;
        if (euVar != null && this.o == 2) {
            this.f845a.addView(this.f, 0);
            gc gcVar = (gc) this.f.getLayoutParams();
            gcVar.width = -2;
            gcVar.height = -2;
            gcVar.f491a = 8388691;
            euVar.setAllowCollapse(true);
        }
    }

    @Override // android.support.v7.widget.bs
    public final void a(boolean z) {
        this.f845a.setCollapsible(z);
    }

    @Override // android.support.v7.widget.bs
    public final int p() {
        return this.o;
    }

    @Override // android.support.v7.widget.bs
    public final android.support.v4.view.dy a(int i, long j) {
        return android.support.v4.view.by.t(this.f845a).a(i == 0 ? 1.0f : 0.0f).a(j).a(new gh(this, i));
    }

    @Override // android.support.v7.widget.bs
    public final void c(Drawable drawable) {
        this.j = drawable;
        v();
    }

    @Override // android.support.v7.widget.bs
    public final void d(int i) {
        Drawable drawable;
        if (i == 0) {
            drawable = null;
        } else {
            drawable = ao.a().a(this.f845a.getContext(), i, false);
        }
        c(drawable);
    }

    @Override // android.support.v7.widget.bs
    public final void e(int i) {
        this.m = i == 0 ? null : this.f845a.getContext().getString(i);
        u();
    }

    private void u() {
        if ((this.e & 4) != 0) {
            if (TextUtils.isEmpty(this.m)) {
                this.f845a.setNavigationContentDescription(this.q);
            } else {
                this.f845a.setNavigationContentDescription(this.m);
            }
        }
    }

    private void v() {
        if ((this.e & 4) != 0) {
            this.f845a.setNavigationIcon(this.j != null ? this.j : this.r);
        }
    }

    @Override // android.support.v7.widget.bs
    public final void d(Drawable drawable) {
        this.f845a.setBackgroundDrawable(drawable);
    }

    @Override // android.support.v7.widget.bs
    public final int q() {
        return this.f845a.getHeight();
    }

    @Override // android.support.v7.widget.bs
    public final void f(int i) {
        this.f845a.setVisibility(i);
    }

    @Override // android.support.v7.widget.bs
    public final int r() {
        return this.f845a.getVisibility();
    }

    @Override // android.support.v7.widget.bs
    public final void a(android.support.v7.view.menu.y yVar, android.support.v7.view.menu.j jVar) {
        Toolbar toolbar = this.f845a;
        toolbar.m = yVar;
        toolbar.n = jVar;
        if (toolbar.f634a == null) {
            return;
        }
        toolbar.f634a.a(yVar, jVar);
    }

    @Override // android.support.v7.widget.bs
    public final Menu s() {
        return this.f845a.getMenu();
    }
}
