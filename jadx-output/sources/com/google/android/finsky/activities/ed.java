package com.google.android.finsky.activities;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import com.android.vending.R;
import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.SpacerHeightAwareFrameLayout;
import com.google.android.finsky.layout.play.PlayRecyclerView;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public final class ed implements com.android.volley.s, hc, com.google.android.finsky.api.model.x, com.google.android.finsky.layout.by, com.google.android.finsky.layout.play.cy {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f1710a;

    /* renamed from: b, reason: collision with root package name */
    protected final DfeToc f1711b;
    protected final com.google.android.finsky.navigationmanager.b c;
    protected final com.google.android.finsky.layout.actionbar.c d;
    boolean e;
    private final int f;
    private final com.google.android.finsky.api.model.s g;
    private final LayoutInflater h;
    private final gq i;
    private com.google.android.finsky.e.h j;
    private ViewGroup k;
    private com.google.android.finsky.layout.bv l;
    private Document o;
    private boolean p;
    private final com.google.android.finsky.api.b q;
    private final com.google.android.finsky.utils.ac r;
    private final com.google.android.finsky.protos.ba[] s;
    private final String t;
    private com.google.android.finsky.layout.play.de v;
    private final int w;
    private final gt x;
    private final boolean y;
    private com.google.android.finsky.layout.em z;
    private com.google.android.finsky.utils.dx m = com.google.android.finsky.utils.dx.f4838a;
    private boolean n = false;
    private com.google.android.finsky.a.ai u = com.google.android.finsky.a.i.a(408);

    static {
        f1710a = Build.VERSION.SDK_INT >= 16;
    }

    public ed(Context context, com.google.android.finsky.navigationmanager.b bVar, com.google.android.play.image.e eVar, com.google.android.finsky.api.b bVar2, LayoutInflater layoutInflater, gs gsVar, DfeToc dfeToc, com.google.android.finsky.utils.ac acVar, boolean z, com.google.android.finsky.layout.actionbar.c cVar, int i, gt gtVar, gq gqVar, com.google.android.finsky.layout.em emVar) {
        Resources resources = context.getResources();
        this.h = layoutInflater;
        this.g = gsVar.f1781b;
        this.s = gsVar.f1780a.e;
        this.t = i == 2 ? gsVar.f1780a.f3617a : null;
        this.v = gsVar.f;
        this.f = resources.getInteger(R.integer.layout_slide_in_animation_duration_ms);
        T t = this.g.f1988a;
        t.h = resources.getInteger(R.integer.num_items_per_list_column) * ik.c(resources);
        t.a(this);
        t.a(this);
        this.e = z;
        this.y = (FinskyApp.a().e().a(12605163L) || com.google.android.finsky.c.d.fo.b().booleanValue()) && (bVar.q() == 1);
        if (!this.y) {
            t.q();
        }
        this.f1711b = dfeToc;
        this.c = bVar;
        this.q = bVar2;
        this.r = acVar;
        this.d = cVar;
        this.w = i;
        this.x = gtVar;
        this.z = emVar;
        this.i = gqVar;
        this.j = new com.google.android.finsky.e.h(this.f1711b, this.q, this.r);
        this.j.a(context, this.c, eVar);
    }

    private void a(int i) {
        ((SpacerHeightAwareFrameLayout) this.k.findViewById(i)).setSpacerHeightProvider(this.i);
    }

    @Override // com.google.android.finsky.activities.hc
    public final View a() {
        if (this.k == null) {
            this.k = (ViewGroup) this.h.inflate(R.layout.recycler_tab_wrapper, (ViewGroup) null);
            a(R.id.lists_loading_indicator);
            a(R.id.page_error_indicator);
            this.l = new com.google.android.finsky.layout.bv(this.k, R.id.data_view, R.id.lists_loading_indicator, this, 0);
            PlayRecyclerView playRecyclerView = (PlayRecyclerView) this.k.findViewById(R.id.tab_recycler_view);
            playRecyclerView.getContext();
            playRecyclerView.setLayoutManager(new LinearLayoutManager());
            playRecyclerView.setAdapter(new com.google.android.finsky.adapters.ab());
            d();
        }
        return this.k;
    }

    @Override // com.google.android.finsky.activities.hc
    public final void b() {
        com.google.android.finsky.e.h hVar = this.j;
        hVar.a();
        if (hVar.f2754a != null) {
            hVar.f2754a.r();
            hVar.f2754a = null;
        }
        hVar.f2755b = null;
        T t = this.g.f1988a;
        t.b(this);
        t.b(this);
        this.g.a();
        this.k = null;
        this.n = false;
    }

    @Override // com.google.android.finsky.api.model.x
    public final void m_() {
        d();
    }

    @Override // com.google.android.finsky.activities.hc
    public final com.google.android.finsky.utils.dx c() {
        if (this.z != null) {
            this.z.b();
        }
        if (this.k != null) {
            PlayRecyclerView playRecyclerView = (PlayRecyclerView) this.k.findViewById(R.id.tab_recycler_view);
            if (playRecyclerView.getVisibility() == 0) {
                com.google.android.finsky.utils.dx dxVar = new com.google.android.finsky.utils.dx();
                com.google.android.finsky.e.h hVar = this.j;
                Bundle bundle = dxVar.c;
                if (hVar.f2754a != null) {
                    hVar.f2754a.a(playRecyclerView, bundle);
                }
                return dxVar;
            }
        }
        return null;
    }

    @Override // com.google.android.finsky.activities.hc
    public final void a(com.google.android.finsky.utils.dx dxVar) {
        if (this.m != null) {
            this.m = dxVar;
        }
    }

    final void d() {
        if (this.k == null) {
            return;
        }
        T t = this.g.f1988a;
        if (t.i()) {
            if (!this.n) {
                this.l.a(com.google.android.finsky.utils.aw.a(FinskyApp.a(), t.h()));
                return;
            }
            return;
        }
        if (!this.e && t.a()) {
            if (this.o == null) {
                this.o = t.f1970a;
            }
            if (this.o != null) {
                com.google.android.finsky.a.i.a(this.u, this.o.f1963a.R);
            }
            this.l.b();
            if (this.n) {
                return;
            }
            boolean z = this.m != null;
            this.j.a(this.g);
            this.j.a(this.k, this.o, this.s, this.t, this.w, z ? this.m.c : null, this.x, this, this.i, this.z);
            if (!z && f1710a) {
                PlayRecyclerView playRecyclerView = (PlayRecyclerView) this.k.findViewById(R.id.tab_recycler_view);
                Animation loadAnimation = AnimationUtils.loadAnimation(playRecyclerView.getContext(), R.anim.slide_in_bottom);
                loadAnimation.setInterpolator(new android.support.v4.view.b.b());
                loadAnimation.setDuration(this.f);
                LayoutAnimationController layoutAnimationController = new LayoutAnimationController(loadAnimation);
                layoutAnimationController.setDelay(0.1f);
                playRecyclerView.setLayoutAnimation(layoutAnimationController);
            }
            this.m = null;
            this.n = true;
            return;
        }
        this.l.a();
    }

    @Override // com.google.android.finsky.layout.by
    public final void n_() {
        T t = this.g.f1988a;
        t.e();
        t.g = null;
        t.q();
        d();
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        d();
    }

    @Override // com.google.android.finsky.activities.hc
    public final void a(boolean z) {
        if (z != this.p) {
            if (!z) {
                this.v.a(false);
            } else {
                T t = this.g.f1988a;
                if (this.y && !t.a() && !t.u()) {
                    t.q();
                }
                com.google.android.finsky.a.i.c(this.v);
                this.v.a(true);
                if (this.v.getPlayStoreUiElement().f.length == 0) {
                    com.google.android.finsky.a.i.a(this.k);
                }
            }
            this.p = z;
            if (this.z != null) {
                com.google.android.finsky.layout.em emVar = this.z;
                emVar.f = z;
                if (!z) {
                    emVar.b();
                } else {
                    if (emVar.h.f) {
                        return;
                    }
                    emVar.a();
                }
            }
        }
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final com.google.android.finsky.a.ai getPlayStoreUiElement() {
        return this.u;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final com.google.android.finsky.layout.play.cy getParentNode() {
        return this.v;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(com.google.android.finsky.layout.play.cy cyVar) {
        com.google.android.finsky.a.i.a(this, cyVar);
    }
}
