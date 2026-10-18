package com.google.android.finsky.activities;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.play.PlayHighlightsBannerItemView;
import com.google.android.finsky.layout.play.PlayHighlightsBannerView;

/* renamed from: com.google.android.finsky.activities.do, reason: invalid class name */
/* loaded from: classes.dex */
final class Cdo implements com.google.android.finsky.adapters.af, com.google.android.finsky.api.model.x, com.google.android.finsky.layout.play.co {
    private static final boolean i;

    /* renamed from: a, reason: collision with root package name */
    com.google.android.finsky.api.model.i f1689a;

    /* renamed from: b, reason: collision with root package name */
    Document f1690b;
    PlayHighlightsBannerView c;
    dn d;
    int e;
    com.google.android.finsky.adapters.ad f;
    final Bundle g;
    final LayoutInflater h;
    private boolean j;
    private com.google.android.finsky.layout.play.cy k;
    private final com.google.android.finsky.api.b l;
    private final Context m;
    private final com.google.android.play.image.e n;
    private final com.google.android.finsky.navigationmanager.b o;
    private final com.google.android.finsky.layout.t p;
    private final android.support.v7.widget.eg q;
    private final int r;
    private final Handler s;
    private final boolean t;
    private final float u = 0.8f;

    static {
        i = Build.VERSION.SDK_INT >= 21;
    }

    public Cdo(int i2, com.google.android.finsky.api.b bVar, Context context, LayoutInflater layoutInflater, com.google.android.play.image.e eVar, com.google.android.finsky.navigationmanager.b bVar2, com.google.android.finsky.layout.play.cy cyVar, com.google.android.finsky.layout.t tVar, android.support.v7.widget.eg egVar, com.google.android.finsky.api.model.i iVar, com.google.android.finsky.utils.dx dxVar) {
        this.r = i2;
        this.l = bVar;
        this.m = context;
        this.h = layoutInflater;
        this.n = eVar;
        this.o = bVar2;
        this.p = tVar;
        this.q = egVar;
        this.k = cyVar;
        if (dxVar != null && dxVar.a("HighlightsTab.ScrollState")) {
            this.g = (Bundle) dxVar.b("HighlightsTab.ScrollState");
        } else {
            this.g = new Bundle();
        }
        this.t = (FinskyApp.a().e().a(12605163L) || com.google.android.finsky.c.d.fo.b().booleanValue()) && (bVar2.q() == 1);
        this.s = new Handler(Looper.getMainLooper());
        this.f1689a = iVar;
        if (!this.t) {
            a();
        }
    }

    @Override // com.google.android.finsky.api.model.x
    public final void m_() {
        if (this.f1689a.a() && this.c != null) {
            this.f1690b = ((com.google.android.finsky.api.model.d) this.f1689a).f1970a;
            this.f = new com.google.android.finsky.adapters.ad(this.m, this.n, this.o, this.f1690b, this.f1689a, this.c, this.u);
            this.f.f1885a = this;
            this.c.a(this.f, this.p, 1, this.q, this.g, this.k, this.f1690b.f1963a.R);
            a(this.j);
            if (this.d == null) {
                return;
            }
            dn dnVar = this.d;
            int i2 = this.r;
            Document document = this.f1690b;
            b(this.e);
            dnVar.a(i2, document);
            this.s.postDelayed(new dp(this), 500L);
        }
    }

    @Override // com.google.android.finsky.layout.play.co
    public final void a(int i2) {
        if (this.e != i2) {
            if (i) {
                if (this.m.getResources().getBoolean(R.bool.use_wide_layout_for_highlights_banner) && this.c != null) {
                    PlayHighlightsBannerItemView c = this.c.c(i2);
                    if (c != null) {
                        c.setElevation(r0.getDimensionPixelSize(R.dimen.highlight_banner_selected_item_elevation));
                    }
                    PlayHighlightsBannerItemView c2 = this.c.c(this.e);
                    if (c2 != null) {
                        c2.setElevation(0.0f);
                    }
                }
            }
            this.e = i2;
            if ((this.d == null || this.f == null || this.f1690b == null || !this.j) ? false : true) {
                int b2 = b(i2);
                this.d.a(b2);
                if (this.c.b(this.e)) {
                    this.d.a(this.r, b2);
                } else {
                    this.s.postDelayed(new dq(this), 500L);
                }
            }
        }
    }

    public final int b(int i2) {
        if (this.f == null) {
            return 0;
        }
        return this.f.b(i2);
    }

    public final void a(boolean z) {
        this.j = z;
        if (this.c != null && z) {
            com.google.android.finsky.a.i.a(this.c);
        }
    }

    @Override // com.google.android.finsky.adapters.af
    public final void c(int i2) {
        this.s.post(new dr(this, i2));
    }

    public final void a() {
        if (!this.f1689a.a()) {
            this.f1689a.a(this);
            if (!this.f1689a.u()) {
                this.f1689a.q();
            }
        }
    }
}
